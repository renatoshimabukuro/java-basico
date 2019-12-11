/*10. Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.*/

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class CelsiusFarenheit {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);

		System.out.print("Digite o valor de temperatura em Celsius: ");
		double celsius = scan.nextDouble();
		
		double farenheit = ((celsius / 5)*9+32);
		
		System.out.println("Graus Farenheit: " + farenheit);
	}

}
