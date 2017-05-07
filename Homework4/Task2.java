import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int rows = 4;
		int cols = 4;
		
		int[][] arr = new int[rows][cols];
		
		for(int i = 0; i < arr.length; i++){
			
			for(int j = 0; j < arr[i].length; j++){
				
				System.out.println("Въведете число за позиция [" + i + "][" + j + "] от масива");
				arr[i][j] = scan.nextInt();
				
			}
		}
		
		System.out.println("Вашата матрица изглежда по следния начин:");

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				if(j == arr[i].length-1){
					System.out.println(arr[i][j]);
				}
				else{
					System.out.print(arr[i][j] + ", ");
				}
			}
			System.out.println();
		} 
		
		System.out.print("Правият диагонал е: ");
		
		for(int i = 0; i < arr.length; i++){
			
			for(int j = 0; j < arr[i].length; j++){
				if(i == j){
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		
		System.out.println();
		
		System.out.print("Обратният диагонал е: ");
		
		for(int i = 0; i < arr.length; i++){
			
			for(int j = 0; j < arr[i].length; j++){
				if(i + j == ((arr.length-1)+(arr[i].length))/2){
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}

}
