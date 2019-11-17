package secao19Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import secao09OrientacaoObjetos.Produto;

/* "Map" é uma interface genérica que é implementada por outras classes, tais como, HashMap e TreeMap.
 * - Associa um elemento a uma chave
 * - Não permite elementos com chaves repetidas
 * - Se a chave for diferente, o valor pode ser repetido
 * 
 * */

public class Programa49 {
	
	public static void main(String[] args) {
		Map<String, Produto> produtos = new HashMap<String, Produto>();
		
		produtos.put("IF145Z", new Produto("HD Exerno Sansung","P0145Z", 150));
		produtos.put("ES100X", new Produto("Luminária de mesa","ES100X", 87));
		produtos.put("ES045M", new Produto("Grampeador de papel","ES045M", 18));
		produtos.put("PR166W", new Produto("Caneca Vingadores","PR166W", 25));
		
//		System.out.println(produtos.get("PR166W"));
//		System.out.println(produtos.get("XXXX"));

		System.out.println("");
		System.out.print("CHAVES: ");
		System.out.print(produtos.keySet());
		
		System.out.println("");
		System.out.print("VALORES: ");
		System.out.println(produtos.values());
		
		System.out.print("ASSOCIAÇÕES: ");
		System.out.println(produtos.entrySet());
		
		System.out.println("");
		System.out.println("CHAVES:");
		// Opera sobre cada uma das chaves que são do tipo String
		produtos.keySet().forEach( ks -> { System.out.println(ks); } );
		
		System.out.println("");
		System.out.println("VALORES:");
		// Cria uma collection a partir dos valores
		Collection<Produto> vs = produtos.values();
		// Opera sobre cada elemento do tipo Produto que está na collection
		vs.forEach( s -> { System.out.println(s); } );
		
		System.out.println("");		
		System.out.println("ASSOCIAÇÕES:");
		// Cria um conjunto a partir do HashMap
//		Set<Entry<String, Produto>> associacoes = produtos.entrySet();
		// Opera sobre cada um dos elementos do tipo Entry<String,Produto> do conjunto
//		associacoes.forEach( a -> { System.out.println(a.getKey() + " -> " + a.getValue()); } );
		produtos.entrySet().forEach( a -> { System.out.println(a.getKey() + " -> " + a.getValue()); } );
		
	}
	
}
