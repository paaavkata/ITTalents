import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������� ����������� ����� �� ������� �� ��������");
		int a = scan.nextInt();
		while(a<0){
			System.out.println("���������� ����� � �����������. ������ ������");
			a = scan.nextInt();
		}
		
		int[] arr1 = new int[a];
		int[] arr2 = new int[a];
		int[] arr3 = new int[a];
		System.out.println();
		for(int i = 0; i < arr1.length ; i++){
			System.out.print("�������� ����� �� ������� "+i+" �� ����� 1: ");
			arr1[i] = scan.nextInt();
		}
		System.out.println("������� ��������� �� ������� �� ����� 2:");
		for(int i = 0; i < arr2.length ; i++){
			System.out.print("�������� ����� �� ������� "+i+" �� ����� 2: ");
			arr2[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("����� 1 �������� �� �������� �����: ");
		for(int i = 0; i < arr1.length; i++){
			if(arr1[i] == arr2[i]){
				arr3[i] = arr1[i];
			}
			else{
				if(arr1[i] > arr2[i]){
					arr3[i] = arr1[i];
				}
				
				else{
					arr3[i] = arr2[i];
				}
			}
		}
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("����� 2 �������� �� �������� �����: ");
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.println("���������� ����� �������� ����: ");
		for(int i = 0; i < arr3.length; i++){
			System.out.print(arr3[i] + " ");
		}
	}
}
