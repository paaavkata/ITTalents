import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int temp = number;
		int j = 0;
		
		while(temp != 0){
			temp /= 2;
			j++;
		}
		int[] arr1 = new int[j];
		temp = number;
		for(int i = j-1; i>=0; i--){
			arr1[i] = temp%2;
			temp /= 2;
			
		}
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i]);
		}
		
	}

}
