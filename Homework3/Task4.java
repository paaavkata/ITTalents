import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете положително число за дължина на масива");
		int a = scan.nextInt();
		while(a<0 || a % 2 != 0){
			System.out.println("Въведеното число е отрицателно или е нечетно. Опитай отново");
			a = scan.nextInt();
		}
		
		int[] arr = new int[a];
		for(int i = 0; i < arr.length ; i++){
			System.out.println("Въведете число за позиция "+i);
			arr[i] = scan.nextInt();
		}	
		
		int[] arr1 = new int[arr.length/2];
		int[] arr2 = new int[arr.length/2];
		
		for(int i = 0; i < arr1.length ; i++){
			arr1[i] = arr[i];
		}
		int j = 0;
		for(int i = arr.length-1; i>=arr2.length; i--){
			arr2[j] = arr[i];
			j++;
		}
		boolean equal = true;
		for(int i = 0; i<=arr1.length-1; i++){
			if(arr1[i] != arr2[i]){
				equal = false;
			}
			
		}
		if(equal){
			System.out.println("Масивът е огледален");
		}
		else{
			System.out.println("Масивът не е огледален");
		}
		
	}

}
