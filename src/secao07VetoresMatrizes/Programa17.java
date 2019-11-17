package secao07VetoresMatrizes;


public class Programa17 {
	public static void main(String[] args) {
		int valores [] = new int [10];
		int valores1[] = {1, 2, 3};
		
//		// Não altera o conteúdo do vetor porque i é uma variável local
//		for (int i : valores) {
//			i = (int) (10D * Math.random());
//		}
//		for (int i : valores) {
//			System.out.print(" " + i);
//		}
//		System.out.println("");
		
		// Preenche o vetor para depois imprimir
		for (int i=0; i< valores.length; i++) {
			valores[i] = (int) (10D * Math.random());
		}
		
		for (int i : valores) {
			System.out.print(" " + i);
		}
		
		System.out.println("");
		
		for (int i : valores1) {
			System.out.print(" " + i);
		}
	}
}
