package secao22RecursosAvancados;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import secao09OrientacaoObjetos.Conta;
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

public class Programa76 {

	public static void main(String[] args) {
		List<Conta> carteira = new LinkedList<Conta>();
		
		carteira.add( new Conta( 300,  500, new Pessoa("Maria",    LocalDate.of(1980,  2, 25))));
		carteira.add( new Conta( 100,  100, new Pessoa("Pedro",    LocalDate.of(1981,  7,  2))));
		carteira.add( new Conta(1000, 1500, new Pessoa("Ana",      LocalDate.of(1975,  5, 12))));
		carteira.add( new Conta(  50,  400, new Pessoa("José",     LocalDate.of(2003, 11, 30))));
		carteira.add( new Conta( 560,  300, new Pessoa("Bárbara",  LocalDate.of(1998,  4, 16))));
		carteira.add( new Conta(1800, 1100, new Pessoa("Bruna",    LocalDate.of(2001, 12, 19))));
		carteira.add( new Conta(   0,  350, new Pessoa("Melissa",  LocalDate.of(2000,  1, 31))));
		carteira.add( new Conta( 746,  600, new Pessoa("Cleysson", LocalDate.of(1977,  8, 21))));
		carteira.add( new Conta( 150,  200, new Pessoa("Clara",    LocalDate.of(2010,  7,  3))));
		carteira.add( new Conta( 300,  250, new Pessoa("Victor",   LocalDate.of(2010,  7,  3))));
		
		// Uso de Method Reference para Ordenar a carteira de clientes com base na data de nacimento
		carteira.sort( (p, q) -> p.getCliente().getNascimento().compareTo(q.getCliente().getNascimento()) );
		System.out.println("[Carteira de clients ordenada por data de nascimento]");
		System.out.println(carteira);
		System.out.println("");
		
		// Uso de stream para filtrar as contas com saldo maior que 500
		long total = carteira.stream()
				.filter(c -> c.getSaldo() > 500)
				.count();
		System.out.println("Existem " + total + " contas com mais de R$ 500,00 de saldo. ");
		System.out.println("");
		
		// Uso de stream para somar o saldo de todas as contas de clientes que nasceram até 1980
		double soma = carteira.stream().
				filter(c -> c.getCliente().getNascimento().getYear() <= 1980)
				.mapToDouble(Conta::getSaldo)
				.sum();
		System.out.println("As pessoas que nasceram até 1980 possuem um saldo total de R$ " + soma);
		System.out.println("");
		
		// Uso de stream para imprimir o nome do cliente e o nº da conta, caso seu saldo esteja entre 300 e 1000
		System.out.println("[Carteira de clientes com saldo entre 300 e 1000]");
		carteira.stream()
				.filter(c -> c.getSaldo() >= 300 && c.getSaldo() <= 1000)
				.forEach(c -> System.out.println(c.getCliente().getNome() + " R$ " + c.getSaldo()));
		System.out.println("");
		
		// Usa parallelStream para imprimir a carteria de clientes com saldo inferior a 1000
		List<Conta> carteira_customizada =	carteira.parallelStream()
				.filter(c -> c.getSaldo() < 1000)
				.collect(Collectors.toList());
		System.out.println("[Carteira de clientes com saldo inferior a 1000]");
		System.out.println(carteira_customizada);
		System.out.println("");
		
		// Seleciona as contas de pessoas com saldo inferior a 500 e monta uma lista com o resultado
		Map<Integer, String> carteira_basica =	carteira.stream()
				.filter(c -> c.getSaldo() < 500)
				.collect(Collectors.toMap(c-> c.getNumero(), c-> c.getCliente().getNome() + " R$ " + c.getSaldo()));
		System.out.println("[Carteira de clientes com saldo inferior a R$ 500,00]");
		System.out.println(carteira_basica.values());
		System.out.println("");
		
		// Seleciona as contas de pessoas que nasceram após 2000 e monta um mapa para exibição do nome e saldo
		Map<Integer, String> carateira_jovens = carteira.stream()
									.filter(c-> c.getCliente().getNascimento().getYear() > 2000)
									.collect(Collectors.toMap(c-> c.getNumero(), c -> c.getCliente().getNome() + "R$ " + c.getSaldo()));
		System.out.println("[Carteir de clientes que nasceram a partir do ano 2000]");
		System.out.println(carateira_jovens.values());
		System.out.println("");
		
	}

}
