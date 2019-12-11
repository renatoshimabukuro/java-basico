package com.shimabukuro.renato.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//ler uma linha inteira
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: "+ nomeCompleto);

		//ler somente a pr�xima palavra
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: "+ primeiroNome);
		
		//ler int
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: "+ idade);
		
		//ler double -> a separa��o est� feita co virgula porque est� pegando o padr�o local do sistema
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura �: "+ altura);

	}

}
