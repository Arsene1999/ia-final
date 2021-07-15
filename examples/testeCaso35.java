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

public class testeCaso35 {
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
		int[] horariosEstagio = {};
		//int[] horariosTrabalho = {8,8,2,4,12,2};
		int[] horariosTrabalho = {0,0,0,0,1,10};
		ArrayList<AtividadesComp> atividades = new ArrayList<>();
		atividades.add(new AtividadesComp("Palestra",0,5));
		atividades.add(new AtividadesComp("Palestra",2,3));
		atividades.add(new AtividadesComp("Palestra",1,3));
		ArrayList<BlocoDeEstudo> blocos = new ArrayList<>();
		blocos.add(new BlocoDeEstudo("COMP0412",1));
		blocos.add(new BlocoDeEstudo("COMP0415",3));
		blocos.add(new BlocoDeEstudo("COMP0409",3));
		blocos.add(new BlocoDeEstudo("COMP0417",3));
		blocos.add(new BlocoDeEstudo("COMP0461",6));
		blocos.add(new BlocoDeEstudo("ELET0043",5));
		blocos.add(new BlocoDeEstudo("ESTAT0011",4));
		blocos.add(new BlocoDeEstudo("MAT0096",5));
		blocos.add(new BlocoDeEstudo("MAT0154",2));
		blocos.add(new BlocoDeEstudo("COMP0412",2));

		ArrayList<Descanso> descanso = new ArrayList<>();
		
		descanso.add(new Descanso("Descanso",4,7));
		CSP<Variable, String> cspdia = new MapSemana(caso, horariosPIBITI, horariosPIBIC, atividades,horariosEstagio,horariosTrabalho, blocos,descanso);
		
		solution = solver.solve(cspdia);
		//solution.ifPresent(System.out::println);
		
		ArrayList<Resposta> res = solution.get().RetornaOMapa();
		new PrintTabela(res);
	}

}
