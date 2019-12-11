package com.shimabukuro.renato.aula15.exercicios;

import java.util.Scanner;

public class SexoMascOuFem {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Digite (M) para Masculino ou (F) para Feminino: ");
		String sexo = scan.next();

		if (sexo.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		} else if (sexo.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Letra Inválida");
		}

	}

}
