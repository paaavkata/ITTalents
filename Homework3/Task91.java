import java.util.Scanner;

public class Task91 {

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
		int j = arr1.length-1;
		int temp;
		for(int i = 0; i <=arr1.length/2; i++){
			temp = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp;
			j--;
			
		}
		
		System.out.println("Полученият масив изглежда по следния начин: " );
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		
	}

}
