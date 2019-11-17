package secao22RecursosAvancados;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/* Default Methods
 * - A partir do Java 8 (1.8) as interfaces podem possuir métodos concretos
 * - Para isso é necessário que seja inserida a palavra "default" antes da declaração do método
 * - Esses métodos são úteis quando sua execução for igual em várias classes que implementar a interface
 *
 * */
public class Programa66 {

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

		// Imprime a lista sem ordenação
		System.out.print(palavras);
		System.out.println("");

		// Imprime o tamanho de cada palavra
		System.out.print("[ " + palavras.get(0).length());
		for (int i = 1; i < palavras.size(); i++) {
			System.out.print(", " + palavras.get(i).length());
		}
		System.out.println("]");

		/*
		 * Chamda do Default Method "sort" implementado na interface List. Para isso foi
		 * criada uma classe anônima para implementar a interface Comparator. A classe
		 * comparator possui um método abstrato "compare" a ser implementado. Esse
		 * método deve retornar -1 (obj1 < obj2), 0 (obj1 == obj2) ou 1 (obj1 > obj2).
		 */
		palavras.sort(new Comparator<String>() {
			// Foi implementada uma comparação baseada no tamanho da String
			@Override
			public int compare(String s1, String s2) {
				return (s1.length() - s2.length()) % 2;
			}
		});

		// Imprime a lista ordenada
		System.out.println(palavras);

		// Imprime o tamanho de cada palavra após a ordenação
		System.out.print("[ " + palavras.get(0).length());
		for (int i = 1; i < palavras.size(); i++) {
			System.out.print(", " + palavras.get(i).length());
		}
		System.out.println("]");

		/*
		 * Implementação interface Consumer por meio de uma classe anônima. A classe
		 * Consumer possui um método abstrato "accept" a ser implementado. Esse método
		 * deve fazer alguma ação como o objeto recebido.
		 */
		Consumer<String> consumidor = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		// Chamda do Default Method "forEach" implementado na interface List.
		palavras.forEach(consumidor);

	}

}
