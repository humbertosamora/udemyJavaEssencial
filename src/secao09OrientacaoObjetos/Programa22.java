package secao09OrientacaoObjetos;
/*
 * 
 * Objetos são instâncias da classe
 * 
 * */

public class Programa22 {

	public static void main(String[] args) {
		
		// Declaração de um objeto
		Produto p1;
		
		// Declaração e instanciação/incialização de um objeto 
		Produto p2 = new Produto();
		
		// Instanciação do objeto
		p1 = new Produto();
		
		System.out.println(p1); // Imprime o endereço de memória de p1
		System.out.println(p2); // Imprime o endereço de memória de p1
		System.out.println();
		
		p1.set_nome("Notebook");
		p1.set_codigo("L41P237");
		p1.set_preco(2500);
		
		p2.set_nome("Caneta");
		p2.set_codigo("K02545V");
		p2.set_preco(2.50);
		
		System.out.println("********** PRODUTOS **********");
		System.out.println(p1);
		System.out.println("");
		System.out.println(p2);
		
	}
	
}
