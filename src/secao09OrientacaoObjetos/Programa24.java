package secao09OrientacaoObjetos;

import java.time.LocalDate;

import secao12HerancaPolimorfismo.Pessoa;

// Construtores

/*
 * A JAVA VM cria um construtor default em tempo de execução SEM parâmetros, caso não haja NENHUM construtor definido.
 * Se pelo menos um construtor foi definido, a JAVA VM NÃO cria um defautlt.
 *
 * */

public class Programa24 {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("José da Silva");
		
		pessoa1.setNascimento(LocalDate.of(2000, 10, 1));
		
		Pessoa pessoa2 = new Pessoa("Maria Rita", "Rua das Esmeraldas, 185", "mary2000@gmail.com", LocalDate.of(2000,2,13));
		
		System.out.println(pessoa1);
		
		System.out.println("");
		
		System.out.println(pessoa2);
		
	}
	
}
