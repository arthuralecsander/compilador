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
    Scope currentScope; // define symbols in this scope

    @Override
    public void enterProgram(DecafParser.ProgramContext ctx) {        
        globals = new GlobalScope(null);

        for(int i = 0; i < ctx.var_decl().size(); i++){
            
            for (int j=0; j<ctx.var_decl().get(i).ID().size(); j++){
             String globals = ctx.var_decl().get(i).ID().get(j).getText();
            }
        }
        pushScope(globals);
    }

    @Override
    public void exitProgram(DecafParser.ProgramContext ctx) {
        String variaveis = "";
        String variaveis_nome = "";
        String variaveis_tipo = "";
        String metodos = "";
        String metodo_nome = "";
        String motodos_tipo = "";
        String escopo = "";
        popScope();
    }

    @Override public void enterMethod_call(DecafParser.Method_callContext ctx) { }

	@Override public void exitMethod_call(DecafParser.Method_callContext ctx) { }

    @Override public void enterMethod_decl(DecafParser.Method_declContext ctx) { 
        String nome = ctx.ID().getText();
        Escopos.add(ctx.ID().getText());

        FunctionSymbol function = new FunctionSymbol(nome);

        currentScope.define(function);
        saveScope(ctx, function);
        pushScope(function);

        String t_void = ctx.VOID().getText();
        String tipo = ctx.type().getText();
        if(t_void.equals("void")){
            for(int cont1 = 0; cont1<ctx.block_decl().statement_decl().size(); cont1++){
                String returns = ctx.block_decl().statement_decl().get(cont1).RETURN().getText();

                if(returns.equals("return")){
                    this.error(ctx.block_decl().statement_decl().get(cont1).RETURN().getSymbol(), "Void nao pode ter return "+ctx.ID().getText() );
                    System.exit(0);
                }
            }
        }
        if(tipo.equals("int")) {

            for(int cont1 = 0; cont1<ctx.block_decl().statement_decl().size(); cont1++){
                String returns = ctx.block_decl().statement_decl().get(cont1).RETURN().getText();
                if(returns.equals("return")){
                    for(int cont2 = 0; cont2<ctx.block_decl().statement_decl().size(); cont2++){
                        String tipoReturn = ctx.block_decl().statement_decl().get(cont1).expr_decl().get(cont2).getText();
                        if(tipoReturn.matches("[a-z]+")){
                            this.error(ctx.block_decl().statement_decl().get(cont1).RETURN().getSymbol(), "Faltando return "+ctx.ID().getText());
                            System.exit(0);
                        }
                    }
                }

            }
        }

    }

	@Override public void exitMethod_decl(DecafParser.Method_declContext ctx) { 
        popScope();
    }



    @Override public void enterStatement_decl(DecafParser.Statement_declContext ctx) {
    try { 
        int i =0;
        String statement = ctx.location_decl().ID().getText();
            if(!Variaveis.contains(statement)){  
                this.error(ctx.location_decl().ID().getSymbol(), "Variavel nao declarada : "+statement);
                System.exit(0);
            } 
    }catch (Exception e) {  }

    try {
        String metodo = ctx.IF().getText();
        if(metodo.equals("if")){
            for(int i =0; i<ctx.expr_decl().size(); i++){
                String value =ctx.expr_decl().get(i).getText();            
                if(!value.contains("<") && !value.contains(">") && !value.contains("==") && !value.contains("=<") && !value.contains("=>") ){
                    this.error(ctx.IF().getSymbol(), "Error if: "+value);
                    System.exit(0);
                }
            }
            
        }
    }catch (Exception e) {  }

    try {
        String metodo = ctx.FOR().getText();
        if(metodo.equals("for")){
            for(int i =0; i<ctx.expr_decl().size(); i++){
                String forIgualdade = ctx.expr_decl().get(0).getText();
                if(forIgualdade.matches("[a-z]+")){
                    this.error(ctx.FOR().getSymbol(), "Condicao inicial incorreta : "+forIgualdade);
                    System.exit(0);
                }
            }
        }

    }catch (Exception e) {  }

     }

     @Override public void exitStatement_decl(DecafParser.Statement_declContext ctx) {


     }

    @Override public void enterArray_decl(DecafParser.Array_declContext ctx) { 
        String val = ctx.INT().getText();
        if(Integer.parseInt(val)<=0){
            this.error(ctx.INT().getSymbol(),"Erro no tamanho do array"+val);
            System.exit(0);
        }
    }

	@Override public void exitArray_decl(DecafParser.Array_declContext ctx) { 
        
    }



    /*@Override
    public void enterBlock(DecafParser.BlockContext ctx) {
        LocalScope l = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
        // pushScope(l);
    }

    @Override
    public void exitBlock(DecafParser.BlockContext ctx) {
        popScope();
    }*/
    
    @Override
    public void enterType_id(DecafParser.Type_idContext ctx) {
        for(int i = 0 ; i < ctx.ID().size(); i++){
            defineVar(ctx.type(), ctx.ID(i).getSymbol());
        }
    }

    @Override
    public void exitType_id(DecafParser.Type_idContext ctx) {
        for(int i = 0 ; i < ctx.ID().size(); i++){
            String name = ctx.ID(i).getSymbol().getText();
            Symbol defineVar = currentScope.resolve(name);
            if (defineVar == null){
                this.error(ctx.ID(i).getSymbol(), "no variable: "+ name);
            }
            if (defineVar instanceof FunctionSymbol){
                 this.error(ctx.ID(i).getSymbol(), "is not a variable: "+ name);

            }
    }
    }

    @Override public void enterVar_decl(DecafParser.Var_declContext ctx) {
        String variaveisLocal = "";
        for(int cont1 = 0; cont1<ctx.ID().size(); cont1++){
            variaveisLocal = variaveisLocal + ctx.ID().get(cont1).getText()+", ";
            Variaveis.add(ctx.ID().get(cont1).getText());
            defineVar(ctx.type(), ctx.ID().get(cont1).getSymbol());
        }  
    }
    
	@Override public void exitVar_decl(DecafParser.Var_declContext ctx) { 
            for(int cont1 = 0; cont1<ctx.ID().size(); cont1++){
            String nome = ctx.ID().get(cont1).getSymbol().getText();
            Symbol variavel = currentScope.resolve(nome);

            if (variavel == null){
                this.error(ctx.ID().get(cont1).getSymbol(), "Nao existe esta variavel:"+nome );
                System.exit(0);
            } else if (variavel instanceof FunctionSymbol ){
                this.error(ctx.ID().get(cont1).getSymbol(), "Nao e uma variavel: "+nome);
                System.exit(0);
            }
        }
    }

    void defineVar(DecafParser.TypeContext typeCtx, Token nameToken) {
        int typeTokenType = typeCtx.start.getType();
        VariableSymbol var = new VariableSymbol(nameToken.getText());

        // DecafSymbol.Type type = this.getType(typeTokenType);
        // var.setType(type);

        currentScope.define(var); // Define symbol in current scope
    }

    /**
     * Método que atuliza o escopo para o atual e imprime o valor
     *
     * @param s
     */
    private void pushScope(Scope s) {
        currentScope = s;
        System.out.println("entering: "+currentScope.getName()+":"+s);
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
        System.out.println("leaving: "+currentScope.getName()+":"+currentScope);
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
        switch ( tokenType ) {
            case DecafParser.VOID :  return DecafSymbol.Type.tVOID;
            case DecafParser.T_INT :   return DecafSymbol.Type.tINT;
        }
        return DecafSymbol.Type.tINVALID;
    }

}
