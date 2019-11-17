package secao22RecursosAvancados;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/* Default Methods
 * - A partir do Java 8 (1.8) as interfaces podem possuir m�todos concretos
 * - Para isso � necess�rio que seja inserida a palavra "default" antes da declara��o do m�todo
 * - Esses m�todos s�o �teis quando sua execu��o for igual em v�rias classes que implementar a interface
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
		palavras.add("Atl�tico  MG");
		palavras.add("Santa Cruz");
		palavras.add("Brasil de Pelotas");
		palavras.add("S�o Paulo");

		// Imprime a lista sem ordena��o
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
		 * criada uma classe an�nima para implementar a interface Comparator. A classe
		 * comparator possui um m�todo abstrato "compare" a ser implementado. Esse
		 * m�todo deve retornar -1 (obj1 < obj2), 0 (obj1 == obj2) ou 1 (obj1 > obj2).
		 */
		palavras.sort(new Comparator<String>() {
			// Foi implementada uma compara��o baseada no tamanho da String
			@Override
			public int compare(String s1, String s2) {
				return (s1.length() - s2.length()) % 2;
			}
		});

		// Imprime a lista ordenada
		System.out.println(palavras);

		// Imprime o tamanho de cada palavra ap�s a ordena��o
		System.out.print("[ " + palavras.get(0).length());
		for (int i = 1; i < palavras.size(); i++) {
			System.out.print(", " + palavras.get(i).length());
		}
		System.out.println("]");

		/*
		 * Implementa��o interface Consumer por meio de uma classe an�nima. A classe
		 * Consumer possui um m�todo abstrato "accept" a ser implementado. Esse m�todo
		 * deve fazer alguma a��o como o objeto recebido.
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
