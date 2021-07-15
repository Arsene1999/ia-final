package aima.core.search.csp.examples;

/*
 * Classe utilizada para poder instanciar
 * as repostas recebidas 
 * Recebe:
 * name: nome na planilha
 * dia : dia que ocorre 
 * momento : um dos 30 min definidos na tabela e na ordem 
 *  */

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
	
	public void setName(String name){
		this.name = name;
	}
}
