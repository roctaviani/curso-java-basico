package com.loiane.cursojava.enums.aula54_enum;

public class Formulario {
	
	enum Genero {
		FEMININO('F'), MASCULINO('M');
		
		private char valor;
		
		Genero(char valor){
			this.valor = valor;
		}
	}

	private String nome;
	private Genero genero;
}
