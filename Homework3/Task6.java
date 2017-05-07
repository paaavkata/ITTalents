import java.util.Scanner;

public class Task6 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Въведете положително число за дължина на масив 1");
		int a = scan.nextInt();
		while(a<0){
			System.out.println("Въведеното число е отрицателно. Опитай отново");
			a = scan.nextInt();
		}
		
		int[] arr1 = new int[a];
		
		for(int i = 0; i < arr1.length ; i++){
			System.out.println("Въведете число за позиция "+i+" на масив 1");
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("Въведете положително число за дължина на масив 2");
		
		int b = scan.nextInt();
		
		while(b<0){
			System.out.println("Въведеното число е отрицателно. Опитай отново");
			b = scan.nextInt();
		}
		
		int[] arr2 = new int[b];
		
		for(int i = 0; i < arr2.length ; i++){
			System.out.println("Въведете число за позиция "+i+" на масив 2");
			arr2[i] = scan.nextInt();
		}
		boolean equal = true;
		
		for(int i = 0; i<arr1.length; i++){
			if(arr1.length != arr2.length){
				equal = false;
				break;
			}
			if(arr1[i] != arr2[i]){
				equal = false;
				break;
			}
		}
		if(equal){
			System.out.println("Масивите са еднакви. Масивите са с еднаква дължина");
		}
		else{
			System.out.println("Масивите не са еднакви. ");
			if(arr1.length != arr2.length){
				System.out.print("Масивите са с различна дължина");
			}
			else{
				System.out.print("Масивите са с еднаква дължина");
			}
		}
	}
}
