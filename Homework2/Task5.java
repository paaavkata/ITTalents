import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �������� ����� A");
		int a = sc.nextInt();
		
		System.out.println("���� �������� ����� B");
		int b = sc.nextInt();
		
		if (a>b){
			int temp = a;
			a = b;
			b = temp;
		}
			
		for (int i=a; i<=b; i++){
				
			System.out.println(i);
						
		}
		}
}


