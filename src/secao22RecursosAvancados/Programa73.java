package secao22RecursosAvancados;
import java.util.ArrayList;
import java.util.List;

/*
 * Expressões Lambdas
 * - São uma forma simples de codificar uma classe anônima para implementar uma interface funcional;
 * - Interfaces funcionais são aquelas que possuem somente um método e são usadas como métodos de comparação,
 *   consumo ou produção;
 * - Um método lâmbda sempres possui os caracteres "->"
 * - Se houver mais de um parâmetro de entrada do método a ser implementado, então deve haver parênteses
 *   na declaração dos parâmetros;
 * - Caso o lambda possua somente uma linha, então os parênteses e ponto e vírgula podem ser dispensados;
 * 
 * */

public class Programa73 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Corinthians");
		palavras.add("Flamengo");
		palavras.add("Fluminense");
		palavras.add("Palmeiras");
		palavras.add("Internacional");
		palavras.add("Atlético  MG");
		palavras.add("Santa Cruz");
		palavras.add("Brasil de Pelotas");
		palavras.add("São Paulo");
		
		// Lâmbda com 1 parâmetro - Forma 1
		// O default method "forEach" recebe um objeto do tipo Consumer<T>
		// A inteface Consumer<T> só possui o método "accept" que recebe um obejto T e retorna void.
		palavras.forEach( s -> {
			System.out.println(s);
		});
		
		// Lâmbda com 1 parâmetro - Forma 2
		palavras.forEach( s -> System.out.println(s) );
		
		
		// Lâmbda com 2 parâmetro - Forma 1
		// O default method "sort" recebe um objeto do tipo Comparator<T,T>
		// A inteface Compartor<T,T> só possui o método "compare" que recebe dois obejtos (T1,T2)
		// e retorna -1 (T1 < T2), 0 (T1==T2) ou 1 (T1>T2).
		palavras.sort( (s1, s2) -> {
			return (s1.length() - s2.length()) % 2;
		});
		
		// Lâmbda com 2 parâmetro - Forma 2
		palavras.sort( (s1, s2) -> Integer.compare(s1.length(),s2.length()) );
		
		System.out.println(palavras);
		
	}

}
