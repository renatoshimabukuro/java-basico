/*8. Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês.*/

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class CalculaSalarioHora {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.print("Digite o valor que você ganha por hora: R$");
		double valorHora = scan.nextDouble();
		System.out.print("Digite o número de horas trabalhadas no mês: ");
		double hora = scan.nextDouble();
		
		double salario = valorHora * hora;
		System.out.println("Seu salário será: R$" + salario);

	}

}
