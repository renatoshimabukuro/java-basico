//5. Fa�a um Programa que converta metros para cent�metros.

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class ConverteMetros {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.print("Digite uma medida em metros: ");
		double metro = scan.nextDouble();
		
		double conversao = metro * 100;
		System.out.print("Medida em centimetros: " + conversao);		
		
		

	}

}
