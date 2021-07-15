package aima.core.search.csp.examples;

import java.util.ArrayList;
import java.util.List;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.Constraint;
import aima.core.search.csp.Variable;

/*
 * Restrição utilizada para afirmar 
 * se uma variavel pode utilizar o sabado ou não.
 * Recebe uma variavel e um booleano para
 * poder verificar se a variavel ocupa ou não um sabado
 * caso ocupe verifica se pode  fazer isso 
 * se sim retorna, 
 * se não retorna não.
 * */
public class sabadoTaOK<VAR extends Variable, VAL> implements Constraint<VAR, horaDia> {

	private VAR var1;
	private boolean var2;
	private List<VAR> scope;

	public sabadoTaOK(VAR var1, boolean var2) {
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
		if(value1.getDia() == 5) {
			if(var2 == true) {
				return true;
			}else {
				return false;
			}
		}
		return true;
	}
}