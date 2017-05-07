import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете число N в интервала от 10 до 99");
		int n = sc.nextInt();
		if(n>=10 || n<=99){
				
			for(int i=1; i<=99; i++)
				if(n==1){
					break;
				}
				else if(n%2 == 0){
					n *=0.5;
					System.out.print(n+" ");
				}
				else{
					n=n*3+1;
					System.out.print(n+" ");
				}
		}
	}

}
