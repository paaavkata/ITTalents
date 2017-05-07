import java.util.Scanner;

public class Task9 {

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
		int j = 0;
		for(int i = arr1.length-1; i>= 0; i--){
			arr2[j] = arr1[i];
			j++;
		}
		for(int i = arr1.length-1; i >= 0; i--){
			arr1[i] = arr2[i];
		}
		System.out.println("Полученият масив изглежда по следния начин: " );
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		
	}

}
