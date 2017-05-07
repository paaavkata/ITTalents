import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете имената разделени със запетая");
		String text = sc.nextLine();
		String names[] = text.split(",");
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i < names[0].length(); i++) {
			sum1 += names[0].charAt(i);
		}
		
		for (int i = 0; i < names[1].length(); i++) {
			sum2 += names[1].charAt(i);
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum1 > sum2 ? names[0] : names[1]);
		
	}
}
