package aima.core.search.csp.examples;

import java.util.ArrayList;
import java.util.Arrays;

import aima.core.search.csp.CSP;
import aima.core.search.csp.Domain;
import aima.core.search.csp.Variable;



/**
 * Artificial Intelligence A Modern Approach (3rd Ed.): Figure 6.1, Page 204.<br>
 * <br>
 * The principal states and territories of Australia. Coloring this map can be
 * viewed as a constraint satisfaction problem (CSP). The goal is to assign
 * colors to each region so that no neighboring regions have the same color.
 * 
 * @author Ruediger Lunde
 * @author Mike Stampone
 */
public class MapSemana extends CSP<Variable, String> {
	public int[] horasDaSemana = {20,20,20,20,20,20};
	public boolean sabadoLivre = false;
	public static final Variable TRABALHO_1 = new Variable("TRABALHO", 0);
	public static final Variable TRABALHO_2 = new Variable("TRABALHO", 1);
	public static final Variable TRABALHO_3 = new Variable("TRABALHO", 2);
	public static final Variable TRABALHO_4 = new Variable("TRABALHO", 3);
	public static final Variable TRABALHO_5 = new Variable("TRABALHO", 4);
	public static final Variable TRABALHO_6 = new Variable("TRABALHO", 5);
	public static final Variable TRABALHO_7 = new Variable("TRABALHO", 6);
	public static final Variable TRABALHO_8 = new Variable("TRABALHO", 7);
	public static final Variable TRABALHO_9 = new Variable("TRABALHO", 8);
	public static final Variable TRABALHO_10 = new Variable("TRABALHO", 9);
	public static final Variable TRABALHO_11 = new Variable("TRABALHO", 10);
	public static final Variable TRABALHO_12 = new Variable("TRABALHO", 11);
	public static final Variable TRABALHO_13 = new Variable("TRABALHO", 12);
	public static final Variable TRABALHO_14 = new Variable("TRABALHO", 13);
	public static final Variable TRABALHO_15 = new Variable("TRABALHO", 14);
	public static final Variable TRABALHO_16 = new Variable("TRABALHO", 15);
	public static final Variable TRABALHO_17 = new Variable("TRABALHO", 16);
	public static final Variable TRABALHO_18 = new Variable("TRABALHO", 17);
	public static final Variable TRABALHO_19 = new Variable("TRABALHO", 18);
	public static final Variable TRABALHO_20 = new Variable("TRABALHO", 19);

	public static final Variable ESTAGIO_1 = new Variable("ESTAGIO", 0);
	public static final Variable ESTAGIO_2 = new Variable("ESTAGIO", 1);
	public static final Variable ESTAGIO_3 = new Variable("ESTAGIO", 2);
	public static final Variable ESTAGIO_4 = new Variable("ESTAGIO", 3);
	public static final Variable ESTAGIO_5 = new Variable("ESTAGIO", 4);
	public static final Variable ESTAGIO_6 = new Variable("ESTAGIO", 5);
	public static final Variable ESTAGIO_7 = new Variable("ESTAGIO", 6);
	public static final Variable ESTAGIO_8 = new Variable("ESTAGIO", 7);
	public static final Variable ESTAGIO_9 = new Variable("ESTAGIO", 8);
	public static final Variable ESTAGIO_10 = new Variable("ESTAGIO", 9);
	public static final Variable ESTAGIO_11 = new Variable("ESTAGIO", 10);
	public static final Variable ESTAGIO_12 = new Variable("ESTAGIO", 11);
	public static final Variable ESTAGIO_13 = new Variable("ESTAGIO", 12);
	public static final Variable ESTAGIO_14 = new Variable("ESTAGIO", 13);
	public static final Variable ESTAGIO_15 = new Variable("ESTAGIO", 14);
	public static final Variable ESTAGIO_16 = new Variable("ESTAGIO", 15);
	public static final Variable ESTAGIO_17 = new Variable("ESTAGIO", 16);
	public static final Variable ESTAGIO_18 = new Variable("ESTAGIO", 17);
	public static final Variable ESTAGIO_19 = new Variable("ESTAGIO", 18);
	public static final Variable ESTAGIO_20 = new Variable("ESTAGIO", 19);
	
	public static final horaDia Segunda1 = new horaDia(0,0);
	public static final horaDia Segunda2 = new horaDia(0,1);
	public static final horaDia Segunda3 = new horaDia(0,2);
	public static final horaDia Segunda4 = new horaDia(0,3);
	public static final horaDia Segunda5 = new horaDia(0,4);
	public static final horaDia Segunda6 = new horaDia(0,5);
	public static final horaDia Segunda7 = new horaDia(0,6);
	public static final horaDia Segunda8 = new horaDia(0,7);
	public static final horaDia Segunda9 = new horaDia(0,8);
	public static final horaDia Segunda10 = new horaDia(0,9);
	public static final horaDia Segunda11 = new horaDia(0,10);
	public static final horaDia Segunda12 = new horaDia(0,11);
	public static final horaDia Segunda13= new horaDia(0,12);
	public static final horaDia Segunda14 = new horaDia(0,13);
	public static final horaDia Segunda15 = new horaDia(0,14);
	public static final horaDia Segunda16 = new horaDia(0,15);
	public static final horaDia Segunda17 = new horaDia(0,16);
	public static final horaDia Segunda18 = new horaDia(0,17);
	public static final horaDia Segunda19 = new horaDia(0,18);
	public static final horaDia Segunda20 = new horaDia(0,19);;
	
