package secao19Collections;

import java.util.List;

import secao12HerancaPolimorfismo.Pessoa;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Trabalhando com Listas.
 * "List" é uma interface genérica que é implementada por outras classes, tais como, LinkedList e ArrayList.
 * - São sequências que podem ser ordenadas
 * - Permite valores repetidos
 * - Permite acessar membros por meio de sua posição
 * - Pode ser ordenada pelo método "Collections.sort(...)"
 * 
 * */

public class Programa45 {

	public static void main(String[] args) {
		List <Pessoa> equipe = new ArrayList<Pessoa>();
		
		equipe.add(new Pessoa("Carlos"));
		equipe.add(new Pessoa("Maria"));
		equipe.add(new Pessoa("Ana"));
		equipe.add(new Pessoa("ana"));
		equipe.add(new Pessoa("Beatriz"));
		equipe.add(new Pessoa("Beatriz"));
		
		System.out.println("Acesso pelo método get():");
		for (int i = 0; i < equipe.size(); i ++ ) {
			System.out.println(equipe.get(i));
		}
		
		System.out.println("");
		System.out.println("Acesso por 'for(Pessoa membro : equipe)':");
		for (Pessoa membro : equipe) {
			System.out.println(membro);
		}
		
		System.out.println("");		
		System.out.println("Acesso pelo método ForEach usando lambda:");
		equipe.forEach(s -> {System.out.println(s);});
		
		// Para usar o método sort, o tipo de objetos da lista precisa implementar a interface "Comparable".
		// O objeto "equipe" é uma lista de "Pessoas", cuja classe implementa essa interface.		
		Collections.sort(equipe);
		System.out.println("");		
		System.out.println("Lista ordenada após uso do método Collections.sort(List<T>):");
		equipe.forEach(s -> {System.out.println(s);});
		
	}
	
}
