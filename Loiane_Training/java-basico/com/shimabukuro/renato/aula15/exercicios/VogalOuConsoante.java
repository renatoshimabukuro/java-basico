package com.shimabukuro.renato.aula15.exercicios;

import java.util.Scanner;

public class VogalOuConsoante {
	
	private static Scanner scan;
	
	public static void main(String []args) {
		
		scan = new Scanner (System.in);
				
		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida");
		}
		
//		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
//				letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || 
//				letra.equalsIgnoreCase("u")) {
//			System.out.println("A letra digitada foi uma vogal.");
//			
//		}else {
//			System.out.println("A letra digitada foi uma consoante.");
//		}
		
//exemplo com Switch
		switch(letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u": 
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":System.out.println("A letra digitada foi uma vogal.");
		break;
		default: System.out.println("A letra digitada foi uma consoante.");
		
		}
				
	}
	
}
