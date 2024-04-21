package Ch3;
// for 실습
import java.util.Scanner;

public class GuguTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("단 입력하세요>>");
		int n = s.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
			// System.out.printf("%d * %d = %2d\n", n, i, (n * i)); // 오른쪽 정렬
		}
	}

}
