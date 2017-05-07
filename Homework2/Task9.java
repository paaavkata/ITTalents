import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете число А");
		int a = sc.nextInt();
		System.out.println("Въведете число B");
		int b = sc.nextInt();
		
		if(a>b){
			int temp = a;
			a = b;
			b = temp;
		}
		int j = 0;
		int sum = 0;
		for(int i = a; i<=b; i++){
			if(sum>200){
				break;
			}
			j=i*i;
			
			if(i % 3 == 0){
				System.out.print("skip 3, ");
			}
			
			else {
				System.out.print(j);
				sum+=j;
				System.out.print(", ");
			}
									
		}
		
		
	}

}
