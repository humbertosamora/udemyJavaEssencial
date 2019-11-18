package secao16TratamentoErros;
import java.io.IOException;
import java.util.Scanner;

import secao09OrientacaoObjetos.AccountException;
import secao09OrientacaoObjetos.Conta;
import secao12HerancaPolimorfismo.Pessoa;

public class Principal {

	static Conta c = new Conta(300,500, new Pessoa("Carlinhos de Jesus"));
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		

		int opcao = 0;
		
		do {
			
			try {
				
				System.out.println("=========================================");
				System.out.println("0 - Sair");
				System.out.println("1 - Depositar");
				System.out.println("2 - Sacar");
				System.out.println("3 - Consultar saldo");
				System.out.print("Selecione uma opção: ");
				
				opcao = teclado.nextInt();
				teclado.nextLine();
				
				switch (opcao) {

				case 0:
					break;

				case 1:
					depositar();
					break;

				case 2:
					sacar();
					break;

				case 3:
					consultar();
					break;

				default:
				}
			}
			catch (AccountException e) {
				System.out.println(e.getMessage());
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (opcao > 0);
	
		teclado.close();
		
	}
		
	public static void sacar() throws Exception {
		double d;
		
		clearConsole();
		System.out.println("================= SACAR =================");
		System.out.print("Informe o valor do saque: ");
		
		d = teclado.nextDouble();
		teclado.nextLine();
		
		c.sacar(d);
				
		System.out.println("Saque efetuado com sucesso.");
	}
	
	public static void depositar () throws Exception {
		double d;
		
		clearConsole();
		System.out.println("=============== DEPOSITAR ===============");
		System.out.print("Informe o valor do deposito: ");
		
		d = teclado.nextDouble();
		teclado.nextLine();
		
		c.depositar(d);
		
		System.out.println("Depósito efetuado com sucesso.");
	}
	
	public static void consultar() throws Exception {
		clearConsole();
		System.out.println("================= SALDO =================");
		System.out.println(String.format("Saldo: %6.2f, Limite: %6.2f, Valor disponível: %6.2f", c.getSaldo(), c.getLimite(), c.getSaldo() + c.getLimite()));	
	}
	
	public final static void clearConsole() throws IOException, InterruptedException {
        //Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        else {
            Runtime.getRuntime().exec("clear");
        }
	}
}
