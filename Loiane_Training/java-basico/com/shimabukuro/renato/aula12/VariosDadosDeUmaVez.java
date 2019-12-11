package com.shimabukuro.renato.aula12;

import java.util.Scanner;

public class VariosDadosDeUmaVez {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//digitar as informações tudo na mesma linha com espaço entre dos dados. float com virgula, boolean com true ou false
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animal de estimação: ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos= scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores: ");
		System.out.println("Primeiro nome:" + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem animal de estimação: " +temPet);
		

	}

}
