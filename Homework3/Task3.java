import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Въведете число за начало на редицата");
		Scanner scan = new Scanner(System.in);
		
		int start = scan.nextInt();
		
		int[] arr =  new int[10];
		arr[0] = start;
		arr[1] = start;
		
		for(int i=2; i<=9; i++){
			arr[i] = arr[i-1] + arr[i-2];
		}
			
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
	}

}
