/*8. Fa�a um Programa que pergunte quanto voc� ganha por hora e o
n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
sal�rio no referido m�s.*/

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class CalculaSalarioHora {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.print("Digite o valor que voc� ganha por hora: R$");
		double valorHora = scan.nextDouble();
		System.out.print("Digite o n�mero de horas trabalhadas no m�s: ");
		double hora = scan.nextDouble();
		
		double salario = valorHora * hora;
		System.out.println("Seu sal�rio ser�: R$" + salario);

	}

}
