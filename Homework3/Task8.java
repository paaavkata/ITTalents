import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������� ����������� ����� �� ������� �� ������");
		int a = scan.nextInt();
		while(a<0){
			System.out.println("���������� ����� � �����������. ������ ������");
			a = scan.nextInt();
		}
		
		int[] arr1 = new int[a];
		
		for(int i = 0; i < arr1.length ; i++){
			System.out.println("�������� ����� �� ������� "+i+" �� ������");
			arr1[i] = scan.nextInt();
		}
		
		int max = 1;
		
		int counter = 1;
		
		int[] arr2 = new int[arr1.length]; 
		
		for(int i = 1; i < arr1.length; i++){
			if(arr1[i-1] == arr1[i]){
				counter++;
			}
		
			else{
				counter = 1;
			}
			
			if(counter > max){
				max = counter;
				for(int j = 0; j < max; j++){
					arr2[j] = arr1[i];	
				}
			}
		}
		
		System.out.println("���-������� ������ �� ������ �: ");
		
		for(int i = 0; i < max; i++){
			System.out.print(arr2[i] + " ");
		}
	}

}
