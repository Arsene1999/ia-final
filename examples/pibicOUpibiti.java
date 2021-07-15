package aima.core.search.csp.examples;

import java.util.ArrayList;
import java.util.List;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.Constraint;
import aima.core.search.csp.Variable;

/*
 * Restrição aplicada a todo o dominio para 
 * verificar se existe PIBITI e PIBIC instanciados na tabela 
 * se existir os dois ao mesmo tempo retorna false 
 * se acontecer de não ter nenhum ou só um então retorna true
 * */

public class pibicOUpibiti<VAR extends Variable, VAL> implements Constraint<VAR, horaDia> {

	private VAR var1;
	private VAR var2;
	private List<VAR> scope;

	public pibicOUpibiti(VAR var1, VAR var2) {
		this.var1 = var1;
		this.var2 = var2;
		scope = new ArrayList<>(2);
		scope.add(var1);
		scope.add(var2);
	}

	@Override
	public List<VAR> getScope() {
		return scope;
	}

	@Override
	public boolean isSatisfiedWith(Assignment<VAR, horaDia> assignment) {
		
		if(var1.getName().equals("PIBIC") ){
			if(var2.getName().equals("PIBITI")) {
				System.out.println("[ERRO]: É necessário escolher entre PIBIC ou PIBIT :[ERRO]");
				System.exit(0);
				return false;
			}else {
				return true;
			}
		}
		if(var1.getName().equals("PIBITI")) {
			if(var2.getName().equals("PIBIC")) {
				System.out.println("[ERRO]: É necessário escolher entre PIBIC ou PIBIT :[ERRO]");
				System.exit(0);
				return false;
			}else {
				return true;
			}
		}
		
		//System.out.println(var1.getName() +" " + var2 +" "+ (var1.getName().equals("PIBITI")));
		return true;
	}
}
