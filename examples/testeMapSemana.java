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
		//solver = new FlexibleBacktrackingSolver<Variable, String>().set(CspHeuristics.mrvDeg());
		//solver = new FlexibleBacktrackingSolver<>();
		int[] horariosPIBITI = {};
		//int[] horariosPIBITI = {8,8,8,8,8};
		//int[] horariosPIBIC = {4,4,4,4,4};
		int[] horariosPIBIC = {};
		int[] horariosEstagio = {};
		int[] horariosTrabalho = {8,8,8,4,12};
		ArrayList<AtividadesComp> atividades = new ArrayList<>();
		atividades.add(new AtividadesComp("Palestra",0,3));
		atividades.add(new AtividadesComp("Palestra",2,3));
		atividades.add(new AtividadesComp("Voluntaria",1,3));
		ArrayList<AtividadesComp> BlocoDeEstudos = new ArrayList<>();
		CSP<Variable, String> cspdia = new MapSemana(horariosPIBITI, horariosPIBIC, atividades,horariosEstagio,horariosTrabalho, BlocoDeEstudos);
		
		solution = solver.solve(cspdia);
		solution.ifPresent(System.out::println);
		
		System.out.println();
		ArrayList<Resposta> res = solution.get().RetornaOMapa();
		for(Resposta var : res) {
			System.out.println(var.getName()+ " " + var.getDia()+"  "+var.getTempo());
		}
	}

}
