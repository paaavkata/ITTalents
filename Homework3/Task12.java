import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[7];
		System.out.println("�������� ����� �� ����� �� ������� �������");
		System.out.println();
		int sum = 0;
		
		for(int i = 0; i < arr.length ; i++){
			System.out.print("�������� ����� �� ������� "+i+" �� ������: ");
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		int temp = 0;
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];
		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] = arr[4] / arr[5];
		
		System.out.println("���������� ����� �������� �� ������� �����: " );
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}

}
