package aima.core.search.csp.examples;
/*
 * Classe utilizada para definir esses 
 * vão ser especificados para uma atividade
 * unica e que precisa ser colocada em um 
 * horario e dia especificos
 * Comtem um nome, uma dia e uma hora 
 * */
public class Descanso {
	private String name;
	private int dia;
	private int hora;
	
	Descanso(String name, int dia, int hora){
		this.name = name;
		this.dia = dia;
		this.hora = hora;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getHora() {
		return hora;
	}
}
