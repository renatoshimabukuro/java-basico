package com.shimabukuro.renato.aula15.exercicios;

import java.util.Scanner;

public class MaiorNumero {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num_01 = scan.nextInt();

		System.out.println("Digite outro número: ");
		int num_02 = scan.nextInt();

		if (num_01 > num_02) {
			System.out.println("O maior número digitado foi: " + num_01);
		} else {
			System.out.println("O maior número digitado foi: " + num_02);
		}
	}

}
