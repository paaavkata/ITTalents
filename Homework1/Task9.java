import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������� �������� 2 ����� ���������� �������� ����� � ��������� ���� ���������� ����� �� ��������� � ����� �����");
		
		System.out.println("�������� ����� � ����� 10 � 99");
		int number1 = sc.nextInt();
		
		System.out.println("�������� ����� B ����� 10 � 99");
		int number2 = sc.nextInt();
		
		int temp = number1*number2;
		int temp2 = temp % 10;
		
		if (temp2 % 2 == 0) {
			System.out.println("�������������� �� � � B e "+temp+", � ���������� ����� � "+temp2+", ����� � �����");			
		}
		else {
			System.out.println("�������������� �� � � B e "+temp+", � ���������� ����� � "+temp2+", ����� � �������");			
		}
	}

}
