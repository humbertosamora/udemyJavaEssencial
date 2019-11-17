package secao14Interfaces;

public class Programa33 {

	public static void main(String[] args) {
		Ventilador v = new Ventilador();
		
		// Esse código gera um warnning
		// System.out.println("A marca do ventilador é " + v.MARCA);
		
		System.out.println("A marca do ventilador é " + Ventilador.MARCA);
		
		v.desligar();
		
		v.ligar();
		
		v.desligar();
	}

}
