import java.util.Scanner;

public class Task14 {
 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�������� ������ �� ������:");
		int a = scan.nextInt();
		double[] arr =  new double[a];
		int j = 0;
		for(int i=0; i < arr.length; i++){
			System.out.print("�������� ������ ����� �� ������� "+i+": ");
			arr[i] = scan.nextDouble();
			if(arr[i] > -2.99 && arr[i] < 2.99){
				j++;
			}
		}
		
		double[] arr1 = new double[j];
	
		j = 0;
		
		for(int i=0; i < arr.length; i++){
			
			if(arr[i] > -2.99 && arr[i] < 2.99){
				arr1[j] = arr[i];
				j++;
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
