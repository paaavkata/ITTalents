import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля, въведете число N в интервала 10 до 5555");
		int n = sc.nextInt();
		System.out.println("Моля, въведете число M в интервала 10 до 5555");
		int m = sc.nextInt();
		if(n<10 || n>5555 || m<10 || m>5555){
			System.out.println("Някое от въведените числа не е в посоченият интервал");
		}
		else {
			if(n>m){
				int temp = n;
				n = m;
				m = temp;
			}
			for(int i=m; i>=n; i--){
				if(i%50==0){
					System.out.print(i);
					System.out.print(", ");
				}
			}
		}
		
	}

}
