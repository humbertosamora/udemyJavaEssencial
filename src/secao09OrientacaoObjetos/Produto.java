package secao09OrientacaoObjetos;

/*
 * O nome da classe inicia com letra maiúscula;
 * O nome não deve conter: acentuação, caracteres especiais, espaço;
 * Numa classe não existe a implementação do método main();
 * O nome da classe Java deve ser o MESMO do arquivo java;
 * 
 * */

// Atributos

/*
 * São as características da classe/molde/modelo de dados;
 * Atibutos podem ser entendidos como variáveis da classe;
 * Outra forma de nomenclatura para os atributos são estados da classe;
 * Os atributos são nomeados com letra minúscula, sem espaços, sem carcateres
 * especiais, sem acentuação;
 * Atributos não podem iniciar com números;
 * 
 * Tipos de qualificadores para acesso aos atributos
 * Modifier     Class  Package  Subclass  World
 * public       Y      Y        Y         Y
 * protected    Y      Y        Y         N
 * no modifier  Y      Y        N         N
 * private      Y      N        N         N
 * 
 * */

// Métodos

/*
 * Os métodos podem ser entendidos como as ações que são realizadas por um objeto da clase;
 * Mesmos requisitos das funções:
 * a) Tipo de retorno;
 * b) Nome - ação a ser executada;
 * c) Parâmtros - argumentos de entrada (opcional);
 * d) Retorno (opcional) - depende do tipo de retorno;
 * 
 * */

public class Produto {
	private String nome;
	private String codigo;
	private double preco;
	
	public Produto () {
		this.nome = "";
		this.codigo = "";
		this.preco = 0;
	}
	
	public Produto (String nome, String codigo, double preco) {
		this.nome = ( nome == null ? "" : nome );
		this.codigo = ( codigo == null ? "" : codigo);
		this.preco = ( preco > 0 ? preco : 0 );
	}
	
	public String get_nome() { return nome; }
	public String get_codigo() { return codigo; }
	public double get_preco() { return preco; }
	
	public void set_nome(String nome) { this.nome = ( nome == null ? "" : nome ); }
	public void set_codigo(String codigo) { this.codigo = ( codigo == null ? "" : codigo); }
	public void set_preco(double preco) { this.preco = ( preco > 0 ? preco : 0 ); }

	@Override
	public String toString() {
		return nome + ", " + codigo + ", R$ " + preco;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if ( ! (obj instanceof Produto) ) { return false; }
		
		Produto p = (Produto) obj;
		
		return p.nome.equals(this.nome) && p.codigo.equals(this.codigo) && p.preco == this.preco;
		
	}
	
	@Override
	public int hashCode() { return this.codigo.hashCode(); }
	
}
