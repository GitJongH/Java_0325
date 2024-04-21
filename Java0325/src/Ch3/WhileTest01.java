package Ch3;

import java.util.Scanner;

public class WhileTest01 { // 김종현
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("* 메뉴 *");
		System.out.println("1. 아메리카노 2000원");
		System.out.println("2. 아아 2500원");
		System.out.println("3. 기타 3000원");
		System.out.println("[주문 종료 0입력]");
		System.out.println("=============");
		
		while (true) {
			System.out.print("메뉴 입력>>");
			int coffee = s.nextInt();
			if (coffee == 0) {
				break;
			}
			switch (coffee) {
			case 1:
				sum += 2000;
				break;
			case 2:
				sum += 2500;
				break;
			case 3:
				sum += 3000;
				break;
			default:
				System.out.println("없는 메뉴입니다.");
				break;
			}
		}
		System.out.println("=============");
		System.out.println("주문 종료...");
		System.out.println("주문 금액 = " + sum);
		System.out.println("=============");
		
		s.close();
	}
}
