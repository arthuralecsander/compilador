package decaf;

import org.antlr.symtab.FunctionSymbol;
import org.antlr.symtab.GlobalScope;
import org.antlr.symtab.LocalScope;
import org.antlr.symtab.Scope;
import org.antlr.symtab.VariableSymbol;
import org.antlr.symtab.Symbol;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import java.util.ArrayList;

public class DecafSymbolsAndScopes extends DecafParserBaseListener {

    ArrayList<String> Escopos = new ArrayList();
    ArrayList<String> Variaveis = new ArrayList();
    ArrayList<String> Metodos = new ArrayList();

    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope;

    @Override
    public void enterProgram(DecafParser.ProgramContext ctx) {
        globals = new GlobalScope(null);

        for (int a = 0; a < ctx.var_decl().size(); a++) {
            for (int j = 0; j < ctx.var_decl().get(a).ID().size(); j++) {
                String globals = ctx.var_decl().get(a).ID().get(j).getText();
            }
        }

        pushScope(globals);
    }

    @Override
    public void exitProgram(DecafParser.ProgramContext ctx) {
        String escopo = "";
        String vars = "";
        String metodos = "";
        String tipo_metodo = "";
        String nome_metodo = "";
        String var_tipo_metodo = "";
        String var_name_metodo = "";
        popScope();

        try {

            for (int a = 0; a < ctx.method_decl().size(); a++) {
                escopo = ctx.method_decl().get(a).ID().getText();

                if (!Escopos.contains(escopo)) {
                    this.error(ctx.method_decl().get(a).ID().getSymbol(), "Escopo nao declarado: " + escopo);
                    System.exit(0);
                }
            }

            if (!Escopos.contains("main")) {
                this.error(ctx.method_decl().get(0).ID().getSymbol(), "Main nao declarado");
                System.exit(0);
            }

        } catch (Exception e) {
        }

        try {
            int quantidadeV = 0;
            int quantidadeVM = 0;
            String tipoVariavel = "";
            String nomeVariavel = "";
            String tipoAtual[] = new String[10];
            int contador1 = 0;
            int contador2 = 0;
            for (int a = 0; a < ctx.method_decl().size(); a++) {
                tipoVariavel = ctx.method_decl().get(a).type().getText();
                nomeVariavel = ctx.method_decl().get(a).ID().getText();

                if (tipoVariavel.equals("int")) {
                    for (int b = 0; b < ctx.method_decl().get(a).var_decl().size(); b++) {
                        tipoAtual[contador1] = ctx.method_decl().get(a).var_decl().get(b).type().getText();
                        contador1++;
                        quantidadeV++;
                    }
                }

                for (int b = 0; b < ctx.method_decl().get(1).block_decl().statement_decl().size(); b++) {
                    for (int c = 0; c < ctx.method_decl().get(1).block_decl().statement_decl().get(b).expr_decl().size(); c++) {
                        String metodoName = ctx.method_decl().get(1).block_decl().statement_decl().get(b).expr_decl().get(c).method_call().ID().getText();

                        if (nomeVariavel.equals(metodoName)) {
                            for (int d = 0; d < ctx.method_decl().get(1).block_decl().statement_decl().get(b).expr_decl().get(c).method_call().expr_decl().size(); d++) {
                                String varAtualMetodo = ctx.method_decl().get(1).block_decl().statement_decl().get(b).expr_decl().get(c).method_call().expr_decl().get(d).getText();
                                quantidadeVM++;

                                try {
                                    if (tipoAtual[contador2].equals("int")) {
                                        if (varAtualMetodo.matches("[a-z]+")) {
                                            this.error(ctx.method_decl().get(1).block_decl().statement_decl().get(b).expr_decl().get(c).method_call().ID().getSymbol(), "Erro, o metodo: " + nomeVariavel + ", no " + (contador2 + 1) + " valor, Espera um tipo " + tipoAtual[contador2] + ", e foi encontrado " + varAtualMetodo);
                                            System.exit(0);
                                        }
                                    }

                                    if (tipoAtual[contador2].equals("boolean")) {
                                        if (!varAtualMetodo.equals("true") && !varAtualMetodo.equals("false")) {
                                            this.error(ctx.method_decl().get(1).block_decl().statement_decl().get(b).expr_decl().get(c).method_call().ID().getSymbol(), "Erro, o metodo: " + nomeVariavel + ", no " + (contador2 + 1) + " valor, Espera um tipo " + tipoAtual[contador2] + ", e foi encontrado " + varAtualMetodo);
                                            System.exit(0);
                                        }
                                    }
                                } catch (Exception e) {
                                }

                                contador2++;

                            }
                            if (quantidadeVM > quantidadeV) {
                                this.error(ctx.method_decl().get(1).block_decl().statement_decl().get(b).expr_decl().get(c).method_call().ID().getSymbol(), "Erro, o metodo: " + nomeVariavel + " espera: " + quantidadeV + " Vars, foi encontrado: " + quantidadeVM);
                                System.exit(0);
                            }
                        }

                    }

                }
            }

        } catch (Exception e) {
        }

    }

