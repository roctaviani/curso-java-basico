package com.loiane.cursojava.aula63_formatstring;

public class ExemploPrintf {

	public static void main(String[] args) {

		//String
		System.out.println("-- String --");
		System.out.printf("%s", "Olá, Mundo!");
		System.out.println("\n");
		
		//String Maiuscula
		System.out.println("-- String Maiúscula --");
		System.out.printf("%S", "Olá, Mundo!");
		System.out.println("\n");

		//Caracter
		System.out.println("-- Caracter --");
		System.out.printf("%c", 'c');
		System.out.println("\n");
		
		//Caracter Maiuscula
		System.out.println("-- Caracter Maiúscula --");
		System.out.printf("%C", 'c');
		System.out.println("\n");

		//Pular linha
		System.out.println("-- Pular linha --");
		System.out.printf("%n");

		//Inteiro
		System.out.println("-- Inteiro --");
		int valor = 123456789;
		System.out.printf("%d", valor);
		System.out.println("\n");

		//Ponto flutuante
		System.out.println("-- Ponto flutuante --");
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);
		System.out.println("\n");

		//LPAD com 20 caracteres
		System.out.println("-- LPAD com 20 caracteres --");
		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo);
		System.out.println("\n");
		
		//LPAD com 15 caracteres com valor
		System.out.println("-- LPAD com 15 caracteres com valor --");
		System.out.printf("%015d", valor);
		System.out.println("\n");

		//RPAD com 20 caracteres
		System.out.println("-- RPAD com 20 caracteres --");
		System.out.printf("%-20s", olaMundo);
		System.out.println("\n");
		
		//Imprime o sinal do valor (+ para positivo ou - para negativo)
		System.out.println("-- Imprime o sinal do valor (+ para positivo ou - para negativo) --");
		System.out.printf("%+d", valor);
		System.out.println("\n");

		//Para positivos não exibe o sinal, mas para negativos exibe o sinal
		System.out.println("-- Para positivos não exibe o sinal, mas para negativos exibe o sinal --");
		int valor2 = -123456789;
		System.out.printf("% d", valor2);
		System.out.println();
		System.out.printf("% d", valor);
		System.out.println("\n");
				
		//Separador de milhar
		System.out.println("-- Separador de milhar --");
		System.out.printf("%,d", valor); //usem ,
		System.out.println("\n");
		
		//Arredonda as casas decimais
		System.out.println("-- Arredonda as casas decimais --");
		System.out.printf("%.3f", pontoFlutuante);
		System.out.println("\n");

		//Para valores monetarios
		System.out.println("-- Para valores monetarios --");
		System.out.printf("R$%10.2f", pontoFlutuante);
		System.out.println("\n");

		testeMaisCompleto();
	}
	
	private static void testeMaisCompleto(){
		
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for (int i=0; i<precos.length; i++){
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}
	}
}
