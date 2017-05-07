import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля Въведете число N");
		int n = sc.nextInt();
		int i = 1;
		do{
			i *= n;
			
			n--;
		}
		while(n>0);
		System.out.println(i);
	}

}
