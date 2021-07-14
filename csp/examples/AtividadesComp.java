package aima.core.search.csp.examples;

public class AtividadesComp {
	private String name;
	private int dia;
	private int tempo;
	
	AtividadesComp(String name, int dia, int tempo){
		this.dia = dia;
		this.name = name;
		this.tempo = tempo;
	}
	
	
	public int getDia() {
		return dia;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	public int[] CalculaReducaoDeTempo(int[] horasDaSemana) {
		horasDaSemana[dia] = horasDaSemana[dia] - tempo;
		if(horasDaSemana[dia] < 0) {
			System.out.println("[ERRO]: A quantidade de tempo necessário para realizar a atividade "+ name +" no dia escolhido é insuficiente :[ERRO]");
			System.exit(0);
		}
		return horasDaSemana; 
	}
}
