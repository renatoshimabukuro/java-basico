package com.shimabukuro.renato.aula11;

public class VariaveisInteiras {

	public static void main(String[] args) {
		
		byte idade01 = 20;
		short idade02= 21;
		int idade03 = 22;
		long idade04 = 23l; //por padr�o colocar o 'l' no final
		int hexVal = 0x1a; //valor hexadecimal para 26
		int octVal = 032; //valor octaval para 26
		int binVal = 0b11010; //valor bin�rio para 26 (a partir do JDK 7)
		
		System.out.println("Valor vari�vel idade01 = " + idade01);
		System.out.println("Valor vari�vel idade02 = " + idade02);
		System.out.println("Valor vari�vel idade03 = " + idade03);
		System.out.println("Valor vari�vel idade04 = " + idade04);
		System.out.println("Valor vari�vel hexadecimal  = " + hexVal);
		System.out.println("Valor vari�vel octaval  = " + octVal);
		System.out.println("Valor vari�vel bin�rio  = " + binVal);
	}

}
