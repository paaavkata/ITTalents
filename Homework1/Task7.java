import java.util.Scanner;

public class Task7 {
public static void main(String[] args) {
System.out.println("���������� ��������� ����������� �� ��� ���������� �������� �����");
	
	System.out.println("�������� ���");
	Scanner sc = new Scanner(System.in);
	int hour = sc.nextInt();
	
	System.out.println("�������� ���� ����");
	double money = sc.nextDouble();
	
	System.out.println("�������� ������������ ���������(true-�����, false-�����)");
	boolean condition = sc.nextBoolean();
	
	if (hour>0 && hour<24) {
	
	if (condition==false) {
		if (money>0) {
			if (hour>=8 && hour <=20) {
				System.out.println("���� �� �������, ������ ��� �����, �� �� ����� �� �� ���� ���������");
			}
			else {
				System.out.println("���� �� �������, ������ ��� ����� � ���� �� ����� �� ���� ���������, ������ �������� � ��������� �� ����");
			}
		}
		else {
			System.out.println("���� �� �������, ������ ��� �����. �� ��� ���, ������ ����� ���� �� ���������.");
		}
	}
	else {
		if (hour>=10 && hour<=22) {
			if (money>10){ 
			System.out.println("�� ����� �� ���� � ��������, ������ ���� ���� � ��� �����.");
			}
			else {
				System.out.println("�� ����� �� ����, ������ ����� ���������� ���� �� ����");
			}
		}
		else {
			System.out.println("����� ���, �� ���� �� ���� ������, ������ ������ � ��������� �� ����");
		}
	}
	}
	else {
		System.out.println("���������� ��� �� � ����� 0 � 24 ����");
	}
		
}
}
