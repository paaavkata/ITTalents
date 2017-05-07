import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля Въведете страна на квадрата B в интервала от 3 до 20");
		int b = sc.nextInt();
		System.out.println("Моля Въведете символ за запълване на квадрата");
		char c = sc.next().charAt(0);
		
		if(b<3 && b>20){
			System.out.println("Въведеното число е извън посоченият интервал");
		}
		else{
			for(int i=1; i<=b; i++){
				if(i==1 || i==b){
					for(int j=1; j<=b; j++){
						System.out.print("*");
					}
						
				}
				if(i != 1 && i != b){
					
					System.out.print("*");
					
					for(int m=2; m<b; m++){
							
							System.out.print(c);
						}
						System.out.print("*");
					}
					System.out.println();
				}
				
			
		}
		
		
	}

}
