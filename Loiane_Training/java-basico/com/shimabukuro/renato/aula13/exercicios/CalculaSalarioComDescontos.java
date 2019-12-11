/*13. Fa�a um Programa que pergunte quanto voc� ganha por hora e o
n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um
programa que nos d�:
. sal�rio bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o sal�rio l�quido.
d. calcule os descontos e o sal�rio l�quido, conforme a tabela
abaixo:
+ Sal�rio Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Sal�rio
Liquido*/

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class CalculaSalarioComDescontos {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.print("Digite o valor que voc� ganha por hora: R$");
		double valorHora = scan.nextDouble();
		System.out.print("Digite o n�mero de horas trabalhadas no m�s: ");
		double hora = scan.nextDouble();
		
		double salario = valorHora * hora;
		double ir = salario * 0.11;
		double inss = salario * 0.08;
		double sindicato = salario * 0.05;
		
		System.out.println("O valor do INSS �: R$" + inss);
		System.out.println("O valor do sindicato �: R$" + sindicato);
		System.out.println("O valor do imposto de renda �: R$" + ir);
		System.out.println("Seu sal�rio liquido �: R$" + (salario - ir - inss - sindicato));
	}

}
