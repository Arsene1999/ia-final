package aima.core.search.csp.examples;
/*
 * Classe utilizada para definir o dia e a hora de cada horário
 * disponível na tabela semanal
 * Recebe um dia e uma hora referente a ao dominio especificado
 * */
public class horaDia {
	public int dia;
	public int horario;
	public String name;
	
	horaDia(int dia, int horario){
		this.dia = dia;
		this.horario = horario;
		switch(dia) {
			case 0:
				this.name = "Segunda";
				break;
			case 1:
				this.name = "Terça";
				break;
			case 2:
				this.name = "Quarta";
				break;
			case 3:
				this.name = "Quinta";
				break;
			case 4:
				this.name = "Sexta";
				break;
			case 5:
				this.name = "Sabado";
				break;
		}
	}
	
	
	public String getName(){
		return name;
	}
		
	
	public int getHorario() {
		return horario;
	}	
	
	public int getDia() {
		return dia;
	}
}
