import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� ����������� ����� �� ������� �� ������");
		int a = scan.nextInt();
		while(a<0){
			System.out.println("���������� ����� � �����������. �������� ������");
			a = scan.nextInt();
		}
		
		int[] arr1 = new int[a];
		System.out.println();
		
		for(int i = 0; i < arr1.length ; i++){
			System.out.print("�������� ����� �� ������� "+i+" �� ������: ");
			arr1[i] = scan.nextInt();
			
		}
		
		int j = 0;
		System.out.println();
		for(int i = 0; i < arr1.length ; i++){
			if(arr1[i]>5 && arr1[i] % 5 == 0){
				System.out.print(arr1[i] + ", ");
				j++;
			}
		}
		System.out.print(j+" �����");
		
	}

}
