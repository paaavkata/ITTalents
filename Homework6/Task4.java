import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� ����� ������� �� ��������");
		int min = scan.nextInt();
		System.out.println("�������� ����� ������� �� ��������");
		int max = scan.nextInt();
		while(min >= max){
			System.out.println("���������� ����� � ��-����� ��� ����� �� ������� �������. ������ ������");
			max = scan.nextInt();
		}
		
		redica(min, max);
	}
	
	public static void redica(int min, int max){
		if(max == min-1){
			return;
		}
		redica(min, max-1);
		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
	}
}
