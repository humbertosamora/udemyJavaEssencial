package secao22RecursosAvancados;
import java.util.ArrayList;
import java.util.List;

/*
 * Express�es Lambdas
 * - S�o uma forma simples de codificar uma classe an�nima para implementar uma interface funcional;
 * - Interfaces funcionais s�o aquelas que possuem somente um m�todo e s�o usadas como m�todos de compara��o,
 *   consumo ou produ��o;
 * - Um m�todo l�mbda sempres possui os caracteres "->"
 * - Se houver mais de um par�metro de entrada do m�todo a ser implementado, ent�o deve haver par�nteses
 *   na declara��o dos par�metros;
 * - Caso o lambda possua somente uma linha, ent�o os par�nteses e ponto e v�rgula podem ser dispensados;
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
		palavras.add("Atl�tico  MG");
		palavras.add("Santa Cruz");
		palavras.add("Brasil de Pelotas");
		palavras.add("S�o Paulo");
		
		// L�mbda com 1 par�metro - Forma 1
		// O default method "forEach" recebe um objeto do tipo Consumer<T>
		// A inteface Consumer<T> s� possui o m�todo "accept" que recebe um obejto T e retorna void.
		palavras.forEach( s -> {
			System.out.println(s);
		});
		
		// L�mbda com 1 par�metro - Forma 2
		palavras.forEach( s -> System.out.println(s) );
		
		
		// L�mbda com 2 par�metro - Forma 1
		// O default method "sort" recebe um objeto do tipo Comparator<T,T>
		// A inteface Compartor<T,T> s� possui o m�todo "compare" que recebe dois obejtos (T1,T2)
		// e retorna -1 (T1 < T2), 0 (T1==T2) ou 1 (T1>T2).
		palavras.sort( (s1, s2) -> {
			return (s1.length() - s2.length()) % 2;
		});
		
		// L�mbda com 2 par�metro - Forma 2
		palavras.sort( (s1, s2) -> Integer.compare(s1.length(),s2.length()) );
		
		System.out.println(palavras);
		
	}

}
