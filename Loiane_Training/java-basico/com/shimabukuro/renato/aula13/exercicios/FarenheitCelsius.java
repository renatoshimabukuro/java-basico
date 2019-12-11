/*09. Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.*/
//C = (5 * (F-32) / 9).

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class FarenheitCelsius {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);

		System.out.print("Digite o valor de temperatura em Farenheit: ");
		double farenheit = scan.nextDouble();
		
		double celsius = (5*(farenheit-32)/9);
		
		System.out.println("Graus Celsius: " + celsius + "°");
	}

}
