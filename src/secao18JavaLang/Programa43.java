package secao18JavaLang;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

/*
 * Trabalhando com arquivos de saída em foramto UTF-8.
 * Pachote Java.Io.*
 * 
 * O objeto OutputStreamWriter aceita diferentes tipos de caracteres:
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

public class Programa43 {

	public static void main(String[] args) {
		String nome_arquivo;
		FileOutputStream arquivo;
		OutputStreamWriter os;
		BufferedWriter buffer;
		
		nome_arquivo = "Texto-UTF8.txt";
				
		try {
			arquivo = new FileOutputStream(nome_arquivo);
			os = new OutputStreamWriter(arquivo,"UTF-8");
			buffer = new BufferedWriter(os);
			
			buffer.write("Arquivo em formato UTF-8.\n");
			buffer.write("ä è ë\n");
			buffer.write("¼ ½ ¾\n");
			buffer.write("Ð Ñ Ò\n");
			buffer.write("Ø ß æ þ\n");
			
			buffer.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Arquivo " + nome_arquivo + " não encontrado.");
		}
		catch (IOException e) {
			System.out.println("Erro de leitura no arquivo " + nome_arquivo + ".");
		}
		
		System.out.println("Arquivo " + nome_arquivo + " gravado com sucesso.");
	}


}
