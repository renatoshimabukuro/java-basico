/*13. Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido*/

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class CalculaSalarioComDescontos {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.print("Digite o valor que você ganha por hora: R$");
		double valorHora = scan.nextDouble();
		System.out.print("Digite o número de horas trabalhadas no mês: ");
		double hora = scan.nextDouble();
		
		double salario = valorHora * hora;
		double ir = salario * 0.11;
		double inss = salario * 0.08;
		double sindicato = salario * 0.05;
		
		System.out.println("O valor do INSS é: R$" + inss);
		System.out.println("O valor do sindicato é: R$" + sindicato);
		System.out.println("O valor do imposto de renda é: R$" + ir);
		System.out.println("Seu salário liquido é: R$" + (salario - ir - inss - sindicato));
	}

}
