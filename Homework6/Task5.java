import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете число за проверка");
		int a = scan.nextInt();
		while(a < 1){
			System.out.println("Числото е отрицателно или 0. Опитай отново");
			a = scan.nextInt();
		}
		String b = Integer.toString(a);
		if(palindrome(b)){
			System.out.println(b + " - числото е палиндром");
		}
		else{
			
			String c = new StringBuilder(b).reverse().toString();
		
			System.out.println(c + " - числото не е палиндром");
		}
		
		
	}
	
	public static boolean palindrome(String a){
		if(a.length() == 1){
			return true;
		}
		if(a.charAt(0) == a.charAt(a.length()-1)){
			return palindrome(a.substring(1, a.length()-1));
		}
		return false;
	}
}
