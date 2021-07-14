package aima.core.search.csp.examples;

import java.util.ArrayList;

public class PrintTabela {
	public PrintTabela(ArrayList<Resposta> res) {
		Resposta[][] tabela = new Resposta[6][20];
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
		System.out.println("===============================================================================================");
		System.out.println ("  HORARIO " + " [  SEGUNDA " + "  ][   TERÇA  " + "  ][   QUARTA " + "  ][   QUINTA  " + " ][   SEXTA    " + "][   SÁBADO   ]");
		System.out.println("===============================================================================================");
		for (int i = 0; i < 20; i++) { 
			if (i<9) System.out.print("Horário 0"+ (i+1) + " ");
			else System.out.print("Horário "+ (i+1) + " ");
	         for (int j = 0; j <6; j++) { 
	        	 if ( tabela[j][i] == null ) {
	        		 System.out.print("[ ---------- ]");
	        	 }
	        	 else {
	        		 if (tabela[j][i].getName().length() < mv) {
	        			 for (int k = tabela[j][i].getName().length(); k < mv; k++) {
	        				 tabela[j][i].setName(tabela[j][i].getName().concat("-") );
	        			 }
	        		 }
	        		 System.out.print("[ " +  tabela[j][i].getName() + " ]");
	        	 }
	         }
	         System.out.print("\n");
		}
	}
}
