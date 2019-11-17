package secao15AtributosMetodosEstaticos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Atributos Static
 * Têm os valores compartilhados por todos as instâncias da classe.
 * Isto é, só existe um atributo que pode ser alterado por qualquer elemento.
 * Por exemplo, pode-se ter um contador para saber o total de objetos criados.
 * Para utilizar um atributo estático, coloca-se o nome da classe seguido de "." e do nome do atributo.
 * 
 * 
 * Métodos Static
 * Um método static não depende de um objeto instanciado para ser executado.
 * Pode invocá-lo usando o nome da classe seguido de "." e do nome do método.
 * 
 * */

public class NotaFiscal {
	
	// Constante da classe, não pode ser alterada e só há um elemento compartilhado por todos os objetos da classe
	private static final String EMPRESA = "Drake Eng. & Consultoria";
	
	// Membro estático (só 1 para todos os objetos) e que pode ser alterado.
	// Pode ter modificadores de acesso private, protected, public, "default" (package-protected)
	private static int contador = 0;
	
	// Membro final que não pode ser alterado após a incialização, mas é específico de cada objeto
	// Poderia ser inicializado aqui, mas optamos por fazer isso no construtor.
	private final int numero;
	
	// Membros normais que podem ser alterados após a inicialização e são específicos de cada objeto
	private String descricao;
	private LocalDate data;
	
	public NotaFiscal (String descricao, LocalDate data) {
		this.numero = ++NotaFiscal.contador; // Incrementa o contador antes de atribuir ao atributo "numero"
		this.descricao = descricao;
		this.data = data;
	}
	
	public static int proximaConta() { return contador + 1; }
	
	@Override
	public String toString() {
		String s;
		
		s = 	NotaFiscal.EMPRESA + ", NF " +
				String.format("%04d", numero) + ", " +
				data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", " +
				descricao;
		
		return	s;

	}
	
}
