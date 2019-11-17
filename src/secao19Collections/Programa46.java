package secao19Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Trabalhando com Listas.
 * "List" � uma interface gen�rica que � implementada por outras classes, tais como, LinkedList e ArrayList.
 * - S�o sequ�ncias que podem ser ordenadas
 * - Permite valores repetidos
 * - Permite acessar membros por meio de sua posi��o
 * - Pode ser ordenada pelo m�todo "Collections.sort(...)"
 * 
 * */

public class Programa46 {
	public static void main(String[] args) {
		List <Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(2019);
		numeros.add(1979);
		numeros.add(1945);
		numeros.add(1939);
		numeros.add(1975);
		numeros.add(1977);
		
		System.out.println("Acesso pelo m�todo get():");
		for (int i = 0; i < numeros.size(); i ++ ) {
			System.out.println(numeros.get(i));
		}
		
		System.out.println("");
		System.out.println("Acesso por 'for(Integer i : numeros)':");
		for (Integer i : numeros) {
			System.out.println(i);
		}
		
		System.out.println("");		
		System.out.println("Acesso pelo m�todo ForEach usando lambda:");
		numeros.forEach(i -> {System.out.println(i);});
		
		// Para usar o m�todo sort, o tipo de objetos da lista precisa implementar a interface "Comparable"
		Collections.sort(numeros);
		System.out.println("");		
		System.out.println("Lista ordenada ap�s uso do m�todo Collections.sort(List<T>):");
		numeros.forEach(i -> {System.out.println(i);});
		
	}
}
