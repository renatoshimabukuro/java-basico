package com.shimabukuro.renato.aula11;

public class CuriosidadeInt {

	public static void main(String[] args) {
		
		int valorMaximo = 2147483647; //Caso coloque 2147483648 exceder� o limite m�ximo
		int var = 1;
		
		//31 em octal tem o mesmo valor  que 25 decimal
		int oct31 = 031;
		int dec25 = 25;
		
		System.out.println(valorMaximo + var);//Voltar� para o valor negativo -2147483648
		System.out.println(oct31 == dec25); //ser� true
	}

}
