package secao13ClassesAbstratas;
public class TreinamentoFimTemporada extends Treinamento {

	@Override
	public void preparoFisico() {
		System.out.println("Preparo físico de fim da temporarada...");
	}

	@Override
	public void jogoTreino() {
		System.out.println("Jogo treino de fim da temporarada...");
	}
	
}