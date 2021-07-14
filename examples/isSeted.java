package aima.core.search.csp.examples;

import java.util.ArrayList;
import java.util.List;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.Constraint;
import aima.core.search.csp.Variable;


	public class isSeted<VAR extends Variable, VAL> implements Constraint<VAR, horaDia> {

		private VAR var1;
		private horaDia var2;
		private List<VAR> scope;

		public isSeted(VAR var1, horaDia var2) {
			this.var1 = var1;
			this.var2 = var2;
			scope = new ArrayList<>(2);
			scope.add(var1);
		}

		@Override
		public List<VAR> getScope() {
			return scope;
		}

		@Override
		public boolean isSatisfiedWith(Assignment<VAR, horaDia> assignment) {
			horaDia value1 = assignment.getValue(var1);
			return value1 == null || value1 == var2;
		}
	}


