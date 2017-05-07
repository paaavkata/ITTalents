import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Моля въведете число N");
		int n = sc.nextInt();
		
		System.out.println("Моля въведете число M");
		int m = sc.nextInt();
				
		if(n<1 && n>9 || m<1 && m>9){
			System.out.println("Въведеното число е извън посоченият интервал");
		}
		else{
			for(int i=1; i<=n; i++){
				for(int j=1; j<=m; j++){
					int p=i*j;
					System.out.println(i+"*"+j+"="+p);
				}
			}
		}
	}

}
