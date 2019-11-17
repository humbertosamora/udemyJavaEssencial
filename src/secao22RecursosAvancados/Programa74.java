package secao22RecursosAvancados;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* Method Reference
 * - Usado para simplificar express�es Lambdas
 * - O m�todo de uma classe � passado como refer�ncia, onde � exigido um objeto
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
		palavras.add("Atl�tico  MG");
		palavras.add("Santa Cruz");
		palavras.add("Brasil de Pelotas");
		palavras.add("S�o Paulo");
		
		// Ordena��o usando L�mbida para implementar um objeto Comparator<String> 
		palavras.sort( (s1, s2) -> Integer.compare(s1.length(),s2.length()) );
		
		System.out.println(palavras);
		
		// Ordena��o usando Method Reference - Forma 1
		Comparator<String> comparador = Comparator.comparing(String::length);
		palavras.sort(comparador);
		
		// Ordena��o usando Method Reference
		palavras.sort(Comparator.comparing(String::length));
		
		// Uso de Method Reference combinado com a fun��o default forEach
		palavras.forEach(System.out::println);
	}

}
