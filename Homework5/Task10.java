import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете низ от символи");
		String text = sc.next();
		int ascii = 0;
		
		for (int i = 0; i < text.length(); i++) {
			ascii = (int)text.charAt(i);
			ascii += 5;
			System.out.print((char)ascii);
			ascii = 0;
		}
		
		
	}

}
