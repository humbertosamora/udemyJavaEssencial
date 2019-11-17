package secao06TiposDados;


public class Programa12 {
	public static void main(String[] args) {
		// Tipos primitivos reais
		float  num1 = 1.45f;	// "f" identifica o tipo float. Por padrão todos os valores com ponto são double
		double num2 = 3.48;
		
		// Tipos não primitivos/primários
		Float  num3 = 8.67f;	// "f" identifica o tipo float. Por padrão todos os valores com ponto são double
		Double num4 = 8.11;
		
		System.out.println("float -> num1 = " + num1);
		System.out.println("double -> num2 = " + num2);
		System.out.println("Float -> num3 = " + num3);
		System.out.println("Double -> num4 = " + num4);
		System.out.println("");
		
		System.out.println("float/Float " + Float.SIZE + " bits");
		System.out.println("double/Double " + Double.SIZE + " bits");
		System.out.println("");
		
	}
	
}
