package secao08Funcoes;

import java.util.Scanner;

public class Programa20 {

	public static void main(String[] args) {
		String frutas[];
		
		frutas = lerdados();
		
		imprimirdados(frutas);
	}

	public static String[] lerdados() {
		int length;
		String s[] = new String[0];
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a quantiade de frutas: ");
		length = Integer.parseInt(teclado.nextLine());
		
		if (length > 0) {
			s = new String[length];
			
			for (int i = 0; i < length; i++) {
				System.out.printf("Qual a %d fruta?\n",i+1);
				s[i] = teclado.nextLine();
			}
		}
		
		teclado.close();
		
		return s;
	}
	
	public static void imprimirdados(String[] dados) {
		
		System.out.println("");
		
		for(int i = dados.length - 1; i >= 0; i--) {
			System.out.println(dados[i]);
		}
		
	}
}
