import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� 10 ����� �� ������:");
		double[] arr = new double[10];
		for(int i=0; i < arr.length; i++){
			System.out.print("�������� ������ ����� �� ������� "+i+": ");
			arr[i] = scan.nextDouble();
		}

		System.out.println("������� �������� �� ������� �����: ");
		for(int i=0; i < arr.length; i++){
			if(i != arr.length -1){
				System.out.print(arr[i]+"; ");
			}
			else{
				System.out.print(arr[i]);
			}
		}
		System.out.println();
		double[] arr1 = new double[10];
		for(int i=0; i < arr1.length; i++){
			if(arr[i] < -0.231){
				arr1[i] = (((i+1)*(i+1)) + 41.25);
			}
			else{
				arr1[i] = arr[i] * (i+1); 
			}
		}
		System.out.println("������ ����� �������� �� ������� �����: ");
		for(int i=0; i < arr1.length; i++){
			if(i != arr1.length -1){
				System.out.print(arr1[i]+"; ");
			}
			else{
				System.out.print(arr1[i]);
			}
		}
	}
}
