import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("����, �������� ����� N � ��������� 10 �� 5555");
		int n = sc.nextInt();
		System.out.println("����, �������� ����� M � ��������� 10 �� 5555");
		int m = sc.nextInt();
		if(n<10 || n>5555 || m<10 || m>5555){
			System.out.println("����� �� ���������� ����� �� � � ���������� ��������");
		}
		else {
			if(n>m){
				int temp = n;
				n = m;
				m = temp;
			}
			for(int i=m; i>=n; i--){
				if(i%50==0){
					System.out.print(i);
					System.out.print(", ");
				}
			}
		}
		
	}

}
