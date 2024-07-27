package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate data = LocalDate.now();
		LocalDateTime dataHora = LocalDateTime.now();
		Instant dataHoraMarco0 = Instant.now();

		LocalDate dataEscrita = LocalDate.parse("2024-06-19");
		LocalDateTime dataHoraEscrita = LocalDateTime.parse("2024-06-19T14:24:59");
		Instant dataHoraMarco0Escrita = Instant.parse("2024-06-30T17:27:21Z");
		Instant dataHoraMarco0Escrita_3 = Instant.parse("2024-06-30T17:27:21-03:00");

		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate personalizado = LocalDate.parse("20/08/2024", dtf1);
		LocalDate personalizadoComHora = LocalDate.parse("20/08/2034 22:35", dtf2);

		
		LocalDate anoMesDia = LocalDate.of(2202, 04, 21);
		LocalDateTime ex = LocalDateTime.of(2034, 02, 12, 15, 54);
		
		
		System.out.println(data);
		System.out.println(dataHora);
		System.out.println(dataHoraMarco0);
		System.out.println(dataEscrita);
		System.out.println(dataHoraEscrita);
		System.out.println(dataHoraMarco0Escrita);
		System.out.println(dataHoraMarco0Escrita_3);
		System.out.println(personalizado);
		System.out.println(personalizadoComHora);
		System.out.println(anoMesDia);
		System.out.println(ex);

	}

}
