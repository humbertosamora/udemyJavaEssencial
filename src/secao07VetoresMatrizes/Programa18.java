package secao07VetoresMatrizes;


public class Programa18 {
	
	public static void main(String[] args) {
		int matriz1[][] = new int [3][3];
		int matriz2[][] = new int [2][];
		int matriz3[][] = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9, 10}};
		
		for (int i=0; i < matriz1.length; i++) {
			for (int j=0; j < matriz1[i].length; j++) {
				matriz1[i][j] = (int) (10D * Math.random());  
			}
		}
		
		matriz2[0] = new int[] {1, 3, 5, 7, 11};
		matriz2[1] = new int[] {13, 17, 19, 23, 29, 31};
		
		for (int i=0; i < matriz1.length ; i++) {
			for (int j=0; j < matriz1[i].length; j++) {
				System.out.print(" " + matriz1[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		
		for (int i=0; i< matriz2.length ; i++) {
			for (int j=0; j < matriz2[i].length; j++) {
				System.out.print(" " + matriz2[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		
		for (int i=0; i< matriz3.length ; i++) {
			for (int j=0; j < matriz3[i].length; j++) {
				System.out.print(" " + matriz3[i][j]);
			}
			System.out.println(" ");
		}		
	}
	
}
