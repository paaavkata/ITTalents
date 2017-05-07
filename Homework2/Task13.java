import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете число");
		int j = sc.nextInt();
		for(int i=102; i<=987; i++){
			int temp1 = i % 10;
			int temp10 = i% 100;
			temp10 = temp10 / 10;
			int temp100 = i / 100;
			if(temp1+temp10+temp100==j){
				System.out.println(i);
					}
				}
			}
				
			
		
	

}
