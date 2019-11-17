package secao13ClassesAbstratas;
/*
 * Classe abstrata:
 * - É uma classe base, mãe/pai, genérica, super classe
 * - Impossibilita a instanciação de um objeto dessa classe
 * - Força a implementação de classes filho
 * - Pode ter métodos, atributos e métodos abstratos
 * 
 * Métodos abstratos:
 * - São métodos que não possuem implementação, apenas declaração
 * - Devem ser implementados pelas classes derivadas
 * 
 * 
 * Template Method
 * - Define os passos a serem seguidos pela classe filha na implementação de um algoritmo
 * 
 * Final - modificador de acesso:
 * - Quando aplicada à classe, impede que uma classe seja estendida
 * - Quando aplicada a um método, impede que um método seja reescrito ou sobrecarregado
 * - Quando aplicada a um atributo, faz com que ele não possa ser alterado após ser inicializado.
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
		System.out.println("Treino tático...");
	}
	
}
