package com.shimabukuro.renato.aula15.exercicios;

import java.util.Scanner;

public class ProdutoBarato {
	
	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);
		double preco01 = 0;
		double preco02 = 0;
		double preco03 = 0;
		String produto01;
		String produto02;
		String produto03;
		
		System.out.println("Digite o nome do produto: ");
			produto01 = scan.next();
		System.out.println("Digite o preço do produto: R$");
			preco01 = scan.nextDouble();
		System.out.println("Digite o nome do produto: ");
			produto02 = scan.next();
		System.out.println("Digite o preço do produto: R$");
			preco02 = scan.nextDouble();
		System.out.println("Digite o nome do produto: ");
			produto03 = scan.next();
		System.out.println("Digite o preço do produto: R$");
			preco03 = scan.nextDouble();
			
		if(preco01 < preco02 && preco01 < preco03) {
			System.out.println("Você deve comprar " + produto01);
		}else if(preco02 < preco01 && preco02 < preco03) {
			System.out.println("Você deve comprar " + produto02);
		}else {
			System.out.println("Você deve comprar " + produto03);
		}
	}

}