	public static final horaDia Terca1 = new horaDia(1,0);
	public static final horaDia Terca2 = new horaDia(1,1);
	public static final horaDia Terca3 = new horaDia(1,2);
	public static final horaDia Terca4 = new horaDia(1,3);
	public static final horaDia Terca5 = new horaDia(1,4);
	public static final horaDia Terca6 = new horaDia(1,5);
	public static final horaDia Terca7 = new horaDia(1,6);
	public static final horaDia Terca8 = new horaDia(1,7);
	public static final horaDia Terca9 = new horaDia(1,8);
	public static final horaDia Terca10 = new horaDia(1,9);
	public static final horaDia Terca11 = new horaDia(1,10);
	public static final horaDia Terca12 = new horaDia(1,11);
	public static final horaDia Terca13 = new horaDia(1,12);
	public static final horaDia Terca14= new horaDia(1,13);
	public static final horaDia Terca15 = new horaDia(1,14);
	public static final horaDia Terca16 = new horaDia(1,15);
	public static final horaDia Terca17 = new horaDia(1,16);
	public static final horaDia Terca18 = new horaDia(1,17);
	public static final horaDia Terca19 = new horaDia(1,18);
	public static final horaDia Terca20 = new horaDia(1,19);
	
	public static final horaDia Quarta1 = new horaDia(2,0);
	public static final horaDia Quarta2 = new horaDia(2,1);
	public static final horaDia Quarta3 = new horaDia(2,2);
	public static final horaDia Quarta4 = new horaDia(2,3);
	public static final horaDia Quarta5 = new horaDia(2,4);
	public static final horaDia Quarta6 = new horaDia(2,5);
	public static final horaDia Quarta7 = new horaDia(2,6);
	public static final horaDia Quarta8 = new horaDia(2,7);
	public static final horaDia Quarta9 = new horaDia(2,8);
	public static final horaDia Quarta10 = new horaDia(2,9);
	public static final horaDia Quarta11 = new horaDia(2,10);
	public static final horaDia Quarta12 = new horaDia(2,11);
	public static final horaDia Quarta13 = new horaDia(2,12);
	public static final horaDia Quarta14= new horaDia(2,13);
	public static final horaDia Quarta15 = new horaDia(2,14);
	public static final horaDia Quarta16 = new horaDia(2,15);
	public static final horaDia Quarta17 = new horaDia(2,16);
	public static final horaDia Quarta18 = new horaDia(2,17);
	public static final horaDia Quarta19 = new horaDia(2,18);
	public static final horaDia Quarta20 = new horaDia(2,19);
	
	
	public static final horaDia Quinta1 = new horaDia(3,0);
	public static final horaDia Quinta2 = new horaDia(3,1);
	public static final horaDia Quinta3 = new horaDia(3,2);
	public static final horaDia Quinta4 = new horaDia(3,3);
	public static final horaDia Quinta5 = new horaDia(3,4);
	public static final horaDia Quinta6 = new horaDia(3,5);
	public static final horaDia Quinta7 = new horaDia(3,6);
	public static final horaDia Quinta8 = new horaDia(3,7);
	public static final horaDia Quinta9 = new horaDia(3,8);
	public static final horaDia Quinta10 = new horaDia(3,9);
	public static final horaDia Quinta11 = new horaDia(3,10);
	public static final horaDia Quinta12 = new horaDia(3,11);
	public static final horaDia Quinta13 = new horaDia(3,12);
	public static final horaDia Quinta14 = new horaDia(3,13);
	public static final horaDia Quinta15 = new horaDia(3,14);
	public static final horaDia Quinta16 = new horaDia(3,15);
	public static final horaDia Quinta17 = new horaDia(3,16);
	public static final horaDia Quinta18 = new horaDia(3,17);
	public static final horaDia Quinta19 = new horaDia(3,18);
	public static final horaDia Quinta20 = new horaDia(3,19);
	
	
	
	public static final horaDia Sexta1 = new horaDia(4,0);
	public static final horaDia Sexta2 = new horaDia(4,1);
	public static final horaDia Sexta3 = new horaDia(4,2);
	public static final horaDia Sexta4 = new horaDia(4,3);
	public static final horaDia Sexta5 = new horaDia(4,4);
	public static final horaDia Sexta6 = new horaDia(4,5);
	public static final horaDia Sexta7 = new horaDia(4,6);
	public static final horaDia Sexta8 = new horaDia(4,7);
	public static final horaDia Sexta9 = new horaDia(4,8);
	public static final horaDia Sexta10 = new horaDia(4,9);
	public static final horaDia Sexta11 = new horaDia(4,10);
	public static final horaDia Sexta12 = new horaDia(4,11);
	public static final horaDia Sexta13= new horaDia(4,12);
	public static final horaDia Sexta14 = new horaDia(4,13);
	public static final horaDia Sexta15 = new horaDia(4,14);
	public static final horaDia Sexta16 = new horaDia(4,15);
	public static final horaDia Sexta17 = new horaDia(4,16);
	public static final horaDia Sexta18 = new horaDia(4,17);
	public static final horaDia Sexta19 = new horaDia(4,18);
	public static final horaDia Sexta20 = new horaDia(4,19);

