//2. Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem O n�mero informado foi [n�mero].

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class InformaNumero {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = scan.nextInt();
		System.out.println("Voc� digitou: "+ numero);

	}

}
