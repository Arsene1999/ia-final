package aima.core.search.csp.examples;

import java.util.ArrayList;
import java.util.List;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.Constraint;
import aima.core.search.csp.Variable;

/*
 *Restrição utilizada para setar um dominio especifico a uma variavel 
 * Recebe uma Variavel e dois inteiros referentes a posição na tabela
 * Satisfeito se o dominio  assinaldo a variável possui os dois inteiros 
 * em suas posições específicas
 * */
public class SetDescanso<VAR extends Variable, VAL> implements Constraint<VAR, horaDia> {

	private VAR var1;
	private int var2;
	private int var3;
	private List<VAR> scope;

	public SetDescanso(VAR var1, int var2, int var3) {
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
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
		if(value1.getDia() == var2 && value1.getHorario() == var3) {
			return true;
		}else {
			return false;
		}
	}
}