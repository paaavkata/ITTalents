import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������� �������� ��� �������� ��� ��� ���������� �������� �����");
		
		System.out.println("�������� ����� A");
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble();
		
		System.out.println("�������� ����� B");
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
