package com.shimabukuro.renato.aula13;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		int resultado = 1+2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;//resto do resultado dividido por 7
		System.out.println(resultado);
		
		String primeiroNome = "Esta � ";
		String segundoNome = "uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		

		
		System.out.println("Teste com valor: "+ resultado);
		
		System.out.println(resultado++);//primeiro � feito o print do resultado, depois somado 1
		System.out.println(resultado);//a soma aparecer� agora
		System.out.println(++resultado);// � somado depois impresso
		
		
		System.out.println(resultado--);//primeiro � feito o print do resultado, depois subtraido 1
		System.out.println(resultado);//o resultado aparecer� agora
		System.out.println(--resultado);// � subtraido depois impresso
	}

}
