import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете число за проверка дали е просто");
		int n = scan.nextInt();
		
		boolean prime = prime(n, 2);
		System.out.println(prime ? "Числото е просто" : "Числото не е просто");
	}
	
	static boolean prime(int n, int del){
		if(n == del){
			return true;
		}
		
		if(n % del == 0){
			return false;
		}
		
		return prime(n, del+1);
	}
}
