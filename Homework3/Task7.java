import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Въведете положително число за дължина на масива");
		int a = scan.nextInt();
		while(a<0){
			System.out.println("Въведеното число е отрицателно. Опитай отново");
			a = scan.nextInt();
		}
		
		int[] arr1 = new int[a];
		
		for(int i = 0; i < arr1.length ; i++){
			System.out.println("Въведете число за позиция "+i+" на масива");
			arr1[i] = scan.nextInt();
		}
		
		int[] arr2 = new int[a];
		arr2[0] = arr1[0];
		arr2[arr2.length-1] = arr1[arr1.length-1];
		for(int i=1; i < arr2.length-1; i++){
			arr2[i] = arr1[i-1] + arr1[i+1];
		}
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + " ");
		}
	}

}
