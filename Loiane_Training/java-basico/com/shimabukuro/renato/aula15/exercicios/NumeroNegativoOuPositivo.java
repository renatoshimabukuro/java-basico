package com.shimabukuro.renato.aula15.exercicios;

import java.util.Scanner;

public class NumeroNegativoOuPositivo {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println ("Digite um número: ");
		int num = scan.nextInt();
		
		if (num >=0) {
			System.out.println("O número digitado é positivo");
		}else {
			System.out.println("O número digitado é negativo");
		}
		
	}

}
