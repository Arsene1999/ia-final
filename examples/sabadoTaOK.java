package aima.core.search.csp.examples;

import java.util.ArrayList;
import java.util.List;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.Constraint;
import aima.core.search.csp.Variable;

/*
 * Restri��o utilizada para afirmar 
 * se uma variavel pode utilizar o sabado ou n�o.
 * Recebe uma variavel e um booleano para
 * poder verificar se a variavel ocupa ou n�o um sabado
 * caso ocupe verifica se pode  fazer isso 
 * se sim retorna, 
 * se n�o retorna n�o.
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