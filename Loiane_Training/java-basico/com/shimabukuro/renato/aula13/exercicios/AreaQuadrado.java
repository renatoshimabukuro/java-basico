//7. Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio.

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class AreaQuadrado {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.print("Digite o valor do lado do quadrado: ");
		double lado = scan.nextDouble();
		double area = Math.pow(lado, 2);
		double areaDobro = area * 2;
		System.out.println("�rea do quadrado: " + area);
		System.out.println("Dobro da �rea do quadrado: " + areaDobro);	
		

	}

}
