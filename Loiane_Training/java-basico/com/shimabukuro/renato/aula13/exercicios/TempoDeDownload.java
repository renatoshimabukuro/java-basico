/*14. Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).*/

package com.shimabukuro.renato.aula13.exercicios;

import java.util.Scanner;

public class TempoDeDownload {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);

		System.out.print("Digite o tamanho do arquivo para download (MB): ");
		double arquivo = scan.nextDouble();

		System.out.print("Digite a velocidade de um link de internet em Mbps: ");
		double Mbps = scan.nextDouble();
		double tempoDeDownload = arquivo / Mbps;
		
		System.out.print("O tempo estimado para o download é de: "+ tempoDeDownload + " minutos");
		
	}

}
