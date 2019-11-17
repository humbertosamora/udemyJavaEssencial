package secao14Interfaces;

public class Ventilador implements iEletronico {
	
	// Variável é inicalizada com o estado "false"
	private boolean ligado = false;
	
	@Override
	public void ligar() {
		if (!ligado) {
			
			System.out.println("Ligando o aparelho...");
			ligado = true;
		}
	}

	@Override
	public void desligar() {
		if(ligado) {
			ligado = false;
			System.out.println("Desligando o aparelho...");
		}
	}
	
}
