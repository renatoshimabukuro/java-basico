package com.shimabukuro.renato.aula15.exercicios;

import java.util.Scanner;

public class TresNumerosDecrescente {

		private static Scanner scan;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);
		
		int numero01 = 0;
		int numero02 = 0;
		int numero03 = 0;
		
		System.out.println("Digite um número");
			numero01 = scan.nextInt();
		System.out.println("Digite outro número");
			numero02 = scan.nextInt();
		System.out.println("Digite outro número");
			numero03 = scan.nextInt();
			
		if(numero01 > numero02 && numero01 > numero03 && numero02 > numero03) {
			System.out.println("Em ordem decrescente: "+ numero01 + ", "+ numero02 + ", " + numero03 );
		}else if(numero01 > numero02 && numero01 > numero03 && numero02 < numero03) {
			System.out.println("Em ordem decrescente: "+ numero01 + ", "+ numero03 + ", " + numero02 );
		}else if(numero02 > numero01 && numero02 > numero03 && numero01 > numero03){
			System.out.println("Em ordem decrescente: "+ numero02 + ", "+ numero01 + ", " + numero03 );
		}else if(numero02 > numero01 && numero02 > numero03 && numero01 < numero03){
			System.out.println("Em ordem decrescente: "+ numero02 + ", "+ numero03 + ", " + numero01 );
		}else if(numero03 > numero01 && numero03 > numero02 && numero02 > numero01){
			System.out.println("Em ordem decrescente: "+ numero03 + ", "+ numero02 + ", " + numero01 );
		}else if(numero03 > numero01 && numero03 > numero02 && numero02 < numero01){
			System.out.println("Em ordem decrescente: "+ numero03 + ", "+ numero01 + ", " + numero02 );
		}
	}

}
