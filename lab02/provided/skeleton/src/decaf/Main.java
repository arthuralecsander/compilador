package decaf;

import java.io.*;
//import antlr.Token;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java6035.tools.CLI.*;
import decaf.DecafSymbolsAndScopes;

class Main {
    static int lag = 1000;
    static int alt = 700;

    public static void main(String[] args) {
        try {
        	CLI.parse (args, new String[0]);

        	InputStream inputStream = args.length == 0 ?
                    System.in : new java.io.FileInputStream(CLI.infile);

        	if (CLI.target == CLI.SCAN)
        	{
        		DecafLexer lexer = new DecafLexer(new ANTLRInputStream(inputStream));
        		Token token;
        		boolean done = false;
        		while (!done)
        		{
        			try
        			{
		        		for (token=lexer.nextToken(); token.getType()!=Token.EOF; token=lexer.nextToken())
		        		{
		        			String type = "";
		        			String text = token.getText();

		        			switch (token.getType())
		        			{
		        			case DecafLexer.ID:
		        				type = " IDENTIFIER";
		        				break;		
                            case DecafLexer.MUNDCHAR:
                                type = " CHARLITERAL";
                                break;
                            case DecafLexer.INT:
                                type = " INTLITERAL";
                                break;
                            case DecafLexer.STRING_:
                                type = " STRINGLITERAL";
                                break;
                            case DecafLexer.BOOL:
                                type = " BOOLEANLITERAL";
                                break;
                            }
		        			System.out.println (token.getLine() + type + " " + text);
		        		}
		        		done = true;
        			} catch(Exception e) {
        	        	// print the error:
        	            System.out.println(CLI.infile+" "+e);
        	            lexer.skip();
        	        }
        		}
        	}
        	else if (CLI.target == CLI.PARSE || CLI.target == CLI.DEFAULT)
            {
                // Primeiro faz o parsing da cadeia
                DecafLexer lexer = new DecafLexer(new ANTLRInputStream(inputStream));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                DecafParser parser = new DecafParser(tokens);

                // Adiciona as regras semÃ¢nticas
                ParseTree tree = parser.program();

                //show AST in console
                System.out.println(tree.toStringTree(parser));

                if (CLI.debug) {
                    // Se estiver no modo debug imprime a Ã¡rvore de parsing
                    // Create Tree View
                    // Source: https://stackoverflow.com/questions/23809005/how-to-display-antlr-tree-gui


                    //show AST in GUI
                    JFrame frame = new JFrame("Antlr AST");
                    JPanel panel = new JPanel();
                    TreeViewer viewr = new TreeViewer(Arrays.asList(
                            parser.getRuleNames()),tree);
                    viewr.setScale(1.5);//scale a little
                    panel.add(viewr);
                    JScrollPane scroll = new JScrollPane(panel);
                    frame.add(scroll);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(lag,alt);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }

            } else if (CLI.target == CLI.INTER) {
                // Primeiro faz o parsing da cadeia
                DecafLexer lexer = new DecafLexer(new ANTLRInputStream(inputStream));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                DecafParser parser = new DecafParser(tokens);

                // Adiciona as regras semânticas
                ParseTree tree = parser.program();

                // Realiza o parsing do programa
                DecafSymbolsAndScopes def = new DecafSymbolsAndScopes();
                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(def, tree);

                //show AST in console
                System.out.println(tree.toStringTree(parser));

                if (CLI.debug) {
                    // Se estiver no modo debug imprime a árvore de parsing
                    // Create Tree View
                    // Source: https://stackoverflow.com/questions/23809005/how-to-display-antlr-tree-gui


                    //show AST in GUI
                    JFrame frame = new JFrame("Antlr AST");
                    JPanel panel = new JPanel();
                    TreeViewer viewr = new TreeViewer(Arrays.asList(
                            parser.getRuleNames()),tree);
                    viewr.setScale(1.5);//scale a little
                    panel.add(viewr);
                    JScrollPane scroll = new JScrollPane(panel);
                    frame.add(scroll);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(lag,alt);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }

            }
            
        } catch(Exception e) {
            // print the error:
            System.out.println(CLI.infile+" "+e);
        }
    }
}
