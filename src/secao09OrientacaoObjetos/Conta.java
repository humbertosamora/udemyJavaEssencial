package secao09OrientacaoObjetos;
import secao12HerancaPolimorfismo.Pessoa;

public class Conta {
	static private int contador = 1;
	private int numero;
	private double saldo;
	private double limite;
	private Pessoa cliente;
	
	public Conta (Pessoa cliente) {
		this.numero = Conta.contador++;
		this.saldo = 0;
		this.limite = 0;
		this.cliente = cliente;
	}
	
	public Conta(double saldo, double limite, Pessoa cliente) {
		
		if (saldo < 0 || limite < 0) {
			throw new AccountException("Parâmetros incorretos.");
		}
		
		this.numero = contador++;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	// Saca dinheiro da conta, caso o valor depositado seja maior ou igual ao saldo
	// Retorna verdadeiro caso tenha conseguido executar a operação.
	public void sacar(double valor) {
		
		if (valor <= 0) {
			throw new AccountException("Não é possível sacar um valor negativo.");
		}
		
		if ( saldo + limite < valor ) {
			throw new AccountException("Saldo insuficiente.");
		}
		
		saldo -= valor;
	}
	
	// Saca deposita dinheiro na conta, caso o valor indicado seja positivo
	// Retorna verdadeiro caso tenha conseguido executar a operação.
	public void depositar (double valor) {
		
		if (valor < 0 ) {
			throw new AccountException("Não é possível depositar um valor negativo.");
		}
		
		saldo += valor;
	}
	
	public static int getContador() { return Conta.contador; }
	public double getSaldo() { return saldo;  }
	public double getLimite() { return limite; }
	public Pessoa getCliente() { return cliente; }
	public int getNumero() { return numero; }
	
	public void setLmite(double limite) {
		
		if ( limite < 0) {
			throw new AccountException("O limite não pode ser negativo.");
		}
		
		this.limite = limite;
	}
	
	public static void setContador(int numero) {
		
		if (numero < 0) {
			throw new AccountException("O contatodor não pode ser negativo.");
		}
		
		Conta.contador = numero;
	}
	
	@Override
	public String toString() {
		return	cliente.getNome() + 
				", CC " + numero +
				", Saldo R$ " + saldo +
				", Limite R$ " + limite;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if ( ! (obj instanceof Conta) ) { return false; }
		
		Conta c = (Conta) obj;
		
		return this.numero == c.numero && this.cliente.equals(c.cliente);
		
	}
	
	@Override
	public int hashCode() {
		return this.numero;
	}
	
}
