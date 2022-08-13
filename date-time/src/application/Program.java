package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		// Instanciação
		System.out.println("Instanciação:");
		System.out.println("-------------");
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-13T10:38:31.300");
		Instant d06 = Instant.parse("2021-08-13T11:40:03Z");
		Instant d07 = Instant.parse("2021-08-13T11:40:03+01:00");
		LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt1);
		LocalDate d10 = LocalDate.of(2021, 9, 03);
		LocalDateTime d11 = LocalDateTime.of(2021, 9, 03, 10, 35, 12, 100000003);

		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);

		// Formatação
		System.out.println();
		System.out.println("Formatação:");
		System.out.println("-----------");

		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_INSTANT;

		System.out.println("d04 = " + d04); // LocalDate
		System.out.println("d04(dd/MM/yyyy) = " + d04.format(fmt2));
		System.out.println("d04(fmt como objeto) = " + fmt2.format(d04));
		System.out.println(
				"d04(formatador chamado diretamente) = " + d04.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		System.out.println();
		System.out.println("d05 = " + d05); // LocalDateTime
		System.out.println("d05(dd/MM/yyyy HH:mm) = " + d05.format(fmt3));
		System.out.println("d05(fmt como objeto) = " + fmt2.format(d05));
		System.out.println(
				"d05(formatador diretamente) = " + d05.format(DateTimeFormatter.ofPattern("dd.MM.yyyy-HH:mm")));
		System.out.println("d05(ISO_DATE_TIME) = " + fmt5.format(d05));
		System.out.println();
		System.out.println("d06 = " + d06); // Instant
		System.out.println("d06(dd/MM/yyyy HH:mm) = " + fmt4.format(d06));
		System.out.println("d06(ISO_INSTANT) = " + fmt6.format(d06));

		System.out.println();
		System.out.println("Operações:");
		System.out.println("----------");

		System.out.println("d04 = " + d04); // LocalDate
		System.out.println("d05 = " + d05); // LocalDateTime
		System.out.println("d06 = " + d06); // Instant

		for (String zone : ZoneId.getAvailableZoneIds()) {
			System.out.println("zona" + zone);
		}

	}
}
