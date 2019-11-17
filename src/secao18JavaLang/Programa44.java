package secao18JavaLang;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Trabalhando com arquivos de entrada em foramto UTF-8.
 * Pachote Java.Io.*
 * 
 * O objeto InputStreamReader aceita diferentes tipos de caracteres:
 * 
 * Charset      Descripton
 * US-ASCII     Seven-bit ASCII, a.k.a. ISO646-US,a.k.a. the Basic Latin block of the Unicode character set 
 * ISO-8859-1   ISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1 
 * UTF-8        Eight-bit UCS Transformation Format 
 * UTF-16BE     Sixteen-bit UCS Transformation Format,big-endian byte order 
 * UTF-16LE     Sixteen-bit UCS Transformation Format,little-endian byte order 
 * UTF-16       Sixteen-bit UCS Transformation Format,byte order identified by an optional byte-order mark 
 * 
 * */

public class Programa44 {

	public static void main(String[] args) {
		String nome_arquivo;
		String texto;
		FileInputStream arquivo;
		InputStreamReader is;
		BufferedReader buffer;
		
		nome_arquivo = "Texto-UTF8.txt";
				
		try {
			arquivo = new FileInputStream(nome_arquivo);
			is = new InputStreamReader(arquivo,"UTF-8");
			buffer = new BufferedReader(is);
			
			do {
				texto = buffer.readLine();
				if (texto != null) System.out.println(texto);
			} while (texto != null);
			
			buffer.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Arquivo " + nome_arquivo + " não encontrado.");
		}
		catch (IOException e) {
			System.out.println("Erro de leitura no arquivo " + nome_arquivo + ".");
		}
	}

}
