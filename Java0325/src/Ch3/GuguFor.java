package Ch3;

import java.util.Scanner;

public class GuguFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력하세요>>");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + n + "까비 합 = " + sum);
	}

}
