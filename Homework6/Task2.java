import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете първо число за умножение");
		int a = scan.nextInt();
		System.out.println("Въведете второ число за умножение");
		int b = scan.nextInt();
			
		int c = proizvedenie(a,b);
		
		System.out.println("Произведението от цифите " + a + " и " + b + " е " + c);
	}

	static int proizvedenie(int a, int b){
		
		if(a == 0 || b == 0){
			return 0;
		}
		
		return a + proizvedenie(a, b-1);
	}
}
