package Ch3;

public class DoWhileSample { // 김종현
	public static void main(String[] args) {
		char a = 'a';
		
		do {
			System.out.print(a);
			a = (char) (a + 1);
		} while (a <= 'z');
		
		System.out.println();
		a = 'a';
		for (int i = 0; i < 26; i++) {
			System.out.print(a);
			a = (char) (a + 1);
		}
		
		System.out.println();
		for (a = 'a'; a <= 'z'; a++) {
			System.out.print(a);
		}
	}
}
