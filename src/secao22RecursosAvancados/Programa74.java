package secao22RecursosAvancados;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* Method Reference
 * - Usado para simplificar expressões Lambdas
 * - O método de uma classe é passado como referência, onde é exigido um objeto
 *   que implementa uma interface do tipo Consumer<T>, Producer <T> ou Comparator<T,T> 
 * - 
 * */

public class Programa74 {

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
		
		// Ordenação usando Lâmbida para implementar um objeto Comparator<String> 
		palavras.sort( (s1, s2) -> Integer.compare(s1.length(),s2.length()) );
		
		System.out.println(palavras);
		
		// Ordenação usando Method Reference - Forma 1
		Comparator<String> comparador = Comparator.comparing(String::length);
		palavras.sort(comparador);
		
		// Ordenação usando Method Reference
		palavras.sort(Comparator.comparing(String::length));
		
		// Uso de Method Reference combinado com a função default forEach
		palavras.forEach(System.out::println);
	}

}
