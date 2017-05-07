import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		boolean prime = true;
		
		for (int i = 2; i <= number-1; i++) {
			if (number % i == 0) {
				prime = false;
				break;
			}
		}
		
		if (prime){
			System.out.println("Числото е просто");
		}
		else{
			System.out.println("Числото не е просто");
		}
	}

}
