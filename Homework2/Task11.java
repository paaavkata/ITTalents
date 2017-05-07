import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int space = a-1;
		int star = 1;
		for (int i=1; i<=a; i++){
			for (int j=1; j<=space; j++){
				System.out.print(" ");
			}
			for (int p=1; p<=star; p++){
				System.out.print("*");
			}
			space--;
			star+=2;
			System.out.println(); //new line
		}
		
	}

}
