import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Въведете число N");
		int n = scan.nextInt();
		
		long fib = numbers(n);
		
		System.out.println(fib);
	}
	
	static long numbers(int n){
	
		if(n == 1 || n == 2){
			return 1;
		}
		
		return numbers(n-1) + numbers(n-2);
	}

}
