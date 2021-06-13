package com.loiane.cursojava.aula65_anotations;

@interface InformacaoAula {

	String autor();
	
	int aulaNumero();
	
	String blog() default "http://loiane.com";
	
	String site() default "http://loiane.training";
}
