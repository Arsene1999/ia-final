package aima.core.search.csp.examples;
/*
 * Classe usada para instanciar as Atividades Complementares
 * contendo nome , dia e tempo(ou dura��o da atividade)
 * */
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
	
	/*
	 * Recebe um array de inteiros com quantidade de horas da semana
	 * Verifica se no dia a ser alocado a horas o suficiente dispon�veis
	 * Caso tenha horas o suficiente retorna as horasDaSemana com o tempo reduzido
	 * Caso n�o haja o codigo para a execu��o e da o erro
	 * */
	public int[] CalculaReducaoDeTempo(int[] horasDaSemana) {
		horasDaSemana[dia] = horasDaSemana[dia] - tempo;
		if(horasDaSemana[dia] < 0) {
			System.out.println("[ERRO]: A quantidade de tempo necess�rio para realizar a atividade "+ name +" no dia escolhido � insuficiente :[ERRO]");
			System.exit(0);
		}
		return horasDaSemana; 
	}
}
