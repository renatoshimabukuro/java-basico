package com.shimabukuro.renato.aula15.exercicios;

import java.util.Scanner;

public class AprovadoOuReprovado {

	private static Scanner scan;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scan = new Scanner(System.in);
		double nota01;
		double nota02;
		double result;
		
		System.out.println("Digite a primeira nota");
		nota01 = scan.nextDouble();
		System.out.println("Digite a segunda nota");
		nota02 = scan.nextDouble();
		result = (nota01 + nota02)/2;
		
		if (result == 10) {
			System.out.println("Aprovado com Distinção");
		}else if(result >= 7 && result < 10) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		
	}

}
