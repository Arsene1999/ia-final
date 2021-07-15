package aima.core.search.csp.examples;
/*
 * Classe usada para instanciar as Atividades Complementares
 * contendo nome , dia e tempo(ou duração da atividade)
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
	 * Verifica se no dia a ser alocado a horas o suficiente disponíveis
	 * Caso tenha horas o suficiente retorna as horasDaSemana com o tempo reduzido
	 * Caso não haja o codigo para a execução e da o erro
	 * */
	public int[] CalculaReducaoDeTempo(int[] horasDaSemana) {
		horasDaSemana[dia] = horasDaSemana[dia] - tempo;
		if(horasDaSemana[dia] < 0) {
			System.out.println("[ERRO]: A quantidade de tempo necessário para realizar a atividade "+ name +" no dia escolhido é insuficiente :[ERRO]");
			System.exit(0);
		}
		return horasDaSemana; 
	}
}
