package com.loiane.cursojava.aula65_anotations;

@InformacaoAula(
	autor = "Loiane",
	aulaNumero = 65,
	blog = "loiane.com"
)
public class Teste {

	@InformacaoAula(
			autor = "Loiane",
			aulaNumero = 65,
			blog = "loiane.com"
		)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
