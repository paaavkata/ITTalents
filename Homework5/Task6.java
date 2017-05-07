import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете думите разделени с интервал");
		String text = sc.nextLine();
		String names[] = text.split(" ");
		
		for (int i = 0; i < names.length; i++) {
			names[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring(1);
		}
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		
	}
}
