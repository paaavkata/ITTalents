import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	
		System.out.println("���������� ��������� ������������� �������� ����������� ��������");
		
		System.out.println("�������� ����� �����");
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble();
		
		System.out.println("�������� ����� �����");
		double number2 = sc.nextDouble();
		
		double sum = number1 + number2;
		double dev = number1 - number2;
		double mul = number1 * number2;
		double del = number1 % number2;
		double del1 = number1 / number2;
		
		System.out.println("������ �� "+number1+" � "+number2+" � "+sum);
		System.out.println("��������� ����� "+number1+" � "+number2+" � "+dev);
		System.out.println("���������� �� ���������� �� "+number1+" � "+number2+" � "+mul);
		System.out.println("��������� �� ��������� �� "+number1+" � "+number2+" � "+del);
		System.out.println("���������� �� ��������� �� "+number1+" � "+number2+" � "+del1);
}
}
