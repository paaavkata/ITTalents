import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Програмата подрежда във възходяш ред две произволно въведени числа");
		
		System.out.println("Въведете число A");
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble();
		
		System.out.println("Въведете число B");
		double number2 = sc.nextDouble();
		
		if (number1>number2) {
			System.out.println(number2);
			System.out.println(number1);
		}
		else {
			System.out.println(number1);
			System.out.println(number2);
		}
	}

}
