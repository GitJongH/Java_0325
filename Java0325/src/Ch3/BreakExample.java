package Ch3;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		
		while (true) {
			System.out.println(">>");
			String text = s.next();
			if (text.equals("exit")) { // "exit"이 입력되면 반복 종료
				break; // while 문을 벗어남
			}
		}
		
		System.out.println("종료합니다.");
		s.close();
	}

}
