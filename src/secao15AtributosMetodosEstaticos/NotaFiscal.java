package secao15AtributosMetodosEstaticos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Atributos Static
 * T�m os valores compartilhados por todos as inst�ncias da classe.
 * Isto �, s� existe um atributo que pode ser alterado por qualquer elemento.
 * Por exemplo, pode-se ter um contador para saber o total de objetos criados.
 * Para utilizar um atributo est�tico, coloca-se o nome da classe seguido de "." e do nome do atributo.
 * 
 * 
 * M�todos Static
 * Um m�todo static n�o depende de um objeto instanciado para ser executado.
 * Pode invoc�-lo usando o nome da classe seguido de "." e do nome do m�todo.
 * 
 * */

public class NotaFiscal {
	
	// Constante da classe, n�o pode ser alterada e s� h� um elemento compartilhado por todos os objetos da classe
	private static final String EMPRESA = "Drake Eng. & Consultoria";
	
	// Membro est�tico (s� 1 para todos os objetos) e que pode ser alterado.
	// Pode ter modificadores de acesso private, protected, public, "default" (package-protected)
	private static int contador = 0;
	
	// Membro final que n�o pode ser alterado ap�s a incializa��o, mas � espec�fico de cada objeto
	// Poderia ser inicializado aqui, mas optamos por fazer isso no construtor.
	private final int numero;
	
	// Membros normais que podem ser alterados ap�s a inicializa��o e s�o espec�ficos de cada objeto
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
