package aima.core.search.csp.examples;

public class Resposta {
	private String name;
	private int dia;
	private int momento;
	
	public Resposta(String name, int dia, int momento){
		this.dia = dia;
		this.name = name;
		this.momento = momento;
	}
	
	
	public int getDia() {
		return dia;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTempo() {
		return momento;
	}
}
