package secao09OrientacaoObjetos;
import java.time.LocalDate;

import secao12HerancaPolimorfismo.Pessoa;

public class Programa25 {

	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa ("João da Silva", "Rua da luz, 31", "joao@gmail.com", LocalDate.of(1990,7,15));
		Pessoa maria = new Pessoa ("Maria Clara", "Rua da Bahia, 1530", "maria@gmail.com", LocalDate.of(1993,10,2));
		
		Conta.setContador(2478);
		
		Conta conta_joao  = new Conta(100,500,joao);
		Conta conta_maria = new Conta(200,800,maria);
		
		System.out.println("Saldo do João : " + conta_joao.getSaldo());
		System.out.println("Saldo do Maria: " + conta_maria.getSaldo());
		System.out.println("");
		
		double saque = 300;
		
		conta_joao.sacar(saque);
		
		conta_maria.depositar(150);
		
		System.out.println("Saldo do João : " + conta_joao.getSaldo());
		System.out.println("Saldo do Maria: " + conta_maria.getSaldo());

		System.out.println("");
		System.out.println(conta_joao);
		System.out.println("");
		System.out.println(conta_maria);
	}

}
