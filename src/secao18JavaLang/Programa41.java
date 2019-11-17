package secao18JavaLang;

/* Trabalhando com Strings
 * - Toda string em Java é imutável
 * - Java é case sensitive
 * - A String possui função charat, que possibilita tratar um string como array de chars
 *   
 * */

public class Programa41 {

	public static void main(String[] args) {
		String palavra = "Programação em Java Essencial";
		
		System.out.println(palavra);
		
		System.out.println(palavra.toLowerCase());
		
		System.out.println(palavra.toUpperCase());
		
		System.out.println(palavra.replace("a", "-"));
		
		System.out.println(palavra.charAt(10));
		
		for( char c : palavra.toCharArray()) {
			System.out.print(c + " ");
		}
		
		System.out.println("");
	
		for (int i = palavra.toCharArray().length - 1; i >=0 ; i-- ) {
			System.out.print(palavra.charAt(i) + " ");
		}
		
		System.out.println("");
		
		System.out.println(palavra);
	}

}
