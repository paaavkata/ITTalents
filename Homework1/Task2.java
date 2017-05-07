import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	
		System.out.println("Програмата изчислява предварително зададени аритметични операции");
		
		System.out.println("Въведете първо число");
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble();
		
		System.out.println("Въведете второ число");
		double number2 = sc.nextDouble();
		
		double sum = number1 + number2;
		double dev = number1 - number2;
		double mul = number1 * number2;
		double del = number1 % number2;
		double del1 = number1 / number2;
		
		System.out.println("Сборът от "+number1+" и "+number2+" е "+sum);
		System.out.println("Разликата между "+number1+" и "+number2+" е "+dev);
		System.out.println("Резултатът от умножнието на "+number1+" и "+number2+" е "+mul);
		System.out.println("Остатъкът от делението на "+number1+" и "+number2+" е "+del);
		System.out.println("Резултатът от делението от "+number1+" и "+number2+" е "+del1);
}
}
