import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������� ����������� ����� �� ������� �� ����� 1");
		int a = scan.nextInt();
		while(a<0){
			System.out.println("���������� ����� � �����������. ������ ������");
			a = scan.nextInt();
		}
		
		int[] arr1 = new int[a];
		
		for(int i = 0; i < arr1.length ; i++){
			System.out.println("�������� ����� �� ������� "+i+" �� ����� 1");
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("�������� ����������� ����� �� ������� �� ����� 2");
		
		int b = scan.nextInt();
		
		while(b<0){
			System.out.println("���������� ����� � �����������. ������ ������");
			b = scan.nextInt();
		}
		
		int[] arr2 = new int[b];
		
		for(int i = 0; i < arr2.length ; i++){
			System.out.println("�������� ����� �� ������� "+i+" �� ����� 2");
			arr2[i] = scan.nextInt();
		}
		boolean equal = true;
		
		for(int i = 0; i<arr1.length; i++){
			if(arr1.length != arr2.length){
				equal = false;
				break;
			}
			if(arr1[i] != arr2[i]){
				equal = false;
				break;
			}
		}
		if(equal){
			System.out.println("�������� �� �������. �������� �� � ������� �������");
		}
		else{
			System.out.println("�������� �� �� �������. ");
			if(arr1.length != arr2.length){
				System.out.print("�������� �� � �������� �������");
			}
			else{
				System.out.print("�������� �� � ������� �������");
			}
		}
	}
}
