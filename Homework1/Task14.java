import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Моля въведете координати на шахматна дъска:");
		
		System.out.println("Фигура 1 - позиция X:");
		int a1 = sc.nextInt();
		
		System.out.println("Фигура 1 - позиция Y:");
		int a2 = sc.nextInt();
				
		System.out.println("Фигура 2 - позиция X:");
		int b1 = sc.nextInt();
		
		System.out.println("Фигура 2 - позиция Y:");
		int b2 = sc.nextInt();
		
		boolean isablack = true;
		boolean isbblack = true;
		if (a1 <= 8 && a1 >= 1 && a2 <= 8 && a2 >= 1 && b1 <= 8 && b1 >= 1 && b2 >= 1 && b2 <= 8){
			if((a1 % 2 == 0 && a2 % 2 != 0) || (a1 % 2 != 0 && a2 % 2 ==0)){
				isablack = false;
			}
			if((b1 % 2 == 0 && b2 % 2 !=0) || (b1 % 2 != 0 && b2 % 2 ==0)){
				isbblack = false;
			}
			if(isablack == true && isbblack == true){
				System.out.println("фигурите са на черни квадратчета");
			}
			else if(isablack == false && isbblack == false){
				System.out.println("Фигурите са на бели квадратчета");
			}
			else{
				System.out.println("Фигурите са на различни квадратчета");
			}
		}
		else{
				System.out.println("Въведените позиции не са в интервала от 1 до 8");
		}
	}
	
}
