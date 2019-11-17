package secao16TratamentoErros;
import java.util.Scanner;

/*
 * Quando falamos em exceções no Java, temos que compreender que existem dois grupos:
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
 * As exceções do tipo "checked" são verificadas pelo compilador java e impedem que o
 * software seja depurado sem o devido tratamento de erro. Por outro lado, o proramador
 * não precisa prever tratametno para as exceções do tipo "unchecked", que só são
 * perceptíveis em tempo de execução (runtime).
 * 
 * */

public class Programa37 {
	
	public static void main(String[] args) throws Exception {

		int a;
		int b;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		a = teclado.nextInt();
		
		System.out.print("Digite o 2º número: ");
		b = teclado.nextInt();
				
		try {
			System.out.println(String.format("A divisão de %d por %d é %d",a,b,dividir(a,b)));
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
		
		if ( a == 0 && b == 0 ) throw(new Exception("A divisão de 0/0 é ideterminada."));
		
		if ( b == 0 ) throw(new RuntimeException("A divisão de " + a + "/0 é indefinida."));
		
		return a/b;
	}
	
}
