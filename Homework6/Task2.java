import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� ����� ����� �� ���������");
		int a = scan.nextInt();
		System.out.println("�������� ����� ����� �� ���������");
		int b = scan.nextInt();
			
		int c = proizvedenie(a,b);
		
		System.out.println("�������������� �� ������ " + a + " � " + b + " � " + c);
	}

	static int proizvedenie(int a, int b){
		
		if(a == 0 || b == 0){
			return 0;
		}
		
		return a + proizvedenie(a, b-1);
	}
}
