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

public class testeCaso1Terceiro {
	public static void main(String[] args) {
		
		CspSolver<Variable, String> solver;
		Optional<Assignment<Variable, String>> solution;
		System.out.println("Tabela da Semana Caso1 1");
		System.out.println("====================Testes para o Exemplo1====================");
		solver = new FlexibleBacktrackingSolver<Variable, String>().set(CspHeuristics.mrvDeg()).set(new ForwardCheckingStrategy<>());
		int caso = 1;
		int[] horariosPIBITI = {};
		int[] horariosPIBIC = {8,8,8,8,8};
		int[] horariosEstagio = {2,2,2,2,2};
		int[] horariosTrabalho = {};
		ArrayList<AtividadesComp> atividades = new ArrayList<>();
		atividades.add(new AtividadesComp("Palestra",0,3));
		atividades.add(new AtividadesComp("Palestra",2,3));
		atividades.add(new AtividadesComp("Voluntaria",1,3));
		atividades.add(new AtividadesComp("Voluntaria",5,5));
		atividades.add(new AtividadesComp("Voluntaria",5,5));
		
		ArrayList<BlocoDeEstudo> blocos = new ArrayList<>();
		blocos.add(new BlocoDeEstudo("COMP0408",1));
		blocos.add(new BlocoDeEstudo("COMP0408",1));
		blocos.add(new BlocoDeEstudo("COMP0455",1));
		blocos.add(new BlocoDeEstudo("COMP0455",1));
		blocos.add(new BlocoDeEstudo("COMP0481",1));
		
		
		ArrayList<Descanso> descanso = new ArrayList<>();
		descanso.add(new Descanso("Descanso",0,1));
		descanso.add(new Descanso("Descanso",0,9));
		descanso.add(new Descanso("Descanso",1,9));
		descanso.add(new Descanso("Descanso",1,10));
		descanso.add(new Descanso("Descanso",3,9));
		descanso.add(new Descanso("Descanso",3,10));
		descanso.add(new Descanso("Descanso",4,9));
		descanso.add(new Descanso("Descanso",5,9));
		descanso.add(new Descanso("Almoco",1,11));
		descanso.add(new Descanso("Almoco",0,8));
		CSP<Variable, String> cspdia = new MapSemana(caso, horariosPIBITI, horariosPIBIC, atividades,horariosEstagio,horariosTrabalho, blocos,descanso);
		
		solution = solver.solve(cspdia);
		ArrayList<Resposta> res = solution.get().RetornaOMapa();
		new PrintTabela(res);
		
		
	}

}