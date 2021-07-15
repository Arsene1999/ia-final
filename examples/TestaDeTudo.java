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
import aima.core.search.csp.solver.inference.AC3Strategy;
import aima.core.search.csp.solver.inference.ForwardCheckingStrategy;

public class TestaDeTudo {
	TestaDeTudo(CSP<Variable, String> cspdia){
		CspSolver<Variable, String> solver = new FlexibleBacktrackingSolver<Variable, String>().set(CspHeuristics.mrvDeg()).set(new ForwardCheckingStrategy<>());
		Optional<Assignment<Variable, String>> solution = solver.solve(cspdia);
		ArrayList<Resposta> res = solution.get().RetornaOMapa();
		new PrintTabela(res);
		
		
		
		CspListener.StepCounter<Variable, String> stepCounter = new CspListener.StepCounter<>();
		solver = new FlexibleBacktrackingSolver<>();
		solver.addCspListener(stepCounter);
		stepCounter.reset();
		long startTime = System.nanoTime();
		solution = solver.solve(cspdia);
		System.out.print("Flexible Backtracking"+ stepCounter.getResults() + "  ");    
		long stopTime = System.nanoTime();
		System.out.print("Execucao  ");
		System.out.println(  stopTime - startTime);
		System.out.println();
		
		// MRV
		solver = new FlexibleBacktrackingSolver<Variable, String>().set(CspHeuristics.mrv());
		solver.addCspListener(stepCounter);
		stepCounter.reset();
		startTime = System.nanoTime();
		solution = solver.solve(cspdia);
		System.out.print("Flexible Backtracking MRV"+ stepCounter.getResults() + "  ");
		stopTime = System.nanoTime();
		System.out.print("Execucao  ");
		System.out.println(  stopTime - startTime);
		System.out.println();
		
		// DEG
		solver = new FlexibleBacktrackingSolver<Variable, String>().set(CspHeuristics.deg());
		solver.addCspListener(stepCounter);
		stepCounter.reset();
		startTime = System.nanoTime();
		solution = solver.solve(cspdia);
		System.out.print("Flexible Backtracking DEG"+ stepCounter.getResults() + "  ");
		stopTime = System.nanoTime();
		System.out.print("Execucao  ");
		System.out.println(  stopTime - startTime);
		System.out.println();
		
        // LCV
		solver = new FlexibleBacktrackingSolver<Variable, String>().set(CspHeuristics.lcv());
		solver.addCspListener(stepCounter);
		stepCounter.reset();
		startTime = System.nanoTime();
		solution = solver.solve(cspdia);
		System.out.print("Flexible Backtracking LCV"+ stepCounter.getResults() + " ");
		stopTime = System.nanoTime();
		System.out.print("Execucao  ");
		System.out.println(  stopTime - startTime);
		System.out.println();
		
        // FC
		solver = new FlexibleBacktrackingSolver<Variable, String>().set(new ForwardCheckingStrategy<>());
		solver.addCspListener(stepCounter);
		stepCounter.reset();
		startTime = System.nanoTime();
		solution = solver.solve(cspdia);
		if(solution.isPresent()) {
			System.out.print("Flexible Backtracking ForwardCheckingStrategy"+ stepCounter.getResults() + "  ");
		}else {
			System.out.println("Nada");
		}
		stopTime = System.nanoTime();
		System.out.print("Execucao  ");
		System.out.println(  stopTime - startTime);
		System.out.println();
            
        // FC + MRV&DEG
		solver = new FlexibleBacktrackingSolver<Variable, String>().set(CspHeuristics.mrvDeg())
                    .set(new ForwardCheckingStrategy<>());
		solver.addCspListener(stepCounter);
		stepCounter.reset();
		startTime = System.nanoTime();
		solution = solver.solve(cspdia);
		System.out.print("Flexible Backtracking FC + MRV&DEG"+ stepCounter.getResults() + "  ");
		stopTime = System.nanoTime();
		System.out.print("Execucao  ");
		System.out.println(  stopTime - startTime);
		System.out.println();
		
        // AC3
		solver = new FlexibleBacktrackingSolver<Variable, String>().set(new AC3Strategy<>());
		solver.addCspListener(stepCounter);
		stepCounter.reset();
		startTime = System.nanoTime();
		solution = solver.solve(cspdia);
		System.out.print("Flexible Backtracking AC3"+ stepCounter.getResults() + "  ");    
		stopTime = System.nanoTime();
		System.out.print("Execucao  ");
		System.out.println(  stopTime - startTime);
		System.out.println();
		
        // AC3 + MRV&DEG + LCV
		solver = new FlexibleBacktrackingSolver<Variable, String>().setAll();
		solver.addCspListener(stepCounter);
		stepCounter.reset();
		startTime = System.nanoTime();
		solution = solver.solve(cspdia);
		System.out.print("Flexible Backtracking AC3 + MRV&DEG + LCV"+ stepCounter.getResults() + "  ");  
		stopTime = System.nanoTime();
		System.out.print("Execucao  ");
		System.out.println(  stopTime - startTime);
		System.out.println();
		
		solver = new MinConflictsSolver<>(50);
		solver.addCspListener(stepCounter);
		stepCounter.reset();
		startTime = System.nanoTime();
		solution = solver.solve(cspdia);
		System.out.print("Min Conflicts Solver"+ stepCounter.getResults() + "  ");   
		stopTime = System.nanoTime();
		System.out.print("Execucao  ");
		System.out.println(  stopTime - startTime);
		System.out.println();
		
		solver = new BackjumpingBacktrackingSolver<>();
		solver.addCspListener(stepCounter);
		stepCounter.reset();
		startTime = System.nanoTime();
		solution = solver.solve(cspdia);
		System.out.print("Back jumping Backtracking Solver"+ stepCounter.getResults() + "  ");   
		stopTime = System.nanoTime();
		System.out.print("Execucao  ");
		System.out.println(  stopTime - startTime);
		System.out.println();
		
		solver = new BackjumpingBacktrackingSolver<Variable, String>().set(CspHeuristics.mrvDeg());
		solver.addCspListener(stepCounter);
		stepCounter.reset();
		startTime = System.nanoTime();
		solution = solver.solve(cspdia);
		System.out.print("Back jumping Backtracking Solver MRV&DEG"+ stepCounter.getResults() + "  ");      
		stopTime = System.nanoTime();
		System.out.print("Execucao  ");
		System.out.println(  stopTime - startTime);
		System.out.println();
	}
}
