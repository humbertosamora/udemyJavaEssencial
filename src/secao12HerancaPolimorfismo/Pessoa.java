package secao12HerancaPolimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * A classe Pessoa é considerada:
 * - Classe base
 * - Classe mãe/paio
 * - Classe genérica
 * - Super classe 
 * 
 * Getter:
 * - Método para acessar membros/estados privados o objeto; 
 * - A nomenclatura do método é get_nome_do_atributo()
 *
 * Setter:
 * - Método para alterar membros/estados privados o objeto; 
 * - A nomenclatura do método é set_nome_do_atributo()
 * 
 * */

public class Pessoa implements Comparable <Pessoa> {
	private String nome;
	private String email;
	private String endereco;
	private LocalDate nascimento;
	
	public Pessoa (String nome) {
		this.nome = nome;
		this.endereco = "";
		this.email = "";
		this.nascimento = LocalDate.MIN;
	}
	
	public Pessoa(String nome, LocalDate nascimento) {
		if (nome != null) this.nome = nome; else this.nome = "";
		this.endereco = "";
		this.email = "";
		if (nascimento != null) this.nascimento = nascimento; else this.nascimento = LocalDate.MIN;
	}
	
	public Pessoa(String nome, String endereco, String email, LocalDate nascimento) {
		if (nome != null) this.nome = nome; else this.nome = "";
		if (endereco != null) this.endereco = endereco; else this.endereco = "";
		if (email != null) this.email = email; else this.email = "";
		if (nascimento != null) this.nascimento = nascimento; else this.nascimento = LocalDate.MIN;
	}
	
	public String getNome() { return nome; }
	public String getEmail() { return email; }
	public String getEndereco () { return endereco; }
	public LocalDate getNascimento () { return nascimento; }
	
	public void setNome(String nome) { if (nome != null) this.nome = nome; }
	public void setEmail(String email) { if (email != null) this.email = email; }
	public void setEndereco(String endereco) { if (endereco != null) this.endereco = endereco;  }
	public void setNascimento(LocalDate nascimento) { if (nascimento != null) this.nascimento = nascimento; }
	
	@Override
	public String toString() {
		String s = "";
		
		if (nome.length() > 0) { s = s + nome ; }
		
		if (endereco.length() > 0) { s = s + ", " + endereco ; }
		
		if (email.length() > 0) { s = s + ", " + email ; }
		
		if (nascimento.compareTo(LocalDate.MIN) > 0) {
			s = s + ", "+ nascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) ;
		}
		
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if ( ! (obj instanceof Pessoa) ) { return false; }
		
		Pessoa p = (Pessoa) obj;
		
		return	p.email.equals(email) &&
				p.endereco.equals(endereco) &&
				p.nascimento.equals(nascimento) &&
				p.nome.equals(nome);
	}
	
	@Override
	public int hashCode() {
		
		if (this.nascimento == LocalDate.MIN) {
			return this.nome.hashCode();
		} else {
			return this.nome.hashCode() + this.nascimento.hashCode();
		}
	}
	
	@Override
	public int compareTo(Pessoa o) {
		return this.hashCode() - o.hashCode();
	}
	
}
