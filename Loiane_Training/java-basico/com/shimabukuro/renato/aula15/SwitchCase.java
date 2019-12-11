package com.shimabukuro.renato.aula15;

import java.util.Scanner;

public class SwitchCase {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.print("Entre com um dia da semana (1-7): ");
		int diaSemana = scan.nextInt();

		
		
		if (diaSemana == 1) {
			System.out.println("Domingo");
		}else if (diaSemana == 2) {
			System.out.println("Segunda");
		}else if (diaSemana == 3) {
			System.out.println("Terça");
		}else if (diaSemana == 4) {
			System.out.println("Quarta");
		}else if (diaSemana == 5) {
			System.out.println("Quinta");
		}else if (diaSemana == 6) {
			System.out.println("Sexta");
		}else if (diaSemana == 7) {
			System.out.println("Sábado");
		}else {
			System.out.println("Não é um dia válido.");
		}
		
		switch (diaSemana) {
		case 1: System.out.println("Sunday"); 
		break;
		case 2: System.out.println("Monday"); 
		break;
		case 3: System.out.println("Tusday"); 
		break;
		case 4: System.out.println("Wednesday"); 
		break;
		case 5: System.out.println("Thursday"); 
		break;
		case 6: System.out.println("Friday"); 
		break;
		case 7: System.out.println("Saturday"); 
		break;
		default: System.out.println("Not accepted"); 
		}
		switch (diaSemana) {
		case 2: 
		case 3:
		case 4:
		case 5:
		case 6: System.out.println("Dia da semana"); 
		break;
		case 1:
		case 7: System.out.println("Fim de semana"); 
		break;
		default: System.out.println("Not accepted"); 
		}
		
		System.out.print("Digite um dia da semana:");
		String diaSemanaNumerico = scan.next();
		switch (diaSemanaNumerico) {
		case "Segunda": System.out.println(2); 
		break;
		case "Terça": System.out.println(3); 
		break;
		case "Quarta": System.out.println(4); 
		break;
		case "Quinta": System.out.println(5); 
		break;
		case "Sexta": System.out.println(6); 
		break;
		case "Sábado": System.out.println(7); 
		break;
		case "Domingo": System.out.println(1); 
		break;
		default: System.out.println("Not accepted"); 
		}
	}

}
