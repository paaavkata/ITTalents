import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първи низ до 40 символа");
		String text1 = sc.nextLine();
		
		while (text1.length() >40){
			System.out.println("Въведеният низ е по-дълъг от 40 символа. Опитай отново");
			text1 = sc.nextLine();
		}
		
		System.out.println("Въведете втори низ до 40 символа");
		String text2 = sc.nextLine();
		
		while (text2.length() >40){
			System.out.println("Въведеният низ е по-дълъг от 40 символа. Опитай отново");
			text2 = sc.nextLine();
		}
		
		String text1Upper = text1.toUpperCase();
		String text1Lower = text1.toLowerCase();
		String text2Upper = text2.toUpperCase();
		String text2Lower = text2.toLowerCase();
		
		System.out.println(text1Upper);
		System.out.println(text2Upper);
		System.out.println(text1Lower);
		System.out.println(text2Lower);
		
	}
}
