package secao05EstruturasRepeticao;

import java.util.Scanner;

public class Programa07 {
	public static void main(String[] args) {
		int idade;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.print("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.print("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			
			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos.");
			}
			
		} while (idade > 0);
		
		teclado.close();
	}
}
