package secao14Interfaces;

public class Programa33 {

	public static void main(String[] args) {
		Ventilador v = new Ventilador();
		
		// Esse c�digo gera um warnning
		// System.out.println("A marca do ventilador � " + v.MARCA);
		
		System.out.println("A marca do ventilador � " + Ventilador.MARCA);
		
		v.desligar();
		
		v.ligar();
		
		v.desligar();
	}

}
