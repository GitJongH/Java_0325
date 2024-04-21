package Ch3;

import java.util.Scanner;

public class Ch03_Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 10개 입력>>");
		
		int intArray[] = new int[10];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
		}
		
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] % 3 == 0) {
				System.out.print(intArray[i] + " ");
			}
		}
	}
}
