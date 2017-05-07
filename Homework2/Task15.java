import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете число");
		int n = sc.nextInt();
		int j = 0;
		do{
			j+=n;
			n--;
		}
		while(n!=0);
		System.out.println(j);
		
	}

}
