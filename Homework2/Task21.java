import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� ����� �� 1 �� 52");
		int n = sc.nextInt();
		
		int color;
		
		int number;
		
		for(int i=n; i<=52; i++){
			color = i % 4;
			number = (i-1) / 4 + 2;
			switch(number){
				case 2:
				
				case 3:
					
				case 4:
				
				case 5:
					
				case 6:
				
				case 7:
					
				case 8:
					
				case 9:
					
				case 10:
					System.out.print(number);
					break;
				case 11:
					System.out.print("����");
					break;
				case 12:
					System.out.print("����");
					break;
				case 13:
					System.out.print("���");
					break;
				case 14:
					System.out.print("���");
					break;
				}
			switch(color){
			case 1:
				System.out.println(" ������");
				break;
			case 2:
				System.out.println(" ����");
				break;
			case 3:
				System.out.println(" ����");
				break;
			case 0:
				System.out.println(" ����");
				break;
			}
				
		}
		
		

	}

}
