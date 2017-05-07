import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете трицифрено число");
		int number = sc.nextInt();
		
		int temp3 = number % 10;
		int temp2 = number / 10;
		temp2 = temp2 % 10;
		int temp1 = number / 100;
		
		if(number>=100 && number<1000){
			
			if(temp1 == temp2 && temp2 == temp3){
				System.out.println(temp1+"="+temp2+"="+temp3+" Цифрите са равни");
			}
			
				else if(temp1 > temp2 && temp2 > temp3){
					System.out.println(temp1+">"+temp2+">"+temp3+" Цифрите са във възходящ ред");
				}
			
				else if(temp1 < temp2 && temp2 < temp3){
					System.out.println(temp1+"<"+temp2+"<"+temp3+" Цифрите са в низходящ ред");
				}
			
			else{
				System.out.println("Цифрите са ненаредени");
			}
		}
		else{
			System.out.println("Въведеното число не е трицифрено");
		}
	}

}
