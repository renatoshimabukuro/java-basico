package com.shimabukuro.renato.aula15.exercicios;

import java.util.Scanner;

public class MaiorNumero {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int num_01 = scan.nextInt();

		System.out.println("Digite outro n�mero: ");
		int num_02 = scan.nextInt();

		if (num_01 > num_02) {
			System.out.println("O maior n�mero digitado foi: " + num_01);
		} else {
			System.out.println("O maior n�mero digitado foi: " + num_02);
		}
	}

}
