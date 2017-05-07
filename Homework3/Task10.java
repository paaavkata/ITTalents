import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[7];
		System.out.println("Въведете числа за всяка от седемте позиции");
		System.out.println();
		int sum = 0;
		
		for(int i = 0; i < arr.length ; i++){
			System.out.print("Въведете число за позиция "+i+" на масива: ");
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		
		double avg = sum/7;
		
		int index = 0;
		
		double min = Math.abs(avg - arr[0]);
		
		for(int i = 1; i < arr.length; i++){
			if(Math.abs(avg - arr[i]) < min){
				min = Math.abs(avg - arr[i]);
				index = i;
			}
			else{
				
			}
			
		}
		System.out.println(arr[index]);
	}

}
