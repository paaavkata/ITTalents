import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Програмата разменя стойностите на две произволно въведени числа");
		
		System.out.println("Въведете число A");
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble();
		
		System.out.println("Въведете число B");
		double number2 = sc.nextDouble();
		
		double temp = number2;
		number2 = number1;
		number1 = temp;
		
		System.out.println("Стойността на А е "+number1+", а стойността на B e "+number2);
		
		
	}

}
