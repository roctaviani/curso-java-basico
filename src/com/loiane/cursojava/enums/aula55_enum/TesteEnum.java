package com.loiane.cursojava.enums.aula55_enum;

import com.loiane.cursojava.enums.aula54_enum.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana[] dias = DiaSemana.values();

		for (int i=0; i<dias.length; i++){
			System.out.println(dias[i]);
		}
		
		for (DiaSemana dia : DiaSemana.values()){
			System.out.println(dia);
		}
		
		
	}

}
