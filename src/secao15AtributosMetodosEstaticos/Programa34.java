package secao15AtributosMetodosEstaticos;
import java.time.LocalDate;

public class Programa34 {
	
	public static void main(String[] args) {
		
		NotaFiscal nota1, nota2, nota3;
		
		nota1 = new NotaFiscal("Servi�os de topografia.",LocalDate.of(2019,7,15));
		nota2 = new NotaFiscal("Servi�os de engenharia.",LocalDate.of(2019,7,18));
		nota3 = new NotaFiscal("Servi�os de consultoria.",LocalDate.of(2019,8,6));
		
		System.out.println(nota1);
		System.out.println(nota2);
		System.out.println(nota3);
		
		System.out.println("Pr�xima NF: " + NotaFiscal.proximaConta());
		
	}

}
