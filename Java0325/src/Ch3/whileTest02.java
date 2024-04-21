package Ch3;

import java.util.Scanner;

public class whileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int com = (int)(Math.random() * 10) + 1; // 1 ~ 10 사이의 랜덤 정수
		int count = 0;
		while (true) {
			System.out.print("컴퓨터가 생각한 수를 맞춰보세요(1~10사이)>>");
			int usr = s.nextInt();
			count++;
			if (com > usr) {
				System.out.println("입력한 수가 작습니다.");
			}
			else if (com < usr) {
				System.out.println("입력한 수가 큽니다.");
			}
			else {
				System.out.println(count + "번 만에 맞췄습니다.");
				break;
			}
		}
		
		s.close();
	}

}
