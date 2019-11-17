package secao12HerancaPolimorfismo;

import java.time.LocalDate;

/*
 * A classe Aluno é:
 * - Subclasse
 * - Classe específica
 * - Classe filha
 * 
 * */
public class Aluno extends Pessoa {

	private String ra;
	
	public Aluno(String nome) {
		super(nome);
		this.ra = "";
	}
	
	public Aluno(String nome, String endereco, String email, LocalDate nascimento, String ra) { 
		super(nome, endereco, email, nascimento);
		if (ra != null) { this.ra = ra; } else { this.ra = ""; }
	}
	
	public String getRa() { return ra; }
	public void setRa(String ra) { this.ra = (ra == null ? "" : ra); }
	
	@Override
	public String toString() { return super.toString() + ", R.A.: " + ra; }
}
