package secao22RecursosAvancados;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/* Data e Hora
 * - A partir do Java 8 foram inclu�das as classes LocalDate, LocalTime, LocalDateTime e classes para formata��o
 * - Possuem fun��es para facilitar a cria��o e acesso aos dados
 * */

public class Programa77 {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println("[Data atual com objeto LocalDate]");
		System.out.println(hoje + " (ISO)");
		System.out.println();
		
		System.out.println("[Data atual com objeto LocalDate e formata��o customizada]");
		System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println();
		
		System.out.println("[Objeto data criado a partir do ano, m�s e dia espec�ficos]");
		System.out.println(LocalDate.of(1979, 11, 20) + " (ISO)");
		System.out.println();
		
		Period intervalo = Period.between(LocalDate.now(), LocalDate.of(LocalDate.now().getYear(), 12, 31));
		System.out.println("[C�lculo do per�odo entre a data atual e o fim do ano]");
		System.out.println(intervalo + " (ISO)");
		System.out.println(intervalo.getYears() + " anos, " + intervalo.getMonths() + " meses e " + intervalo.getDays() + " dias");
		System.out.println();
		
		Duration duracao = Duration.between(LocalDateTime.now(), LocalDateTime.of(LocalDate.now().getYear(), 12, 31, 23, 59, 59));
		System.out.println("[C�lculo da dura��o entre a data e hora atuais e o fim do ano (31/12/yyyy 23:59:59]");
		System.out.println(duracao + " (ISO)");
		System.out.println(duracao.toDays() + " dias, " + duracao.toHours() % 24 + " horas e " + duracao.toMinutes() % 60 + " minutos.");
		System.out.println();
				
		System.out.println(	"Faltam " + intervalo.getMonths() + " meses, " +
							intervalo.getDays() + " dias, " +
							duracao.toHours() % 24 + " horas, " +
							duracao.toMinutes() % 60 + " minutos e " +
							duracao.getSeconds() % 60 + " segundos para o fim do ano.");
		System.out.println();
		
				
		LocalTime hora = LocalTime.now();
		System.out.println("[Hora atual com objeto LocalTime]");
		System.out.println(hora + " (ISO)");
		System.out.println();
		
		System.out.println("[Hora atual com objeto LocalTime e formata��o customizada]");
		System.out.println(hora.format(DateTimeFormatter.ofPattern("HH:mm:ss")));	//HH = 24hr
		System.out.println(hora.format(DateTimeFormatter.ofPattern("hh:mm:ss")) + (hora.getHour() >= 12 ? " PM" : " AM"));	//hh = 12Hr (AM/PM)
		System.out.println();

		System.out.println("[Data e hora atuais com objeto LocalDateTime]");
		System.out.println(LocalDateTime.now() + " (ISO)");
		System.out.println();

		System.out.println("[Data e hora atuais com objeto LocalDateTime e formata��o customizada]");
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		System.out.println();
		
		// Exemplos de como alterar uma data. As fun��es retornam um novo objeto (n�o mudam o original)
		LocalDate d = LocalDate.of(1979, 11, 20);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("[Modifica��es no objeot LocalDate]:");
		System.out.println("Original: " + d.format(dtf));
		System.out.println("Adicionado 1 dia: " + d.plusDays(1).format(dtf));
		System.out.println("Adicionados 2 meses: " + d.plusMonths(2).format(dtf));
		System.out.println("Adiconado 1 ano: " + d.plusYears(1).format(dtf));
		System.out.println();
		
		// Exemplos de como alterar um hor�rio. As fun��es retornam um novo objeto (n�o mudam o original)
		dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime t = LocalTime.of(15, 10, 32);
		System.out.println("[Modifica��es no objeto LocalTime]:");
		System.out.println("Original: " + t.format(dtf));
		System.out.println("Adiconados 21 segundos: " + t.plusSeconds(21).format(dtf));
		System.out.println("Adicionados 10 minutos: " + t.plusMinutes(10).format(dtf));
		System.out.println("Adiconadas 3 hora: " + t.plusHours(3).format(dtf));
		System.out.println();
	}

}
