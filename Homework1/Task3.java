import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������� ������� ����������� �� ��� ���������� �������� �����");
		
		System.out.println("�������� ����� A");
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble();
		
		System.out.println("�������� ����� B");
		double number2 = sc.nextDouble();
		
		double temp = number2;
		number2 = number1;
		number1 = temp;
		
		System.out.println("���������� �� � � "+number1+", � ���������� �� B e "+number2);
		
		
	}

}
