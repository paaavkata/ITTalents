import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете число n");
		int n = sc.nextInt();
		int print = n-1;
		
		if(n>=1){
			for(int i = 1; i<=n; i++){
				for(int j = 1; j<=n; j++){
					System.out.print(print);
				}
				System.out.println();
				print+=2;
			}
			
		}
		else {
			System.out.println("За въведеното число няма решения на задачата");
		}
	}

}
