import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������� ��������� ���� ������ ����� � � ���������� �������");
		
		System.out.println("�������� ��������� �������");
		double number1 = sc.nextDouble();
		
		System.out.println("�������� ���������� �������");
		double number2 = sc.nextDouble();
		
		System.out.println("�������� ����� �� ��������");
		double number3 = sc.nextDouble();
		
		if (number3>number1 && number3<number2)
		{
			System.out.println("������� "+number3+" � ����� "+number1+" � "+number2);
		}
		else 
		{
			System.out.println("������� "+number3+" �� � ����� "+number1+" � "+number2);
		}

	}

}
