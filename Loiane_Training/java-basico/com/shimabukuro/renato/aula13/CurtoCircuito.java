package com.shimabukuro.renato.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & 
				verdadeiro;;//no debug ser� verificado essa linha
		boolean resultado2 = falso && 
				verdadeiro; //no debug n�o ser� verificado essa linha, pois o primeiro valor j� � falso
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado);

	}

}
