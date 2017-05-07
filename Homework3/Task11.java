import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете положително число за дължина на масива");
		int a = scan.nextInt();
		while(a<0){
			System.out.println("Въведеното число е отрицателно. Опитайте отново");
			a = scan.nextInt();
		}
		
		int[] arr1 = new int[a];
		System.out.println();
		
		for(int i = 0; i < arr1.length ; i++){
			System.out.print("Въведете число за позиция "+i+" на масива: ");
			arr1[i] = scan.nextInt();
			
		}
		
		int j = 0;
		System.out.println();
		for(int i = 0; i < arr1.length ; i++){
			if(arr1[i]>5 && arr1[i] % 5 == 0){
				System.out.print(arr1[i] + ", ");
				j++;
			}
		}
		System.out.print(j+" числа");
		
	}

}
