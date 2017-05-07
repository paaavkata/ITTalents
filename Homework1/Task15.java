import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете час в интервала от 0 до 24");
		int hour = sc.nextInt();
		
		if(hour >= 0 && hour <= 24){
			if (hour >=4 && hour <= 9){
				System.out.println("Добро утро");
			}
			else if(hour > 9 && hour <= 18){
				System.out.println("Добър ден");
			}
			else {
				System.out.println("Добър вечер");
			}
		}
		else {
			System.out.println("Въведеното число не е в посоченият интервал");
		}
	}

}
