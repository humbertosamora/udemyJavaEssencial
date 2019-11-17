package secao13ClassesAbstratas;
public class TreinamentoInicioTemporada extends Treinamento {

	@Override
	public void preparoFisico() {
		System.out.println("Preparo físico de início de temporarada...");
	}

	@Override
	public void jogoTreino() {
		System.out.println("Jogo treino de fim da temporarada...");
	}
	
}
