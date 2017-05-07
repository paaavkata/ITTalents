import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете първа дума от 10 до 20 символа");
		String text1 = sc.next();
		
		while (text1.length() > 20 || text1.length() < 10){
			System.out.println("Дължината на въведената дума не е в посоченият интервал. Опитай отново");
			text1 = sc.next();
		}
		
		System.out.println("Въведете втора дума от 10 до 20 символа");
		String text2 = sc.next();
		
		while (text2.length() > 20 || text2.length() < 10){
			System.out.println("Дължината на въведената дума не е в посоченият интервал. Опитай отново");
			text2 = sc.next();
		}
		
		String text1Cutted = text1.substring(0, 5)+text2.substring(5);
		String text2Cutted = text2.substring(0, 5)+text1.substring(5);
		
		System.out.println(text1Cutted);
		System.out.println(text2Cutted);
		System.out.println(text1.length() > text2.length() ? text1.length() : text2.length());
	}
}
