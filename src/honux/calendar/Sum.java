package honux.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력 : 키보드로 두 수의 입력을 받는다.
		//출력 : 화면에 두 수의 합을 출력한다.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 수를 입력하시오: ");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		System.out.println("두 수의 합은: " + (number1 + number2) + "입니다.");
		scanner.close();
	}

}
