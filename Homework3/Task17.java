import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Въведете размер на масива:");
		
		int a = scan.nextInt();
		
		int[] arr =  new int[a];
		
		int j = 0;
		
		for(int i=0; i < arr.length; i++){
			
			System.out.print("Въведете реално число за позиция "+i+": ");
			
			arr[i] = scan.nextInt();
			
		}
		boolean ZigZag = true;
		for(int i = 1;  i < arr.length; i++){
			if(i%2 == 0){
				if(arr[i-1] < arr[i - 2] || arr[i-1] > arr[i]){
					ZigZag = false;
					System.out.println(i);
					break;
					
				}
			}
		}
		System.out.println();
		System.out.println(ZigZag ? "Да, редицата е зигзагообразна нагоре" : "Не, редицата не е зигзагообразна нагоре");
		
	}

}
