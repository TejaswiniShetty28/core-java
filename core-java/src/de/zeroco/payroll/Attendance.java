package de.zeroco.payroll;

import java.time.Duration;
import java.time.LocalDateTime;

public class Attendance {
	
	public static Duration hoursWorked(int loggedInYear, int loggedOutyear, int loggedInMonth, int loggedOutMonth, int loggedInDate, int loggedOutDate, int loggedInsec, int loggedInMin, int loggedInHour, int loggedOutHour, int loggedOutSec, int loggedOutMin) {
		LocalDateTime startTime = LocalDateTime.of(loggedInYear, loggedInMonth, loggedInDate, loggedInHour, loggedInMin, loggedInsec);
		LocalDateTime endTime = LocalDateTime.of(loggedOutyear, loggedOutMonth, loggedOutDate, loggedOutHour, loggedOutMin, loggedOutSec);
		return Duration.between(startTime, endTime);
	}
	
//	public static int totalHours(int[][] logins, int[][] logouts) {
//		int[] login;
//		int[] logout;
//		int hoursWorked = 0;
//		for (int i =  0; i < logins.length; i++) {
//			login = logins[i];
//	        logout = logouts[i];
//			hoursWorked += hoursWorked(login[i], logout[i]);
//		}
//		return hoursWorked;
//	}
}
