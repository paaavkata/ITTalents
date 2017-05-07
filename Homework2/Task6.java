import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете число");
		int number = sc.nextInt();
		int j = 0;
		for(int i = 1;i<=number; i++){
			j+=i;
		}
		System.out.println(j);
	}
	

}
