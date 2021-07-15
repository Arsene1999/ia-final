
package aima.core.search.csp.examples;

import java.util.ArrayList;
import java.util.List;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.Constraint;
import aima.core.search.csp.Variable;

/*
 * Restrição responsável por definir o dia em que 
 * uma determinada atividade deve acontecer
 * Recebe uma Variavel e um inteiro referente ao dia
 * A condição se torna bem sucedida se o dia 
 * definido para a Varíavel é igual ao dia definido na
 * inicialização da restrição
 * */
public class definidorDeDia<VAR extends Variable, VAL> implements Constraint<VAR, horaDia> {

	private VAR var1;
	private int var2;
	private List<VAR> scope;
	private int aux = 0;
	public definidorDeDia(VAR var1, int var2) {
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
			
			return value1 == null || value1.getDia() == var2;
		}
	}
