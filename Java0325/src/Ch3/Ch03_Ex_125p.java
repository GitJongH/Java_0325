package Ch3;

import java.util.Scanner;

public class Ch03_Ex_125p {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("알파벳 한 문자를 입력하세요>>");
		String s = scan.next();
		char c = s.charAt(0); // 입력한 문자열애 0번 인덱스의 문자를 변환 (문자 변환)
		
		for (char i = 'a'; i <= c; i++) {
			for (char j = i; j <= c; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		scan.close();
	}
}
