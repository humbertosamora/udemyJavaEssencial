package secao09OrientacaoObjetos;
/*
 * 
 * Objetos s�o inst�ncias da classe
 * 
 * */

public class Programa22 {

	public static void main(String[] args) {
		
		// Declara��o de um objeto
		Produto p1;
		
		// Declara��o e instancia��o/incializa��o de um objeto 
		Produto p2 = new Produto();
		
		// Instancia��o do objeto
		p1 = new Produto();
		
		System.out.println(p1); // Imprime o endere�o de mem�ria de p1
		System.out.println(p2); // Imprime o endere�o de mem�ria de p1
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
