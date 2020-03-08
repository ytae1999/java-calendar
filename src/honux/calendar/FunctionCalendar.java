package honux.calendar;

import java.util.Scanner;

public class FunctionCalendar {

	private final int[] last_Month_Dates = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int lastMonthDates(int month) {
		
		return last_Month_Dates[month - 1];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("달을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		FunctionCalendar cal = new FunctionCalendar();

		System.out.println(month + "월은" + cal.lastMonthDates(month) + "일까지 있습니다.");		
		scanner.close();
	}

}
