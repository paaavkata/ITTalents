import java.util.Scanner;

public class Task41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� ����������� ����� �� ������� �� ������");
		int a = scan.nextInt();
		while(a<0 || a % 2 != 0){
			System.out.println("���������� ����� � ����������� ��� � �������. ������ ������");
			a = scan.nextInt();
		}
		
		int[] arr = new int[a];
		for(int i = 0; i < arr.length ; i++){
			System.out.println("�������� ����� �� ������� "+i);
			arr[i] = scan.nextInt();
		}
		boolean equal = true;
		int temp = arr.length-1;
		for(int i = 0; i<arr.length/2; i++){
			if(arr[i] != arr[temp]){
				equal = false;
				break;
			}
			temp--;
		}
		if(equal){
			System.out.println("������� � ���������");
		}
		else{
			System.out.println("������� �� � ���������");
		}
				
	}

}
