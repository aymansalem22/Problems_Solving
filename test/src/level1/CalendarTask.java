package level1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTask {
	public static void main(String[] args) {
		printCalendry();
	}

	public static void printCalendry() {
		GregorianCalendar d = new GregorianCalendar();// 4/dec/2022
		// GregorianCalendar d=new GregorianCalendar(2022,11,04);
		int today = d.get(Calendar.DAY_OF_MONTH);
		System.out.println(
				"------------- " + (d.get(Calendar.MONTH) + 1) + "/" + d.get(Calendar.YEAR) + " ------------------");
		System.out.println();
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		for (String day : days) {
			System.out.printf("%3s ", day);
		}
		System.out.println("");

		d.set(Calendar.DAY_OF_MONTH, 1);// start from 1 dec
		int dayWeek = d.get(Calendar.DAY_OF_WEEK);// know which day is the 1 wed sat etc
		for (int i = Calendar.SUNDAY; i < dayWeek; i++) {
			System.out.print("    ");// every day represent four spaces
		}
		int lastday = d.getActualMaximum(Calendar.DATE);
		for (int i = 0; i < lastday; i++) {
			System.out.printf("%3d", d.get(Calendar.DAY_OF_MONTH));
			if (d.get(Calendar.DAY_OF_MONTH) == today) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}

			if (d.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {// new line
				System.out.println();
			}
			d.add(Calendar.DAY_OF_MONTH, 1);

		}
		System.out.println("");

	}

}