	public static final horaDia Sabado1 = new horaDia(5,0);
	public static final horaDia Sabado2 = new horaDia(5,1);
	public static final horaDia Sabado3 = new horaDia(5,2);
	public static final horaDia Sabado4 = new horaDia(5,3);
	public static final horaDia Sabado5 = new horaDia(5,4);
	public static final horaDia Sabado6 = new horaDia(5,5);
	public static final horaDia Sabado7 = new horaDia(5,6);
	public static final horaDia Sabado8 = new horaDia(5,7);
	public static final horaDia Sabado9 = new horaDia(5,8);
	public static final horaDia Sabado10 = new horaDia(5,9);
	public static final horaDia Sabado11 = new horaDia(5,10);
	public static final horaDia Sabado12 = new horaDia(5,11);
	public static final horaDia Sabado13= new horaDia(5,12);
	public static final horaDia Sabado14 = new horaDia(5,13);
	public static final horaDia Sabado15 = new horaDia(5,14);
	public static final horaDia Sabado16 = new horaDia(5,15);
	public static final horaDia Sabado17 = new horaDia(5,16);
	public static final horaDia Sabado18 = new horaDia(5,17);
	public static final horaDia Sabado19 = new horaDia(5,18);
	public static final horaDia Sabado20 = new horaDia(5,19);
	
	public void VerificaOsBlocos(String[] ExistemOsBlocos,ArrayList<BlocoDeEstudo> blocos) {
		boolean existe = false;
		for(int i = 0; i < ExistemOsBlocos.length; i++) {
			existe = false;
			for(BlocoDeEstudo var : blocos) {
				if(var.getRef().equals(ExistemOsBlocos[i])) {
					existe = true;
					break;
				}
			}
			if(existe == false) {
				System.out.print("[ERRO]: Está faltando bloco de estudo para a materia "+ ExistemOsBlocos[i]+" :[ERRO]");
				System.exit(0);
			}
		}
	}
	
