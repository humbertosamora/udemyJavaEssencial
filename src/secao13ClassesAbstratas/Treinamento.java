package secao13ClassesAbstratas;
/*
 * Classe abstrata:
 * - � uma classe base, m�e/pai, gen�rica, super classe
 * - Impossibilita a instancia��o de um objeto dessa classe
 * - For�a a implementa��o de classes filho
 * - Pode ter m�todos, atributos e m�todos abstratos
 * 
 * M�todos abstratos:
 * - S�o m�todos que n�o possuem implementa��o, apenas declara��o
 * - Devem ser implementados pelas classes derivadas
 * 
 * 
 * Template Method
 * - Define os passos a serem seguidos pela classe filha na implementa��o de um algoritmo
 * 
 * Final - modificador de acesso:
 * - Quando aplicada � classe, impede que uma classe seja estendida
 * - Quando aplicada a um m�todo, impede que um m�todo seja reescrito ou sobrecarregado
 * - Quando aplicada a um atributo, faz com que ele n�o possa ser alterado ap�s ser inicializado.
 * 
 * */
public abstract class Treinamento {
	
	// Template Method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	
	public abstract void preparoFisico();
	
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("Treino t�tico...");
	}
	
}
