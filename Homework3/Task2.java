import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Въведете положително число за дължина на масива");
		int a = scan.nextInt();
		while(a<0){
			System.out.println("Въведеното число е отрицателно. Опитай отново");
			a = scan.nextInt();
		}
		
		int[] arr = new int[a];
		for(int i = 0; i < arr.length ; i++){
			System.out.println("Въведете число за позиция "+i);
			arr[i] = scan.nextInt();
			
		}
		int length = arr.length*2;
		int[] arrDouble = new int[length];
		
		for(int i = 0; i < arr.length ; i++){
			arrDouble[i] = arr[i];
			
		}
		
		int n = arr.length;
		for(int i = arr.length-1; i >= 0; i--){
			arrDouble[n] = arr[i];
			n++;
		}
			
		for(int i = 0; i < arrDouble.length; i++){
			System.out.print(arrDouble[i] + " ");
		}
	}

}