	public void Caso1( ArrayList<BlocoDeEstudo> blocos) {
		Variable COMP0408 = new Variable("COMP0408",0);
		Variable COMP0408_2 = new Variable("COMP0408",1);
		Variable COMP0408_3 = new Variable("COMP0408",2);
		Variable COMP0408_4 = new Variable("COMP0408",3);
		Variable COMP0408_5 = new Variable("COMP0408",4);
		Variable COMP0408_6 = new Variable("COMP0408",5);
		Variable COMP0408_7 = new Variable("COMP0408",6);
		Variable COMP0408_8 = new Variable("COMP0408",7);
		
		Variable COMP0455 = new Variable("COMP0455",0);
		Variable COMP0455_2 = new Variable("COMP0455",1);
		Variable COMP0455_3 = new Variable("COMP0455",2);
		Variable COMP0455_4 = new Variable("COMP0455",3);
		Variable COMP0455_5 = new Variable("COMP0455",4);
		Variable COMP0455_6 = new Variable("COMP0455",5);
		Variable COMP0455_7 = new Variable("COMP0455",6);
		Variable COMP0455_8 = new Variable("COMP0455",7);
		
		 Variable COMP0481 = new Variable("COMP0481",0);
		Variable COMP0481_2 = new Variable("COMP0481",1);
		Variable COMP0481_3 = new Variable("COMP0481",2);
		Variable COMP0481_4 = new Variable("COMP0481",3);
		
		addVariable(COMP0408);
		addVariable(COMP0408_2);
		addVariable(COMP0408_3);
		addVariable(COMP0408_4);
		addVariable(COMP0408_5);
		addVariable(COMP0408_6);
		addVariable(COMP0408_7);
		addVariable(COMP0408_8);
		
		
		
		addVariable(COMP0455);
		addVariable(COMP0455_2);
		addVariable(COMP0455_3);
		addVariable(COMP0455_4);
		addVariable(COMP0455_5);
		addVariable(COMP0455_6);
		addVariable(COMP0455_7);
		addVariable(COMP0455_8);
		
		addVariable(COMP0481);
		addVariable(COMP0481_2);
		addVariable(COMP0481_3);
		addVariable(COMP0481_4);
		
		addConstraint(new isSeted(COMP0408,Segunda17));
		addConstraint(new isSeted(COMP0408_2,Segunda18));
		
		addConstraint(new isSeted(COMP0408_3,Segunda19));
		addConstraint(new isSeted(COMP0408_4,Segunda20));
		addConstraint(new isSeted(COMP0408_5,Quarta17));
		addConstraint(new isSeted(COMP0408_6,Quarta18));
		addConstraint(new isSeted(COMP0408_7,Quarta19));
		addConstraint(new isSeted(COMP0408_8,Quarta20));
		
		
		addConstraint(new isSeted(COMP0455,Terca5));
		addConstraint(new isSeted(COMP0455_2, Terca6));
		addConstraint(new isSeted(COMP0455_3, Terca7));
		addConstraint(new isSeted(COMP0455_4, Terca8));
		addConstraint(new isSeted(COMP0455_5,Quinta5));
		addConstraint(new isSeted(COMP0455_6, Quinta6));
		addConstraint(new isSeted(COMP0455_7, Quinta7));
		addConstraint(new isSeted(COMP0455_8, Quinta8));
		
		addConstraint(new isSeted(COMP0481,Quinta13));
		addConstraint(new isSeted(COMP0481_2,Quinta14));
		addConstraint(new isSeted(COMP0481_3,Quinta15));
		
		//System.out.println(Quinta16 + " " + Quinta16.getDia() + " " + Quinta16.getHorario() +" "+ Quinta16.getName());
		addConstraint(new isSeted(COMP0481_4,Quinta16));
		
		horasDaSemana[0] = horasDaSemana[0] - 4;
		horasDaSemana[1] = horasDaSemana[1] - 4;
		horasDaSemana[2] = horasDaSemana[2] - 4;
		horasDaSemana[3] = horasDaSemana[3] - 8;
		
		String[] ExistemOsBlocos = {"COMP0408", "COMP0455", "COMP0481"};
		VerificaOsBlocos(ExistemOsBlocos, blocos);
		
	}

	
	public void Caso2(ArrayList<BlocoDeEstudo> blocos) {
		Variable COMP0408 = new Variable("COMP0408",0);
		Variable COMP0408_2 = new Variable("COMP0408",1);
		Variable COMP0408_3 = new Variable("COMP0408",2);
		Variable COMP0408_4 = new Variable("COMP0408",3);
		Variable COMP0408_5 = new Variable("COMP0408",4);
		Variable COMP0408_6 = new Variable("COMP0408",5);
		Variable COMP0408_7 = new Variable("COMP0408",6);
		Variable COMP0408_8 = new Variable("COMP0408",7);
		
		addVariable(COMP0408);
		addVariable(COMP0408_2);
		addVariable(COMP0408_3);
		addVariable(COMP0408_4);
		addVariable(COMP0408_5);
		addVariable(COMP0408_6);
		addVariable(COMP0408_7);
		addVariable(COMP0408_8);
		
		addConstraint(new isSeted(COMP0408,Segunda9));
		addConstraint(new isSeted(COMP0408_2,Segunda10));
		addConstraint(new isSeted(COMP0408_3,Segunda11));
		addConstraint(new isSeted(COMP0408_4,Segunda12));
		addConstraint(new isSeted(COMP0408_5,Quarta9));
		addConstraint(new isSeted(COMP0408_6,Quarta10));
		addConstraint(new isSeted(COMP0408_7,Quarta11));
		addConstraint(new isSeted(COMP0408_8,Quarta12));
		
		Variable COMP0409 = new Variable("COMP0409",0);
		Variable COMP0409_2 = new Variable("COMP0409",1);
		Variable COMP0409_3 = new Variable("COMP0409",2);
		Variable COMP0409_4 = new Variable("COMP0409",3);
		Variable COMP0409_5 = new Variable("COMP0409",4);
		Variable COMP0409_6 = new Variable("COMP0409",5);
		Variable COMP0409_7 = new Variable("COMP0409",6);
		Variable COMP0409_8 = new Variable("COMP0409",7);
		
		
		addVariable(COMP0409);
		addVariable(COMP0409_2);
		addVariable(COMP0409_3);
		addVariable(COMP0409_4);
		addVariable(COMP0409_5);
		addVariable(COMP0409_6);
		addVariable(COMP0409_7);
		addVariable(COMP0409_8);
		
		
		addConstraint(new isSeted(COMP0409,Segunda1));
		addConstraint(new isSeted(COMP0409_2,Segunda2));
		addConstraint(new isSeted(COMP0409_3,Segunda3));
		addConstraint(new isSeted(COMP0409_4,Segunda4));
		addConstraint(new isSeted(COMP0409_5,Quarta1));
		addConstraint(new isSeted(COMP0409_6,Quarta2));
		addConstraint(new isSeted(COMP0409_7,Quarta3));
		addConstraint(new isSeted(COMP0409_8,Quarta4));
		
		
		Variable COMP0412 = new Variable("COMP0412",0);
		Variable COMP0412_2 = new Variable("COMP0412",1);
		Variable COMP0412_3 = new Variable("COMP0412",2);
		Variable COMP0412_4 = new Variable("COMP0412",3);
		Variable COMP0412_5 = new Variable("COMP0412",4);
		Variable COMP0412_6 = new Variable("COMP0412",5);
		Variable COMP0412_7 = new Variable("COMP0412",6);
		Variable COMP0412_8 = new Variable("COMP0412",7);
		
		
		addVariable(COMP0412);
		addVariable(COMP0412_2);
		addVariable(COMP0412_3);
		addVariable(COMP0412_4);
		addVariable(COMP0412_5);
		addVariable(COMP0412_6);
		addVariable(COMP0412_7);
		addVariable(COMP0412_8);
		
		addConstraint(new isSeted(COMP0412,Terca5));
		addConstraint(new isSeted(COMP0412_2, Terca6));
		addConstraint(new isSeted(COMP0412_3, Terca7));
		addConstraint(new isSeted(COMP0412_4, Terca8));
		addConstraint(new isSeted(COMP0412_5,Quinta5));
		addConstraint(new isSeted(COMP0412_6, Quinta6));
		addConstraint(new isSeted(COMP0412_7, Quinta7));
		addConstraint(new isSeted(COMP0412_8, Quinta8));
		
		
		Variable COMP0461 = new Variable("COMP0461",0);
		Variable COMP0461_2 = new Variable("COMP0461",1);
		Variable COMP0461_3 = new Variable("COMP0461",2);
		Variable COMP0461_4 = new Variable("COMP0461",3);
		Variable COMP0461_5 = new Variable("COMP0461",4);
		Variable COMP0461_6 = new Variable("COMP0461",5);
		Variable COMP0461_7 = new Variable("COMP0461",6);
		Variable COMP0461_8 = new Variable("COMP0461",7);
		
		
		addVariable(COMP0461);
		addVariable(COMP0461_2);
		addVariable(COMP0461_3);
		addVariable(COMP0461_4);
		addVariable(COMP0461_5);
		addVariable(COMP0461_6);
		addVariable(COMP0461_7);
		addVariable(COMP0461_8);
		
		addConstraint(new isSeted(COMP0461,Segunda15));
		addConstraint(new isSeted(COMP0461_2,Segunda16));
		addConstraint(new isSeted(COMP0461_3,Segunda17));
		addConstraint(new isSeted(COMP0461_4,Segunda18));
		addConstraint(new isSeted(COMP0461_5,Quarta15));
		addConstraint(new isSeted(COMP0461_6,Quarta16));
		addConstraint(new isSeted(COMP0461_7,Quarta17));
		addConstraint(new isSeted(COMP0461_8,Quarta18));
		
		
		Variable COMP0438 = new Variable("COMP0438",0);
		Variable COMP0438_2 = new Variable("COMP0438",1);
		Variable COMP0438_3 = new Variable("COMP0438",2);
		Variable COMP0438_4 = new Variable("COMP0438",3);
		Variable COMP0438_5 = new Variable("COMP0438",4);
		Variable COMP0438_6 = new Variable("COMP0438",5);
		Variable COMP0438_7 = new Variable("COMP0438",6);
		Variable COMP0438_8 = new Variable("COMP0438",7);
		
		
		addVariable(COMP0438);
		addVariable(COMP0438_2);
		addVariable(COMP0438_3);
		addVariable(COMP0438_4);
		addVariable(COMP0438_5);
		addVariable(COMP0438_6);
		addVariable(COMP0438_7);
		addVariable(COMP0438_8);
		
		addConstraint(new isSeted(COMP0438,Sexta1));
		addConstraint(new isSeted(COMP0438_2,Sexta2));
		addConstraint(new isSeted(COMP0438_3,Sexta3));
		addConstraint(new isSeted(COMP0438_4,Sexta4));
		addConstraint(new isSeted(COMP0438_5,Sexta5));
		addConstraint(new isSeted(COMP0438_6,Sexta6));
		addConstraint(new isSeted(COMP0438_7,Sexta7));
		addConstraint(new isSeted(COMP0438_8,Sexta8));
		
		
		horasDaSemana[0] = horasDaSemana[0] - 12;
		horasDaSemana[1] = horasDaSemana[1] - 4;
		horasDaSemana[2] = horasDaSemana[2] - 12;
		horasDaSemana[3] = horasDaSemana[3] - 4;
		horasDaSemana[4] = horasDaSemana[4] - 8;
		String[] ExistemOsBlocos = {"COMP0408", "COMP0409", "COMP0412","COMP0461", "COMP0438"};
		VerificaOsBlocos(ExistemOsBlocos, blocos);
		
	}
	
