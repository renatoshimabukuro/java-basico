/*11.Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.*/

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class CalculosComDoisNumeros {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int numero1 = scan.nextInt();
		System.out.print("Digite outro n�mero inteiro: ");
		int numero2 = scan.nextInt();
		System.out.print("Digite um n�mero real: ");
		double numero3 = scan.nextDouble();
		
		int produto = (numero1 * 2) * (numero2/2);
		double soma = (numero1*3) + numero3;
		double cubo = Math.pow(numero3, 3);
		
		System.out.println("Produto do dobro do primeiro com metade do segundo: "+ produto);
		System.out.println("Soma do triplo do primeiro com o terceiro: " + soma);
		System.out.print("Terceiro elevado ao cubo: "+ cubo);

	}

}
