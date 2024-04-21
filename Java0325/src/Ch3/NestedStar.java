package Ch3;

public class NestedStar {
	public static void main(String[] args) {
		
		System.out.println("== < 1 > =");
		for (int i = 0; i< 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("== < 2 > ==");
		for (int i = 0; i< 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		System.out.println("== < 3 > ==");
		for (int i = 0; i< 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