	public void Caso3(ArrayList<BlocoDeEstudo> blocos) {
		Variable ELET0043 = new Variable("ELET0043",0);
		Variable ELET0043_2 = new Variable("ELET0043",1);
		Variable ELET0043_3 = new Variable("ELET0043",2);
		Variable ELET0043_4 = new Variable("ELET0043",3);
		
		addVariable(ELET0043);
		addVariable(ELET0043_2);
		addVariable(ELET0043_3);
		addVariable(ELET0043_4);
		
		
		addConstraint(new isSeted(ELET0043,Segunda1));
		addConstraint(new isSeted(ELET0043_2,Segunda2));
		addConstraint(new isSeted(ELET0043_3,Segunda3));
		addConstraint(new isSeted(ELET0043_4,Segunda4));
		
		Variable ESTAT0011 = new Variable("ESTAT0011",0);
		Variable ESTAT0011_2 = new Variable("ESTAT0011",1);
		Variable ESTAT0011_3 = new Variable("ESTAT0011",2);
		Variable ESTAT0011_4 = new Variable("ESTAT0011",3);
		Variable ESTAT0011_5 = new Variable("ESTAT0011",5);
		Variable ESTAT0011_6 = new Variable("ESTAT0011",6);
		Variable ESTAT0011_7 = new Variable("ESTAT0011",7);
		Variable ESTAT0011_8 = new Variable("ESTAT0011",8);
		
		addVariable(ESTAT0011);
		addVariable(ESTAT0011_2);
		addVariable(ESTAT0011_3);
		addVariable(ESTAT0011_4);
		addVariable(ESTAT0011_5);
		addVariable(ESTAT0011_6);
		addVariable(ESTAT0011_7);
		addVariable(ESTAT0011_8);
		
		
		addConstraint(new isSeted(ESTAT0011,Segunda5));
		addConstraint(new isSeted(ESTAT0011_2,Segunda6));
		addConstraint(new isSeted(ESTAT0011_3,Segunda7));
		addConstraint(new isSeted(ESTAT0011_4,Segunda8));
		addConstraint(new isSeted(ESTAT0011_5,Quarta5));
		addConstraint(new isSeted(ESTAT0011_6,Quarta6));
		addConstraint(new isSeted(ESTAT0011_7,Quarta7));
		addConstraint(new isSeted(ESTAT0011_8,Quarta8));
		
		
		Variable COMP0415 = new Variable("COMP0415",0);
		Variable COMP0415_2 = new Variable("COMP0415",1);
		Variable COMP0415_3 = new Variable("COMP0415",2);
		Variable COMP0415_4 = new Variable("COMP0415",3);
		Variable COMP0415_5 = new Variable("COMP0415",5);
		Variable COMP0415_6 = new Variable("COMP0415",6);
		Variable COMP0415_7 = new Variable("COMP0415",7);
		Variable COMP0415_8 = new Variable("COMP0415",8);
		
		addVariable(COMP0415);
		addVariable(COMP0415_2);
		addVariable(COMP0415_3);
		addVariable(COMP0415_4);
		addVariable(COMP0415_5);
		addVariable(COMP0415_6);
		addVariable(COMP0415_7);
		addVariable(COMP0415_8);
		
		
		addConstraint(new isSeted(COMP0415,Segunda9));
		addConstraint(new isSeted(COMP0415_2,Segunda10));
		addConstraint(new isSeted(COMP0415_3,Segunda11));
		addConstraint(new isSeted(COMP0415_4,Segunda12));
		addConstraint(new isSeted(COMP0415_5,Quarta9));
		addConstraint(new isSeted(COMP0415_6,Quarta10));
		addConstraint(new isSeted(COMP0415_7,Quarta11));
		addConstraint(new isSeted(COMP0415_8,Quarta12));
		
		
		Variable MAT0096 = new Variable("MAT0096",0);
		Variable MAT0096_2 = new Variable("MAT0096",1);
		Variable MAT0096_3 = new Variable("MAT0096",2);
		Variable MAT0096_4 = new Variable("MAT0096",3);
		Variable MAT0096_5 = new Variable("MAT0096",5);
		Variable MAT0096_6 = new Variable("MAT0096",6);
		Variable MAT0096_7 = new Variable("MAT0096",7);
		Variable MAT0096_8 = new Variable("MAT0096",8);
		
		addVariable(MAT0096);
		addVariable(MAT0096_2);
		addVariable(MAT0096_3);
		addVariable(MAT0096_4);
		addVariable(MAT0096_5);
		addVariable(MAT0096_6);
		addVariable(MAT0096_7);
		addVariable(MAT0096_8);
		
		
		addConstraint(new isSeted(MAT0096,Terca1));
		addConstraint(new isSeted(MAT0096_2,Terca2));
		addConstraint(new isSeted(MAT0096_3,Terca3));
		addConstraint(new isSeted(MAT0096_4,Terca4));
		addConstraint(new isSeted(MAT0096_5,Quinta1));
		addConstraint(new isSeted(MAT0096_6,Quinta2));
		addConstraint(new isSeted(MAT0096_7,Quinta3));
		addConstraint(new isSeted(MAT0096_8,Quinta4));
		
		
		Variable COMP0409 = new Variable("COMP0409",0);
		Variable COMP0409_2 = new Variable("COMP0409",1);
		Variable COMP0409_3 = new Variable("COMP0409",2);
		Variable COMP0409_4 = new Variable("COMP0409",3);
		Variable COMP0409_5 = new Variable("COMP0409",5);
		Variable COMP0409_6 = new Variable("COMP0409",6);
		Variable COMP0409_7 = new Variable("COMP0409",7);
		Variable COMP0409_8 = new Variable("COMP0409",8);
		
		addVariable(COMP0409);
		addVariable(COMP0409_2);
		addVariable(COMP0409_3);
		addVariable(COMP0409_4);
		addVariable(COMP0409_5);
		addVariable(COMP0409_6);
		addVariable(COMP0409_7);
		addVariable(COMP0409_8);
		
		
		addConstraint(new isSeted(COMP0409,Terca5));
		addConstraint(new isSeted(COMP0409_2,Terca6));
		addConstraint(new isSeted(COMP0409_3,Terca7));
		addConstraint(new isSeted(COMP0409_4,Terca8));
		addConstraint(new isSeted(COMP0409_5,Quinta5));
		addConstraint(new isSeted(COMP0409_6,Quinta6));
		addConstraint(new isSeted(COMP0409_7,Quinta7));
		addConstraint(new isSeted(COMP0409_8,Quinta8));
		
		
		Variable COMP0412 = new Variable("COMP0412",0);
		Variable COMP0412_2 = new Variable("COMP0412",1);
		Variable COMP0412_3 = new Variable("COMP0412",2);
		Variable COMP0412_4 = new Variable("COMP0412",3);
		Variable COMP0412_5 = new Variable("COMP0412",5);
		Variable COMP0412_6 = new Variable("COMP0412",6);
		Variable COMP0412_7 = new Variable("COMP0412",7);
		Variable COMP0412_8 = new Variable("COMP0412",8);
		
		addVariable(COMP0412);
		addVariable(COMP0412_2);
		addVariable(COMP0412_3);
		addVariable(COMP0412_4);
		addVariable(COMP0412_5);
		addVariable(COMP0412_6);
		addVariable(COMP0412_7);
		addVariable(COMP0412_8);
		
		
		addConstraint(new isSeted(COMP0412,Terca9));
		addConstraint(new isSeted(COMP0412_2,Terca10));
		addConstraint(new isSeted(COMP0412_3,Terca11));
		addConstraint(new isSeted(COMP0412_4,Terca12));
		addConstraint(new isSeted(COMP0412_5,Quinta9));
		addConstraint(new isSeted(COMP0412_6,Quinta10));
		addConstraint(new isSeted(COMP0412_7,Quinta11));
		addConstraint(new isSeted(COMP0412_8,Quinta12));
		
		
		
		Variable MAT0154 = new Variable("MAT0154",0);
		Variable MAT0154_2 = new Variable("MAT0154",1);
		Variable MAT0154_3 = new Variable("MAT0154",2);
		Variable MAT0154_4 = new Variable("MAT0154",3);
		Variable MAT0154_5 = new Variable("MAT0154",5);
		Variable MAT0154_6 = new Variable("MAT0154",6);
		Variable MAT0154_7 = new Variable("MAT0154",7);
		Variable MAT0154_8 = new Variable("MAT0154",8);
		
		addVariable(MAT0154);
		addVariable(MAT0154_2);
		addVariable(MAT0154_3);
		addVariable(MAT0154_4);
		addVariable(MAT0154_5);
		addVariable(MAT0154_6);
		addVariable(MAT0154_7);
		addVariable(MAT0154_8);
		
		
		addConstraint(new isSeted(MAT0154,Quarta1));
		addConstraint(new isSeted(MAT0154_2,Quarta2));
		addConstraint(new isSeted(MAT0154_3,Quarta3));
		addConstraint(new isSeted(MAT0154_4,Quarta4));
		addConstraint(new isSeted(MAT0154_5,Sexta1));
		addConstraint(new isSeted(MAT0154_6,Sexta2));
		addConstraint(new isSeted(MAT0154_7,Sexta3));
		addConstraint(new isSeted(MAT0154_8,Sexta4));
		
		
		Variable COMP0417 = new Variable("COMP0417",0);
		Variable COMP0417_2 = new Variable("COMP0417",1);
		Variable COMP0417_3 = new Variable("COMP0417",2);
		Variable COMP0417_4 = new Variable("COMP0417",3);
		
		addVariable(COMP0417);
		addVariable(COMP0417_2);
		addVariable(COMP0417_3);
		addVariable(COMP0417_4);
		
		
		
		addConstraint(new isSeted(COMP0417,Sexta9));
		addConstraint(new isSeted(COMP0417_2,Sexta10));
		addConstraint(new isSeted(COMP0417_3,Sexta11));
		addConstraint(new isSeted(COMP0417_4,Sexta12));
		
		horasDaSemana[0] = horasDaSemana[0] - 12;
		horasDaSemana[1] = horasDaSemana[1] - 12;
		horasDaSemana[2] = horasDaSemana[2] - 12;
		horasDaSemana[3] = horasDaSemana[3] - 12;
		horasDaSemana[4] = horasDaSemana[4] - 8;
		
		String[] ExistemOsBlocos = {"ELET0043", "ESTAT0011", "COMP0415","MAT0096", "COMP0409","COMP0412","MAT0154","COMP0417"};
		VerificaOsBlocos(ExistemOsBlocos, blocos);
	}
	
	
	
	
	public void AddPIBITIouPIBIC(String escolhido, int[] ArrayHorarios) {
		Variable aux;
		int cont = 0;
		int auxTotal = 0;
		
		System.out.println(escolhido);
		for(int i=0; i < 40; i++) {
			aux = new Variable(escolhido, i);
			addVariable(aux);
			if(ArrayHorarios[cont] > 0 && cont < ArrayHorarios.length) {
				addConstraint(new definidorDeDia(aux,cont));
				ArrayHorarios[cont]--;
				horasDaSemana[cont]--;
				auxTotal++;
				if(ArrayHorarios[cont] == 0 && cont < ArrayHorarios.length -1) {
					cont++;
				}
			}
			//System.out.println(escolhido +"  "+i);
		}
		//System.out.println(getVariables());
		if(auxTotal != 40 || ArrayHorarios[ArrayHorarios.length -1] != 0) {
			System.out.print("[ERRO]: Tempo de "+ escolhido +" escolhido apresenta erro:[ERRO]");
			System.exit(0);
		}
	}
	
