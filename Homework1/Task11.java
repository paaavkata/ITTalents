import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Програмата проверява дали произволно въведено число се дели на всяка от неговите цифри");
		
		System.out.println("Въведете цяло число в интервала от 111 до 999, което не съдържа 0");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int temp1 = number % 10;
		int temp2 = number % 100;
		temp2 = temp2 / 10;
		int temp3 = number / 100;
		
		if (number<110 || number>999 || temp1==0 || temp2==0 || temp3==0) {
			System.out.println("В числото се съдържа цифрата 0 или не е в посоченият интервал");
		}
		else {
			if (number % temp1 ==0 && number % temp2 == 0 || number % temp3 ==0) { 
				System.out.println("Числото "+number+" се дели на всяка своя цифра");
			}
			else {
				System.out.println("Числото "+number+" не се дели на всяка своя цифра");
			}
		}
	}

}
