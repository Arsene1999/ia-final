package aima.core.search.csp.examples;

import java.util.ArrayList;

/*
 * Função utilizada para printar o resultado em uma tabela
 * de maneira bonita recebe um ArrayList de Resposta e 
 * não retorna nada  
 * */
public class PrintTabela {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_Magenta = "\u001B[35m";
	public PrintTabela(ArrayList<Resposta> res) {
		Resposta[][] tabela = new Resposta[6][20];
		String stringnull = new String("-");
		for(Resposta var : res) {
			tabela[var.getDia()] [var.getTempo()] = var;
			
		}
		
		int mv = 0;
		
		for (int i = 0; i < 20; i++) { 
	         for (int j = 0; j <6; j++) { 
	        	 if (tabela[j][i] != null && tabela[j][i].getName().length() > mv) {
	        		mv = tabela[j][i].getName().length();
	        	 }
	         }	 
		}
		System.out.println("=====================================================================================================");
		System.out.println ("  HORARIO " + " [   SEGUNDA " + "  ][    TERÇA  " + "  ][    QUARTA " + "  ][    QUINTA  " + " ][    SEXTA    " + "][    SÁBADO   ]");
		System.out.println("=====================================================================================================");
		for (int i = 0; i < 20; i++) { 
			if (i<9) System.out.print("Horário 0"+ (i+1) + " ");
			else System.out.print("Horário "+ (i+1) + " ");
	         for (int j = 0; j <6; j++) { 
	        	 if ( tabela[j][i] == null ) {
	        		 if (stringnull.length() < mv) {
	        			 for (int k = stringnull.length(); k < mv; k++) {
	        				 stringnull = stringnull.concat("-");
	        			 }
	        		 }
	        		 System.out.print("[ " + stringnull + " ]");
	        	 }
	        	 else {
	        		 if (tabela[j][i].getName().length() < mv) {
	        			 for (int k = tabela[j][i].getName().length(); k < mv; k++) {
	        				 tabela[j][i].setName(tabela[j][i].getName().concat("-") );
	        			 }
	        		 }
	        		 if (tabela[j][i].getName().startsWith("Trabalho") || tabela[j][i].getName().startsWith("Estagio") )
	        		 	System.out.print("[ " + ANSI_RED +  tabela[j][i].getName() + ANSI_RESET + " ]");
	        		 else if (tabela[j][i].getName().startsWith("COMP") || tabela[j][i].getName().startsWith("ESTAT") || tabela[j][i].getName().startsWith("MAT") || tabela[j][i].getName().startsWith("ELET"))
		        		 	System.out.print("[ " + ANSI_BLUE +  tabela[j][i].getName() + ANSI_RESET + " ]");
	        		 else if (tabela[j][i].getName().startsWith("PIBIT") || tabela[j][i].getName().startsWith("PIBIC"))
		        		 	System.out.print("[ " + ANSI_GREEN +  tabela[j][i].getName() + ANSI_RESET + " ]");
	        		 else if (tabela[j][i].getName().startsWith("Descanso"))
		        		 	System.out.print("[ " + ANSI_CYAN +  tabela[j][i].getName() + ANSI_RESET + " ]");
	        		 else if (tabela[j][i].getName().startsWith("Est"))
	        			 System.out.print("[ " + ANSI_YELLOW +  tabela[j][i].getName() + ANSI_RESET + " ]");
	        		 else
	        			 System.out.print("[ " + ANSI_Magenta +  tabela[j][i].getName() + ANSI_RESET + " ]");
	        	 }
	         }
	         System.out.print("\n");
		}
	}
}