	public void AddTrabalhoouEstagio(String escolhido, int[] ArrayHorarios) {
		Variable aux;
		int cont = 0;
		for(int i = 0; i < ArrayHorarios.length; i++) {
			for(int f = ArrayHorarios[i]; f > 0; f--) {
				aux = new Variable(escolhido, cont);
				addVariable(aux);
				addConstraint(new definidorDeDia(aux,i));
				horasDaSemana[i]--;
				cont++;
				if(i == 5 ) {
					sabadoLivre = true;
				}
			}
		}

		
	}
	
	//Adiciona as atividades Complementares colocando um dia como objetivo
	public void AddAtividadeComplementar(ArrayList<AtividadesComp> atividades) {
		Variable Atividade;
		int aux = 0;//variavel para ajudar com o problema do nome
		for(AtividadesComp var : atividades) {
			var.CalculaReducaoDeTempo(horasDaSemana);
			for(int tempo = var.getTempo(); tempo > 0; tempo--) {
				//System.out.println(var.getName() +" "+ var.getDia() + " " + tempo);
				Atividade = new Variable(var.getName(), aux);
				addVariable(Atividade);
				addConstraint(new definidorDeDia(Atividade, var.getDia()) );
				aux++;
				
				if(var.getDia() == 5) {
					sabadoLivre = true;
					
				}
			}
			
		}
		
	}
	
