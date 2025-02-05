package de.zeroco.time;

import java.time.Duration;
import java.time.LocalTime;

public class Empty {
	public static void main(String[] args) {
//		LocalDate today = LocalDate.now();
//		System.out.println("Todays date : " +  today);
//		
//		LocalDate date = LocalDate.of(2025, 1, 23);
//		System.out.println(date);
//		
//		LocalDate specifiedDate = LocalDate.parse("2025-02-23");
//		System.out.println(specifiedDate);
//		
//		System.out.println("get year :" + today.getYear());
//		System.out.println("get month :" + today.getMonth());
//		System.out.println("get date of month :" + today.getDayOfMonth());
//		System.out.println("Nth day of the year" + today.getDayOfYear());
//		System.out.println("Add days to the current date :" + today.plusDays(1));
//		System.out.println("minus days to the current date :" + today.minusDays(1));
//		System.out.println("next month:" + today.plusMonths(2));
//		System.out.println("before month :" + today.minusMonths(1));
//		System.out.println("specific date is before:" + today.isAfter(specifiedDate));
//		System.out.println("specific date is after :" + today.isBefore(specifiedDate));
//		
//		LocalTime time = LocalTime.now();
//		System.out.println("print this time :" + time);
//		
//		LocalTime specificTime = LocalTime.of(2, 12, 30);
//		System.out.println("print specific time :" + specificTime);
//		
//		System.out.println("get Hour :" + time.getHour());
//		System.out.println("get minute :" + time.getMinute());
//		System.out.println("get second :" + time.getSecond());
//		System.out.println("plus hour :" + time.plusHours(2));
//		System.out.println("plus minutes :" + time.plusMinutes(12));
//		System.out.println("plus seconds :" + time.plusSeconds(2));
//		System.out.println("minus hours :" + time.minusHours(1));
//		System.out.println("minus minutes :" + time.minusMinutes(2));
//		
//		ZonedDateTime zoneDate = ZonedDateTime.now();
//		System.out.println(zoneDate);
//		
//		ZonedDateTime  specifiedZoneTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
//		System.out.println("specified time zone"  +  specifiedZoneTime);
		
	        LocalTime startTime = LocalTime.of(10, 00, 00); // 10:15:30 AM
	        LocalTime endTime = LocalTime.of(13, 00, 00);   // 12:45:50 PM
	        Duration duration = Duration.between(startTime, endTime);
	        System.out.println("Duration in hours: " + duration.toHours());
	        System.out.println("Duration in minutes: " + duration.toMinutes());
	        System.out.println("Duration in seconds: " + duration.getSeconds());
		
	}
}
