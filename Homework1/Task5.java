import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
	System.out.println("���������� �������� � �������� ��� ��� ���������� �������� �����");
	
	System.out.println("�������� ����� A");
	Scanner sc = new Scanner(System.in);
	double number1 = sc.nextDouble();
	
	System.out.println("�������� ����� B");
	double number2 = sc.nextDouble();
	
	System.out.println("�������� ����� C");
	double number3 = sc.nextDouble();
	
	if (number1>number2) {
		if(number2>number3){
				System.out.println(number1);
				System.out.println(number2);
				System.out.println(number3);
		}
		else {
			if(number3>number1) {
					System.out.println(number3);
					System.out.println(number1);
					System.out.println(number2);
			}
			else {
					System.out.println(number1);
					System.out.println(number3);
					System.out.println(number2);
			}
		}
	}
	else {
		if(number2>number3) {
			if (number3>number1) {
			System.out.println(number2);
			System.out.println(number3);
			System.out.println(number1);
			}
			else {
				System.out.println(number2);
				System.out.println(number1);
				System.out.println(number3);
			}
		}
		else {
			System.out.println(number3);
			System.out.println(number2);
			System.out.println(number1);
		}
	}
	}
}
		
