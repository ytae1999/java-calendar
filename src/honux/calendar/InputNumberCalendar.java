package honux.calendar;

import java.util.Scanner;

public class InputNumberCalendar {

	// 다른 방법으로 풀이하기
	// System.out.print("달을 입력하세요: ");
	//
	// Scanner scanner = new Scanner(System.in);
	// int month = scanner.nextInt();
	// int[] lastMonthDates = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
	// System.out.println(month + "월은 " + lastMonthDates[month - 1] + "까지 있습니다.");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램

		System.out.print("달을 입력하세요: ");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
		case 4:
		case 6:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 30일까지 있습니다.");
			break;

		}
		scanner.close();
	}

}