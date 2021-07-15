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

public class testeCaso31 {
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
		int[] horariosPIBITI = {8,7,7,8,10};
		int[] horariosPIBIC = {};
		int[] horariosEstagio = {};
		int[] horariosTrabalho = {0,0,0,0,1,10};
		ArrayList<AtividadesComp> atividades = new ArrayList<>();
		ArrayList<BlocoDeEstudo> blocos = new ArrayList<>();
		blocos.add(new BlocoDeEstudo("COMP0412",1));
		blocos.add(new BlocoDeEstudo("COMP0415",2));
		blocos.add(new BlocoDeEstudo("COMP0409",1));
		blocos.add(new BlocoDeEstudo("COMP0417",1));
		blocos.add(new BlocoDeEstudo("COMP0461",1));
		blocos.add(new BlocoDeEstudo("ELET0043",2));
		blocos.add(new BlocoDeEstudo("ESTAT0011",1));
		blocos.add(new BlocoDeEstudo("MAT0096",1));
		blocos.add(new BlocoDeEstudo("MAT0154",1));
		blocos.add(new BlocoDeEstudo("COMP0412",1));

		ArrayList<Descanso> descanso = new ArrayList<>();
	
		descanso.add(new Descanso("Descanso",4,7));
		CSP<Variable, String> cspdia = new MapSemana(caso, horariosPIBITI, horariosPIBIC, atividades,horariosEstagio,horariosTrabalho, blocos,descanso);
		
		new TestaDeTudo( cspdia);
	}

}
