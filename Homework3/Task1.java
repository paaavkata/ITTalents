import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������� ����������� ����� �� ������� �� ������");
		int a = scan.nextInt();
		while(a<0){
			System.out.println("���������� ����� � �����������. ������ ������");
			a = scan.nextInt();
		}
		
		int[] arr = new int[a];
		for(int i = 0; i < arr.length ; i++){
			System.out.println("�������� ����� �� ������� "+i);
			arr[i] = scan.nextInt();
			
		}
		
		int min = arr[0];
		int procent3 = 0;
		for(int i = 1; i < arr.length ; i++){
			if(arr[i] < min){
				min = arr[i];
				System.out.println(min);
				if(arr[i] % 3 == 0){
					procent3 = arr[i];
				}
			}
			
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println(procent3);
		System.out.println("���-������� ����� ������ �� 3 � "+procent3);
		
		
	}

}
