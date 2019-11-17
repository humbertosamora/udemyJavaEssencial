package secao22RecursosAvancados;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import secao12HerancaPolimorfismo.Pessoa;

/* 
 * Streams
 * - São fluxos de dados/objetos gerados a partir de uma estrutura de objetos (lista, array, etc.)
 * - Permite aplicar filtros para trabalhar de forma mais criteriosa os objetos
 * - NÃO modifica o interior dos objetos
 * - Permite fazer mapeamento de dados para Integer, Float e Double e aplicar somatório
 * - Quando houver grande Nº de dados pode-se usar a função "parallelStrem()" para dividir para mais de uma Thread 
 * 
 * */

public class Programa75 {
	public static void main(String[] args) {
		List<Pessoa> grupo = new LinkedList<Pessoa>();
		
		grupo.add( new Pessoa("Maria", LocalDate.of(1980, 2, 25)));
		grupo.add( new Pessoa("Pedro", LocalDate.of(1980, 7, 2)));
		grupo.add( new Pessoa("Ana", LocalDate.of(1975, 5, 12)));
		grupo.add( new Pessoa("José", LocalDate.of(2003, 11, 30)));
		grupo.add( new Pessoa("Bárbara", LocalDate.of(1998, 4, 16)));
		grupo.add( new Pessoa("Bruna", LocalDate.of(2001, 12, 19)));
		grupo.add( new Pessoa("Melissa", LocalDate.of(2000, 1, 31)));
		grupo.add( new Pessoa("Cleysson", LocalDate.of(1977, 8, 21)));
		grupo.add( new Pessoa("Clara", LocalDate.of(2010, 7, 3)));
		grupo.add( new Pessoa("Victor", LocalDate.of(2010, 7, 3)));
		
		// Uso de Method Reference para Ordenar o grupo por data de nascimento
		grupo.sort(Comparator.comparing(Pessoa::getNascimento));
		
		// Uso de stream para filtar as pessoas que nasceram a partir do ano 2000
		grupo.stream()
			.filter(c -> c.getNascimento().getYear() >= 2000)
			.forEach(System.out::println);
		
		// Uso de stream para imprimir a data de aniversários das pessoas que nasceram antes de 2000
		grupo.stream()
			.filter(c -> c.getNascimento().getYear() < 2000)
			.forEach(s -> System.out.println(s.getNascimento().getYear()));
		
	}
}
