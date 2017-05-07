import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Моля въведете температура в целзии в интервала от -100 до +100 градуса");
		int temp = sc.nextInt();
		
		if(temp>=-100 && temp<=100){
			if(temp<=-20){
				System.out.println("Ледено студено");
			}
			else{
				if(temp<=0){
					System.out.println("Студено");
				}
				else{
					if(temp<=15){
						System.out.println("Хладно");
					}
					else{
						if(temp<=25){
							System.out.println("Топло");
						}
						else{ 
							System.out.println("Горещо");
						}
					}
				}
			}
		}
		else{
			System.out.println("Въведеното число не е в посоченият интервал!");
		}
	}

}
