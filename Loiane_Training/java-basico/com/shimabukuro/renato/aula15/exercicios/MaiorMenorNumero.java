package com.shimabukuro.renato.aula15.exercicios;

import java.util.Scanner;

public class MaiorMenorNumero {
	
	public static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);
		
		int numero01 = 0;
		int numero02 = 0;
		int numero03 = 0;
		int maior = 0;
		int menor = 0;
		
		System.out.println("Digite um número");
			numero01 = scan.nextInt();
		System.out.println("Digite outro número");
			numero02 = scan.nextInt();
		System.out.println("Digite outro número");
			numero03 = scan.nextInt();
		
		if(numero01 > numero02 && numero01 > numero03) {
			maior = numero01;
		}else if(numero02 > numero01 && numero02 > numero03){
			maior = numero02;
		}else if(numero03 > numero01 && numero03 > numero02){
			maior = numero03;
		}
		
		if(numero01 < numero02 && numero01 < numero03) {
			menor = numero01;
		}else if(numero02 < numero01 && numero02 < numero03){
			menor = numero02;
		}else if(numero03 < numero01 && numero03 < numero02){
			menor = numero03;
		}
		
		System.out.println("O maior número digitado foi: " + maior);
		System.out.println("O menor número digitado foi: " + menor);
	}

}
