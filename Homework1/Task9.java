import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Програмата умножава 2 числа произволно въведени числа и изчислява дали последната цифра от резултата е четно число");
		
		System.out.println("Въведете число А между 10 и 99");
		int number1 = sc.nextInt();
		
		System.out.println("Въведете число B между 10 и 99");
		int number2 = sc.nextInt();
		
		int temp = number1*number2;
		int temp2 = temp % 10;
		
		if (temp2 % 2 == 0) {
			System.out.println("Произведението от А и B e "+temp+", а последната цифра е "+temp2+", която е четна");			
		}
		else {
			System.out.println("Произведението от А и B e "+temp+", а последната цифра е "+temp2+", която е нечетна");			
		}
	}

}
