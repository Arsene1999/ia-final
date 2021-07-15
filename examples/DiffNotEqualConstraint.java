package aima.core.search.csp.examples;

import java.util.ArrayList;
import java.util.List;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.Constraint;
import aima.core.search.csp.Variable;

/**
 * Representa uma função binaria que no codigo da gente que está sendo utilizado
 * para garantir a que não haja variáveis com um mesmo dominio 
 * Ta sendo aplicado a todos 
 * Recebe duas variáveis
 */
public class DiffNotEqualConstraint implements Constraint<Variable, Integer> {

	private Variable var1;
	private Variable var2;
	private int diff;
	private List<Variable> scope;

	public DiffNotEqualConstraint(Variable var1, Variable var2, int diff) {
		this.var1 = var1;
		this.var2 = var2;
		this.diff = diff;
		scope = new ArrayList<Variable>(2);
		scope.add(var1);
		scope.add(var2);
	}

	@Override
	public List<Variable> getScope() {
		return scope;
	}

	@Override
	public boolean isSatisfiedWith(Assignment<Variable, Integer> assignment) {
		Integer value1 = assignment.getValue(var1);
		Integer value2 = assignment.getValue(var2);
		return (value1 == null || value2 == null || Math.abs(value1 - value2) != diff);
	}
}
