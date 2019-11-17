package secao19Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * "Set" (conjunto) é uma interface genérica que é implementada por outras classes, tais como, HashSet e TreeSet.
 * - Não permite elementos repetidos
 * - A ordem de inserção não é respeitada
 * - Não permite acessar membros por meio de sua posição (não possui índice)
 * - Não aceita ordenação pelo método "Collections.sort(...)"
 * 
 * */

public class Programa48 {

	public static void main(String[] args) {
		
		String nomes[] =  { "Cristiane", "Clara", "Victor", "Mônica", "Clara", "Gabriela", "Helena", "mônica" };
		
		Set <String> conjunto = new HashSet<String>();
		
		for (int i=0; i<nomes.length; i++) {
			if ( ! conjunto.add(nomes[i]) ) {
				System.out.println(nomes[i] + " já está no conjunto, por isso não é possível adicionar novamente.");
			}
		}
		
		System.out.println("");
		System.out.print("Conjunto:");
		conjunto.forEach(s -> { System.out.print(" " + s); });
		
	}

}
