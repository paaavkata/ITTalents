import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� ����� � ��������� �� 10 �� 200");
		int n = sc.nextInt();
		if(n>=10 && n<=200){
			for(int i=n; i>=0; i--){
				if(i%7 ==0){
					System.out.println(i);
				}
			}
		}
		else
			System.out.println("���������� ����� �� � � ���������� ��������");
		
	}
}
