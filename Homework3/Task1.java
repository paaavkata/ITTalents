import java.util.Scanner;

public class Task1 {

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
		
		int min = arr[0];
		int procent3 = 0;
		for(int i = 1; i < arr.length ; i++){
			if(arr[i] < min){
				min = arr[i];
				System.out.println(min);
				if(arr[i] % 3 == 0){
					procent3 = arr[i];
				}
			}
			
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println(procent3);
		System.out.println("Най-малкото число кратно на 3 е "+procent3);
		
		
	}

}
