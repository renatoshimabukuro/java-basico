/*12. Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58*/

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class PesoIdeal {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.print("Digite sua altura: ");
		double altura = scan.nextDouble();
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.print("Seu peso ideal é: " + pesoIdeal);
		
	}

}