    @Override
    public void enterMethod_decl(DecafParser.Method_declContext ctx) {
        String nome = ctx.ID().getText();
        Escopos.add(ctx.ID().getText());
        FunctionSymbol funcao = new FunctionSymbol(nome);
        currentScope.define(funcao);
        saveScope(ctx, funcao);
        pushScope(funcao);

        try {
            String tVoid = ctx.VOID().getText();
            if (tVoid.equals("void")) {

                for (int a = 0; a < ctx.block_decl().statement_decl().size(); a++) {
                    String returns = ctx.block_decl().statement_decl().get(a).RETURN().getText();

                    if (returns.equals("return")) {
                        this.error(ctx.block_decl().statement_decl().get(a).RETURN().getSymbol(), "Retorno nao disponivel pra esse metodo: " + ctx.ID().getText());
                        System.exit(0);
                    }
                }
            }
        } catch (Exception e) {
        }

    }

    @Override
    public void exitMethod_decl(DecafParser.Method_declContext ctx) {
        popScope();
    }

    @Override
    public void enterStatement_decl(DecafParser.Statement_declContext ctx) {
        try {
            String statement = ctx.location_decl().ID().getText();
            if (!Variaveis.contains(statement)) {
                this.error(ctx.location_decl().ID().getSymbol(), "Variavel nao delcarada: " + statement);
                System.exit(0);
            }
        } catch (Exception e) {
        }

        try {
            String metodo = ctx.IF().getText();
            if (metodo.equals("if")) {
                for (int a = 0; a < ctx.expr_decl().size(); a++) {
                    String value = ctx.expr_decl().get(a).getText();

                    if (!value.contains("<") && !value.contains(">") && !value.contains("==") && !value.contains("=<") && !value.contains("=>")) {
                        this.error(ctx.IF().getSymbol(), "Error de if: " + value);
                        System.exit(0);
                    }
                }

            }
        } catch (Exception e) {
        }

    }

    @Override
    public void exitStatement_decl(DecafParser.Statement_declContext ctx) {

    }

    @Override
    public void enterVar_decl(DecafParser.Var_declContext ctx) {
        String varsLocal = "";
        for (int a = 0; a < ctx.ID().size(); a++) {
            varsLocal = varsLocal + ctx.ID().get(a).getText() + ", ";
            Variaveis.add(ctx.ID().get(a).getText());
            defineVar(ctx.type(), ctx.ID().get(a).getSymbol());
        }
    }

    @Override
    public void exitVar_decl(DecafParser.Var_declContext ctx) {
        for (int a = 0; a < ctx.ID().size(); a++) {
            String name = ctx.ID().get(a).getSymbol().getText();
            Symbol var = currentScope.resolve(name);
            if (var == null) {
                this.error(ctx.ID().get(a).getSymbol(), "Variavel nao existe: " + name);
                System.exit(0);
            }
            if (var instanceof FunctionSymbol) {
                this.error(ctx.ID().get(a).getSymbol(), name + " nao e uma variavel");
                System.exit(0);
            }

        }
    }

    @Override
    public void enterArray_decl(DecafParser.Array_declContext ctx) {
        try {

            String valor = ctx.INT().getText();
            if (Integer.parseInt(valor) <= 0) {
                this.error(ctx.INT().getSymbol(), "Array com tamanho negativo ou 0: " + valor);
                System.exit(0);
            }

        } catch (Exception e) {
        }
    }

    @Override
    public void exitArray_decl(DecafParser.Array_declContext ctx) {

    }

    void defineVar(DecafParser.TypeContext typeCtx, Token nameToken) {
        int typeTokenType = typeCtx.start.getType();
        VariableSymbol var = new VariableSymbol(nameToken.getText());
        currentScope.define(var);
    }

    /**
     * Método que atuliza o escopo para o atual e imprime o valor
     *
     * @param s
     */
    private void pushScope(Scope s) {
        currentScope = s;
        System.out.println("entering: " + currentScope.getName() + ":" + s);
    }

    /**
     * Método que cria um novo escopo no contexto fornecido
     *
     * @param ctx
     * @param s
     */
    void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
    }

    /**
     * Muda para o contexto superior e atualia o escopo
     */
    private void popScope() {
        System.out.println("leaving: " + currentScope.getName() + ":" + currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    public static void error(Token t, String msg) {
        System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(),
                msg);
    }

    /**
     * Valida tipos encontrados na linguagem para tipos reais
     *
     * @param tokenType
     * @return
     */
    public static DecafSymbol.Type getType(int tokenType) {
        switch (tokenType) {
            case DecafParser.VOID:
                return DecafSymbol.Type.tVOID;
            case DecafParser.INT:
                return DecafSymbol.Type.tINT;
        }
        return DecafSymbol.Type.tINVALID;
    }

}
