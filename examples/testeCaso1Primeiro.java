package aima.core.search.csp.examples;

import java.util.ArrayList;
import java.util.Optional;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.CSP;
import aima.core.search.csp.Variable;
import aima.core.search.csp.solver.BackjumpingBacktrackingSolver;
import aima.core.search.csp.solver.CspHeuristics;
import aima.core.search.csp.solver.CspListener;
import aima.core.search.csp.solver.CspSolver;
import aima.core.search.csp.solver.FlexibleBacktrackingSolver;
import aima.core.search.csp.solver.MinConflictsSolver;
import aima.core.search.csp.solver.TreeCspSolver;
import aima.core.search.csp.solver.inference.AC3Strategy;
import aima.core.search.csp.solver.inference.ForwardCheckingStrategy;


public class testeCaso1Primeiro {
	public static void main(String[] args) {
		
		CspSolver<Variable, String> solver;
		Optional<Assignment<Variable, String>> solution;
		System.out.println("Tabela da Semana Caso1 1");
		System.out.println("====================Testes para o Exemplo1====================");
	
		int caso = 1;
		int[] horariosPIBITI = {8,8,8,8,8};
		int[] horariosPIBIC = {};
		int[] horariosEstagio = {};
		int[] horariosTrabalho = {};
		ArrayList<AtividadesComp> atividades = new ArrayList<>();
		atividades.add(new AtividadesComp("Palestra",0,3));
		atividades.add(new AtividadesComp("Palestra",2,3));
		atividades.add(new AtividadesComp("Voluntaria",5,3));
		ArrayList<BlocoDeEstudo> blocos = new ArrayList<>();
		blocos.add(new BlocoDeEstudo("COMP0408",3));
		blocos.add(new BlocoDeEstudo("COMP0408",4));
		blocos.add(new BlocoDeEstudo("COMP0455",3));
		blocos.add(new BlocoDeEstudo("COMP0455",6));
		blocos.add(new BlocoDeEstudo("COMP0481",3));
		
		ArrayList<Descanso> descanso = new ArrayList<>();
		descanso.add(new Descanso("Descanso",0,9));
		descanso.add(new Descanso("Descanso",1,9));
		descanso.add(new Descanso("Descanso",2,9));
		descanso.add(new Descanso("Descanso",3,9));
		descanso.add(new Descanso("Descanso",4,9));
		CSP<Variable, String> cspdia = new MapSemana(caso, horariosPIBITI, horariosPIBIC, atividades,horariosEstagio,horariosTrabalho, blocos,descanso);
		solver = new FlexibleBacktrackingSolver<Variable, String>().set(CspHeuristics.mrvDeg()).set(new ForwardCheckingStrategy<>());
		
		
		
		
		new TestaDeTudo( cspdia);
		
		
		
	}

}