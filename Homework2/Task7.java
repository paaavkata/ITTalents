import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число n");
		int n = sc.nextInt();
		
		if(n>=1){
		
			for(int i = 1; i<=n; i++){
				
				int j = i*3;
				System.out.print(j);
				
				if(i!=n){
					System.out.print(", ");
				}
		}
		
		
		}
		else {
			System.out.println("За въведеното число няма решения на задачата");
		}
	}

}
