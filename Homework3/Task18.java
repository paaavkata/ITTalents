import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Въведете положително число за дължина на масивите");
		int a = scan.nextInt();
		while(a<0){
			System.out.println("Въведеното число е отрицателно. Опитай отново");
			a = scan.nextInt();
		}
		
		int[] arr1 = new int[a];
		int[] arr2 = new int[a];
		int[] arr3 = new int[a];
		System.out.println();
		for(int i = 0; i < arr1.length ; i++){
			System.out.print("Въведете число за позиция "+i+" на масив 1: ");
			arr1[i] = scan.nextInt();
		}
		System.out.println("Започва въвеждане на числата от масив 2:");
		for(int i = 0; i < arr2.length ; i++){
			System.out.print("Въведете число за позиция "+i+" на масив 2: ");
			arr2[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("Масив 1 изглежда по следният начин: ");
		for(int i = 0; i < arr1.length; i++){
			if(arr1[i] == arr2[i]){
				arr3[i] = arr1[i];
			}
			else{
				if(arr1[i] > arr2[i]){
					arr3[i] = arr1[i];
				}
				
				else{
					arr3[i] = arr2[i];
				}
			}
		}
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("Масив 2 изглежда по следният начин: ");
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.println("Полученият масив изглежда така: ");
		for(int i = 0; i < arr3.length; i++){
			System.out.print(arr3[i] + " ");
		}
	}
}
