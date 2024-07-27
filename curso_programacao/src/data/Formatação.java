package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		LocalDate dataEscrita = LocalDate.parse("2024-06-19");
		Instant dataHoraMarco0Escrita = Instant.parse("2024-06-30T17:27:21Z");
		Instant dataHoraMarco0Escrita_3 = Instant.parse("2024-06-30T17:27:21-03:00");

		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println(dataEscrita.format(fmt1));
		System.out.println(fmt1.format(dataEscrita));
		System.out.println(dataEscrita.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
		System.out.println(dataEscrita.format(fmt2));

	
	}

}
