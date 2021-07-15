package aima.core.search.csp.examples;

import java.util.ArrayList;
import java.util.Optional;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.CSP;
import aima.core.search.csp.Variable;
import aima.core.search.csp.solver.CspHeuristics;
import aima.core.search.csp.solver.CspSolver;
import aima.core.search.csp.solver.FlexibleBacktrackingSolver;
import aima.core.search.csp.solver.inference.ForwardCheckingStrategy;

public class testeCaso33 {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static void main(String[] args) {
		
		CspSolver<Variable, String> solver;
		Optional<Assignment<Variable, String>> solution;
		
		
		System.out.println("Tabela da Semana");
		
		
		
		
		System.out.println("====================Testes para o Exemplo1====================");
		solver = new FlexibleBacktrackingSolver<Variable, String>().set(CspHeuristics.mrvDeg()).set(new ForwardCheckingStrategy<>());
		int caso = 3;
		//solver = new FlexibleBacktrackingSolver<Variable, String>().set(CspHeuristics.mrvDeg());
		//solver = new FlexibleBacktrackingSolver<>();
		int[] horariosPIBITI = {};
		//int[] horariosPIBITI = {8,8,8,8,8};
		//int[] horariosPIBIC = {4,4,4,4,4};
		int[] horariosPIBIC = {};
		int[] horariosEstagio = {6,7,7,6,3,7};
		//int[] horariosTrabalho = {8,8,2,4,12,2};
		int[] horariosTrabalho = {};
		ArrayList<AtividadesComp> atividades = new ArrayList<>();
		//atividades.add(new AtividadesComp("Palestra",0,3));
		//atividades.add(new AtividadesComp("Palestra",2,3));
		//atividades.add(new AtividadesComp("Voluntaria",1,3));
		ArrayList<BlocoDeEstudo> blocos = new ArrayList<>();
		blocos.add(new BlocoDeEstudo("COMP0412",1));
		blocos.add(new BlocoDeEstudo("COMP0415",2));
		blocos.add(new BlocoDeEstudo("COMP0409",1));
		blocos.add(new BlocoDeEstudo("COMP0417",1));
		blocos.add(new BlocoDeEstudo("ELET0043",2));
		blocos.add(new BlocoDeEstudo("ESTAT0011",1));
		blocos.add(new BlocoDeEstudo("MAT0096",3));
		blocos.add(new BlocoDeEstudo("MAT0154",1));
		

		ArrayList<Descanso> descanso = new ArrayList<>();
		descanso.add(new Descanso("Descanso",0,14));
		descanso.add(new Descanso("Descanso",1,18));
		descanso.add(new Descanso("Descanso",2,16));
		descanso.add(new Descanso("Descanso",3,17));
		descanso.add(new Descanso("Descanso",4,15));
		CSP<Variable, String> cspdia = new MapSemana(caso, horariosPIBITI, horariosPIBIC, atividades,horariosEstagio,horariosTrabalho, blocos,descanso);
		

		new TestaDeTudo( cspdia);
	}

}
