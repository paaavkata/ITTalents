import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������� ��������� ���� ���������� �������� ����� �� ���� �� ����� �� �������� �����");
		
		System.out.println("�������� ���� ����� � ��������� �� 111 �� 999, ����� �� ������� 0");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int temp1 = number % 10;
		int temp2 = number % 100;
		temp2 = temp2 / 10;
		int temp3 = number / 100;
		
		if (number<110 || number>999 || temp1==0 || temp2==0 || temp3==0) {
			System.out.println("� ������� �� ������� ������� 0 ��� �� � � ���������� ��������");
		}
		else {
			if (number % temp1 ==0 && number % temp2 == 0 || number % temp3 ==0) { 
				System.out.println("������� "+number+" �� ���� �� ����� ���� �����");
			}
			else {
				System.out.println("������� "+number+" �� �� ���� �� ����� ���� �����");
			}
		}
	}

}
