import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		
	
System.out.println("���������� ��������� ����������� �� ��� ���������� �������� �����");
	
	System.out.println("�������� ����� A");
	Scanner sc = new Scanner(System.in);
	int a1 = sc.nextInt();
	
	System.out.println("�������� ����� B");
	int a2 = sc.nextInt();
	
	System.out.println("�������� ����� C");
	int a3 = sc.nextInt();
	
	int temp = a1;
	a1 = a2;
	a2 = a3;
	a3 = temp;
	
	System.out.println("A="+a1);
	System.out.println("B="+a2);
	System.out.println("C="+a3);
	
	}
}
