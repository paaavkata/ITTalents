import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Програмата сравнява 2 по 2 числата от четирицифрено произволно въведено число");
		
		System.out.println("Въведете число между 1000 и 9999");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int temp1;
		int temp2;
		int temp3;
		int temp4;
		
		if (number>=1000 && number<=9999) {
			temp1 = number % 10;
			temp2 = number % 100;
			temp3 = number % 1000;
			temp2 = temp2 / 10;
			temp3 = temp3 / 100;
			temp4 = number / 1000;
			temp4 = temp4*10 + temp1;
			temp3 = temp3*10 + temp2;
			
			if (temp4==temp3) {
				System.out.println(temp4+" = "+temp3);
			}
			else {
				if(temp4>temp3) {
				System.out.println(temp4+" > "+temp3);
				}
				else {
					System.out.println(temp4+" < "+temp3);
				}
			}			
			
		}
		else {
			System.out.println("Числото не е в посочният интервал");
		}
		
	}

}
