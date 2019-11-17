package secao16TratamentoErros;
import java.util.Scanner;

/*
 * Quando falamos em exce��es no Java, temos que compreender que existem dois grupos:
 * 
 * Checked Exceptions:
 * - Exception
 * - IOException
 * - SQLException
 *
 * Unchecked Exceptions:
 * - RuntimeException
 * - NullPointerException
 * - ArrayOutOfBoundException
 * 
 * As exce��es do tipo "checked" s�o verificadas pelo compilador java e impedem que o
 * software seja depurado sem o devido tratamento de erro. Por outro lado, o proramador
 * n�o precisa prever tratametno para as exce��es do tipo "unchecked", que s� s�o
 * percept�veis em tempo de execu��o (runtime).
 * 
 * */

public class Programa37 {
	
	public static void main(String[] args) throws Exception {

		int a;
		int b;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o 1� n�mero: ");
		a = teclado.nextInt();
		
		System.out.print("Digite o 2� n�mero: ");
		b = teclado.nextInt();
				
		try {
			System.out.println(String.format("A divis�o de %d por %d � %d",a,b,dividir(a,b)));
		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Bloco finally executado.");
			teclado.close();
		}
		
	}
	
	public static int dividir(int a, int b) throws RuntimeException, Exception {
		
		if ( a == 0 && b == 0 ) throw(new Exception("A divis�o de 0/0 � ideterminada."));
		
		if ( b == 0 ) throw(new RuntimeException("A divis�o de " + a + "/0 � indefinida."));
		
		return a/b;
	}
	
}
