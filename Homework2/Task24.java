import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля Въведете число N в интервала от 10 до 30000");
		int n = sc.nextInt();
		if(n>=10 && n<=30000){
			int mirror = 0;
			int temp = n;
			do{
				mirror*=10;
				mirror+=temp%10;
				temp/=10;
			}
			
			while(temp>0);
			if(mirror == n){
				System.out.println("Числото е палиндром");
			}
			else
				System.out.println("Числото не е палиндром");
			
		}
		else
			System.out.println("Въведеното число не е в посоченият интервал");
	}

}
