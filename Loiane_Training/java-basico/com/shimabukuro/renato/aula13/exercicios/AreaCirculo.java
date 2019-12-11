//6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class AreaCirculo {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.print("Informe o raio do circulo: ");
		double raio = scan.nextDouble();
		double area = Math.pow(raio, 2) * Math.PI;
		
		System.out.print("A área do círculo é: " + area);
		

	}

}
