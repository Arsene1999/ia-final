package aima.core.search.csp.examples;

/*
 * Classe para definir o bloco de estudo 
 * contem o name que é o nome mais o 
 * Est para identifacar que é um bloco de estudo
 * contem tbm o Tempo que representa o tamanho do 
 * bloco de estudo por dia
 * e ref que é simplesmente o nome da aula a
 * qual o bloco faz referencia
 * */
public class BlocoDeEstudo {
	private String name;
	private String ref;
	private int tempo;
	
	BlocoDeEstudo(String name, int tempo){
		this.name = "Est" + name ;
		this.ref = name;
		this.tempo = tempo;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	public String getRef() {
		return ref;
	}
	
}
