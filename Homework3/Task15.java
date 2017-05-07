import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Въведете размер на масива:");
		
		int a = scan.nextInt();
		
		double[] arr =  new double[a];
		
		int j = 0;
		
		for(int i=0; i < arr.length; i++){
			
			System.out.print("Въведете реално число за позиция "+i+": ");
			
			arr[i] = scan.nextDouble();
			
		}
		double max1 = 0;
		
		double max2 = 0;
		
		double max3 = 0;
		
		for(int i=0; i < arr.length; i++){
			if(max1 < Math.abs(arr[i])){
				max1 = Math.abs(arr[i]);
			}	
		}

		for(int i=0; i < arr.length; i++){
			if(arr[i] != max1){
				if(max2 < Math.abs(arr[i])){
					max2 = Math.abs(arr[i]);
				}
			}
		}

		for(int i=0; i < arr.length; i++){
			if(arr[i] != max1 && arr[i] != max2){
				if(max3 < Math.abs(arr[i])){
					max3 = Math.abs(arr[i]);
				}
			}
		}
		System.out.println();
		System.out.println(max1+"; "+max2+"; "+max3);
	}

}
