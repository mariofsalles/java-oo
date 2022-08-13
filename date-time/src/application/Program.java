package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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
		Instant d06 = Instant.parse("2021-08-13T01:40:03Z");
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
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Brazil/East"));
		System.out.println();
		System.out.println("Zulu: " + r1);
		System.out.println("Brazil: " + r2);
		System.out.println();
		System.out.println("dia de hoje = " + LocalDate.now().getDayOfMonth());
		System.out.println("mês de hoje = " + LocalDate.now().getMonthValue());
		System.out.println("ano de hoje = " + LocalDate.now().getYear());
		System.out.println();
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mes = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		System.out.println();
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 min = " + d05.getMinute());
		System.out.println("d05 sec = " + d05.getSecond());
		System.out.println();
		System.out.println("Cálculos com data e hora:");
		System.out.println("-------------------------");

		System.out.println("d04 = " + d04); // LocalDate
		LocalDate pastWeekLocalDate1 = d04.minusDays(7);
		LocalDate plusWeekLocalDate1 = d04.plusDays(7);
		LocalDate plusWeekLocalYear1 = d04.plusYears(4);
		Duration deltaT2 = Duration.between(pastWeekLocalDate1.atStartOfDay(), d04.atStartOfDay());
		System.out.println("d04 - 7 dias = " + pastWeekLocalDate1);
		System.out.println("d04 + 7 dias = " + plusWeekLocalDate1);
		System.out.println("d04 + 7 anos = " + plusWeekLocalYear1);
		System.out.println();
		System.out.println("Delta pastWeekLocalDate1 and d04 = " + deltaT2.toDays() + " dias");


		System.out.println();
		System.out.println("d05 = " + d05); // LocalDateTime
		LocalDateTime pastWeekLocalDate2 = d05.minusDays(7);
		LocalDateTime plusWeekLocalDate2 = d05.plusDays(7);
		LocalDateTime plusWeekLocalYear2 = d05.plusYears(4);
		LocalDateTime plusWeekLocalHoursMinSec = d05.plusHours(4).plusMinutes(15).plusSeconds(25);
		System.out.println("d05 - 7 dias = " + pastWeekLocalDate2);
		System.out.println("d05 + 7 dias = " + plusWeekLocalDate2);
		System.out.println("d05 + 7 anos = " + plusWeekLocalYear2);
		System.out.println("d05 + hour + min + sec = " + plusWeekLocalHoursMinSec);

		System.out.println();
		System.out.println("d06 = " + d06); // Instant
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant futureWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("futureWeekInstant = " + futureWeekInstant);

		System.out.println();
		Duration deltaT1 = Duration.between(pastWeekInstant, futureWeekInstant);
		System.out.println("Delta pastWeekInstant and futureWeekInstant = " + deltaT1.toDays() + " dias");
		Duration deltaT3 = Duration.between(futureWeekInstant,pastWeekInstant);
		System.out.println("Delta futureWeekInstant and pastWeekInstant = " + deltaT3.toDays() + " dias");

	}
}
