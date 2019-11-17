package secao13ClassesAbstratas;
/*
 * O padr�o Template Method define a estrutura de um algoritmo dentro de um m�todo,
 * transferindo alguns de seus passos para as subclasses. O Template Method permite
 * que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura 
 * do pr�prio algoritmo.
 * 
 */
public class Programa32 {

	public static void main(String[] args) {
		Treinamento treino;
		
		treino = new TreinamentoInicioTemporada();
		treino.treinoDiario();
		
		System.out.println("");
		
		treino = new TreinamentoFimTemporada();
		treino.treinoDiario();
	}

}
