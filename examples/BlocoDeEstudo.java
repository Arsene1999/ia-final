package aima.core.search.csp.examples;

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
