//6. Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class AreaCirculo {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.print("Informe o raio do circulo: ");
		double raio = scan.nextDouble();
		double area = Math.pow(raio, 2) * Math.PI;
		
		System.out.print("A �rea do c�rculo �: " + area);
		

	}

}
