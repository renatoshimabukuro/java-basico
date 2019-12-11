package com.shimabukuro.renato.aula11;

public class VariaveisInteiras {

	public static void main(String[] args) {
		
		byte idade01 = 20;
		short idade02= 21;
		int idade03 = 22;
		long idade04 = 23l; //por padrão colocar o 'l' no final
		int hexVal = 0x1a; //valor hexadecimal para 26
		int octVal = 032; //valor octaval para 26
		int binVal = 0b11010; //valor binário para 26 (a partir do JDK 7)
		
		System.out.println("Valor variável idade01 = " + idade01);
		System.out.println("Valor variável idade02 = " + idade02);
		System.out.println("Valor variável idade03 = " + idade03);
		System.out.println("Valor variável idade04 = " + idade04);
		System.out.println("Valor variável hexadecimal  = " + hexVal);
		System.out.println("Valor variável octaval  = " + octVal);
		System.out.println("Valor variável binário  = " + binVal);
	}

}