	public void AddBlocoDeEstudo(ArrayList<BlocoDeEstudo> blocos) {
		Variable Atividade;
		int count = 0;
		for(BlocoDeEstudo var : blocos) {
			boolean colocado = false;
			int tempoRequisitado = var.getTempo();
			for(int i = 0; i < horasDaSemana.length; i++) {
				if(horasDaSemana[i] - tempoRequisitado >= 0 && colocado == false) {
					horasDaSemana[i] = horasDaSemana[i] - tempoRequisitado;
					for(int j = 0; j < tempoRequisitado; j++) {
						Atividade = new Variable(var.getName(), count);
						addVariable(Atividade);
						addConstraint(new definidorDeDia(Atividade, i) );
						count++;
						colocado = true;
					}
					
				if(i == 5) {
					sabadoLivre = true;
				}
				}
			
			}
			
		}
	}
	
	
	public void AddDescanso(ArrayList<Descanso> listaDescanso) {
		Variable Atividade;
		int count = 0;
		for(Descanso var : listaDescanso) {
			Atividade = new Variable(var.getName(), count);
			addVariable(Atividade);
			addConstraint(new SetDescanso(Atividade,var.getDia() , var.getHora() ));
			count++;
			horasDaSemana[var.getDia()]--;
			if(var.getDia() == 5) {
				sabadoLivre = true;
			}
		}
	}
	
