import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� ����� N � ��������� �� 10 �� 30000");
		int n = sc.nextInt();
		if(n>=10 && n<=30000){
			int mirror = 0;
			int temp = n;
			do{
				mirror*=10;
				mirror+=temp%10;
				temp/=10;
			}
			
			while(temp>0);
			if(mirror == n){
				System.out.println("������� � ���������");
			}
			else
				System.out.println("������� �� � ���������");
			
		}
		else
			System.out.println("���������� ����� �� � � ���������� ��������");
	}

}
