import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Програмата проверява дали дадено число е в зададените граници");
		
		System.out.println("Въведете минимална граница");
		double number1 = sc.nextDouble();
		
		System.out.println("Въведете максимална граница");
		double number2 = sc.nextDouble();
		
		System.out.println("Въведете число за проверка");
		double number3 = sc.nextDouble();
		
		if (number3>number1 && number3<number2)
		{
			System.out.println("Числото "+number3+" е между "+number1+" и "+number2);
		}
		else 
		{
			System.out.println("Числото "+number3+" не е между "+number1+" и "+number2);
		}

	}

}