	//TESTE define o dia em que deve ser colocado a variavel
	public void AgregadorRestrictDia(int[] ArrayHorarios, String alvo) {
		int dia = 0; 
		int cont = 0;
		for(Variable var : getVariables()){
			 
			if(var.getName().equals(alvo) && dia < ArrayHorarios.length) {
				 addConstraint(new definidorDeDia(var,dia));
				 ArrayHorarios[dia]--;
				 System.out.println(var.getName() +"  "+ ArrayHorarios[dia]);
				 if(ArrayHorarios[dia] == 0) {
					 dia++;
				 }
			 }
		 }
		//System.out.println("CONTA " + cont + "zeros"+ArrayHorarios[4]);
	}
	
	//Não recebe nenhuma entrada
	//Define que cada varivel deve ter um dominio diferente
	//Define que só pode haver PIBIC ou PIBIT na semana 
	//Define que só pode haver Estagio ou Trabalho
	//Não retorna nada
	public void RestricaoBase() {	
				for(Variable var : getVariables()) {
					for(Variable var2 : getVariables()) {
						if(var != var2) {
							addConstraint(new NotEqualConstraint(var,var2));
							addConstraint(new pibicOUpibiti(var,var2));
							addConstraint(new TrabalhoOuEstagio(var,var2));
						}
					}
				}
	}
	
	
	public MapSemana(int caso, int[] horariosPIBITI, int [] horariosPIBIC, ArrayList<AtividadesComp> atividades , int [] horariosEstagio, 
			int[] horariosTrabalho, ArrayList<BlocoDeEstudo> BlocoDeEstudos, ArrayList<Descanso> listaDescanso) {
		super(Arrays.asList());
		
		
		Domain<horaDia> colors = new Domain<>(
				Segunda1,Segunda2,Segunda3,Segunda4,Segunda5,Segunda6,Segunda7,Segunda8,Segunda9,
				Segunda10,Segunda11,Segunda12,Segunda13,Segunda14,Segunda15,Segunda16,Segunda17,Segunda18,Segunda19,Segunda20,

				Terca1,Terca2,Terca3,Terca4,Terca5,Terca6,Terca7,Terca8,Terca9,
				Terca10,Terca11,Terca12,Terca13,Terca14,Terca15,Terca16,Terca17,Terca18,Terca19,Terca20,
				
				Quarta1,Quarta2,Quarta3,Quarta4,Quarta5,Quarta6,Quarta7,Quarta8,Quarta9,
				Quarta10,Quarta11,Quarta12,Quarta13,Quarta14,Quarta15,Quarta16,Quarta17,Quarta18,Quarta19,Quarta20,
				
				Quinta1,Quinta2,Quinta3,Quinta4,Quinta5,Quinta6,Quinta7,Quinta8,Quinta9,
				Quinta10,Quinta11,Quinta12,Quinta13,Quinta14,Quinta15,Quinta16,Quinta17,Quinta18,Quinta19,Quinta20,
				
				Sexta1,Sexta2,Sexta3,Sexta4,Sexta5,Sexta6,Sexta7,Sexta8,Sexta9,
				Sexta10,Sexta11,Sexta12,Sexta13,Sexta14,Sexta15,Sexta16,Sexta17,Sexta18,Sexta19,Sexta20,
				
				Sabado1,Sabado2,Sabado3,Sabado4,Sabado5,Sabado6,Sabado7,Sabado8,Sabado9,
				Sabado10,Sabado11,Sabado12,Sabado13,Sabado14,Sabado15,Sabado16,Sabado17,Sabado18,Sabado19,Sabado20);
		
		switch(caso) {
			case 1:
				Caso1(BlocoDeEstudos);
				break;
			case 2:
				Caso2(BlocoDeEstudos);
				break;
			case 3:
				Caso3(BlocoDeEstudos);
				break;
			default:
				System.out.println("[AVISO!!!]: Nenhuma aula foi instanciada :[AVISO!!!]");
		}
		
		if(!listaDescanso.isEmpty()) {
			AddDescanso(listaDescanso);
		}
		
		if(horariosPIBITI.length > 0) {
			AddPIBITIouPIBIC("PIBITI",horariosPIBITI); 
		}
		if(horariosPIBIC.length > 0) {
			AddPIBITIouPIBIC("PIBIC",horariosPIBIC);
	
		}
		
		if(horariosEstagio.length > 0) {
			AddTrabalhoouEstagio("Estagio",horariosEstagio);
			//AgregadorRestrictDia(horariosPIBITI,"PIBITI");
		}
		if(horariosTrabalho.length > 0) {
			AddTrabalhoouEstagio("Trabalho",horariosTrabalho);
			//AgregadorRestrictDia(horariosPIBIC,"PIBIC");
		}
		
		if(!atividades.isEmpty()) {
			AddAtividadeComplementar(atividades);
		}
		
		if(!BlocoDeEstudos.isEmpty()) {
			AddBlocoDeEstudo(BlocoDeEstudos);
		}
		System.out.println(horasDaSemana[0] +" "+horasDaSemana[1] +" "+horasDaSemana[2] +" "+horasDaSemana[3] +" "+horasDaSemana[4] +" " + horasDaSemana[5] +" ");
		
		for (Variable var : getVariables()) {
			addConstraint(new sabadoTaOK(var,sabadoLivre));
			setDomain(var, colors);
		}
		
		
		
	   RestricaoBase();//Adiciona as restrições base do MapSemana
	   //System.out.println(getVariables());
	}

	
}