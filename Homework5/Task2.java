import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����� ���� �� 10 �� 20 �������");
		String text1 = sc.next();
		
		while (text1.length() > 20 || text1.length() < 10){
			System.out.println("��������� �� ���������� ���� �� � � ���������� ��������. ������ ������");
			text1 = sc.next();
		}
		
		System.out.println("�������� ����� ���� �� 10 �� 20 �������");
		String text2 = sc.next();
		
		while (text2.length() > 20 || text2.length() < 10){
			System.out.println("��������� �� ���������� ���� �� � � ���������� ��������. ������ ������");
			text2 = sc.next();
		}
		
		String text1Cutted = text1.substring(0, 5)+text2.substring(5);
		String text2Cutted = text2.substring(0, 5)+text1.substring(5);
		
		System.out.println(text1Cutted);
		System.out.println(text2Cutted);
		System.out.println(text1.length() > text2.length() ? text1.length() : text2.length());
	}
}
