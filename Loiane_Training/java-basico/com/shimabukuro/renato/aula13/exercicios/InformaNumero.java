//2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class InformaNumero {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		System.out.println("Você digitou: "+ numero);

	}

}
