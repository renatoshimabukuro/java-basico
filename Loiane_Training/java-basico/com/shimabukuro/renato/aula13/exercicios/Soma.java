//3. Faça um Programa que peça dois números e imprima a soma

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class Soma {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int valor1 = scan.nextInt();
		
		System.out.print("Digite outro valor: ");
		int valor2 = scan.nextInt();
		

		int resultado = valor1 + valor2;
		System.out.print("O resultado da soma dos dois valores é: " + resultado);
	}

}
