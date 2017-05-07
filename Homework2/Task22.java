import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля Въведете число от 1 до 999");
		int n = sc.nextInt();
		int i = n;
		int p = 0;
		if(n>=1 && n<=999){
			while(p<10){
				if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
					p++;
					System.out.println(p+": "+i);
					
				}
				i++;
			}
		}
		else{
			System.out.println("Въведеното число не е в посоченият интервал");
		}
	}

}
