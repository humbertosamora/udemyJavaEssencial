package secao19Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * "Set" (conjunto) � uma interface gen�rica que � implementada por outras classes, tais como, HashSet e TreeSet.
 * - N�o permite elementos repetidos
 * - A ordem de inser��o n�o � respeitada
 * - N�o permite acessar membros por meio de sua posi��o (n�o possui �ndice)
 * - N�o aceita ordena��o pelo m�todo "Collections.sort(...)"
 * 
 * */

public class Programa48 {

	public static void main(String[] args) {
		
		String nomes[] =  { "Cristiane", "Clara", "Victor", "M�nica", "Clara", "Gabriela", "Helena", "m�nica" };
		
		Set <String> conjunto = new HashSet<String>();
		
		for (int i=0; i<nomes.length; i++) {
			if ( ! conjunto.add(nomes[i]) ) {
				System.out.println(nomes[i] + " j� est� no conjunto, por isso n�o � poss�vel adicionar novamente.");
			}
		}
		
		System.out.println("");
		System.out.print("Conjunto:");
		conjunto.forEach(s -> { System.out.print(" " + s); });
		
	}

}
