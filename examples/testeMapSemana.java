package aima.core.search.csp.examples;

import java.util.ArrayList;
import java.util.Optional;

import com.sun.tools.javac.util.List;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.CSP;
import aima.core.search.csp.Variable;
import aima.core.search.csp.solver.CspHeuristics;
import aima.core.search.csp.solver.CspListener;
import aima.core.search.csp.solver.CspSolver;
import aima.core.search.csp.solver.FlexibleBacktrackingSolver;
import aima.core.search.csp.solver.inference.ForwardCheckingStrategy;


public class testeMapSemana {
	public static void main(String[] args) {
		
		CspSolver<Variable, String> solver;
		Optional<Assignment<Variable, String>> solution;
		
		
		System.out.println("Tabela da Semana");
		
		
		
		
		System.out.println("====================Testes para o Exemplo1====================");
		solver = new FlexibleBacktrackingSolver<Variable, String>().set(CspHeuristics.mrvDeg()).set(new ForwardCheckingStrategy<>());
		int caso = 1;
		//solver = new FlexibleBacktrackingSolver<Variable, String>().set(CspHeuristics.mrvDeg());
		//solver = new FlexibleBacktrackingSolver<>();
		int[] horariosPIBITI = {};
		//int[] horariosPIBITI = {8,8,8,8,8};
		//int[] horariosPIBIC = {4,4,4,4,4};
		int[] horariosPIBIC = {};
		int[] horariosEstagio = {};
		int[] horariosTrabalho = {8,8,8,4,12,2};
		ArrayList<AtividadesComp> atividades = new ArrayList<>();
		atividades.add(new AtividadesComp("Palestra",0,3));
		atividades.add(new AtividadesComp("Palestra",2,3));
		atividades.add(new AtividadesComp("Voluntaria",1,3));
		ArrayList<BlocoDeEstudo> blocos = new ArrayList<>();
		blocos.add(new BlocoDeEstudo("COMP408",3));
		blocos.add(new BlocoDeEstudo("COMP455",3));
		blocos.add(new BlocoDeEstudo("COMP481",3));
		
		CSP<Variable, String> cspdia = new MapSemana(caso, horariosPIBITI, horariosPIBIC, atividades,horariosEstagio,horariosTrabalho, blocos);
		
		solution = solver.solve(cspdia);
		//solution.ifPresent(System.out::println);
		
		ArrayList<Resposta> res = solution.get().RetornaOMapa();
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
