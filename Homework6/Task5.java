import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� ����� �� ��������");
		int a = scan.nextInt();
		while(a < 1){
			System.out.println("������� � ����������� ��� 0. ������ ������");
			a = scan.nextInt();
		}
		String b = Integer.toString(a);
		if(palindrome(b)){
			System.out.println(b + " - ������� � ���������");
		}
		else{
			
			String c = new StringBuilder(b).reverse().toString();
		
			System.out.println(c + " - ������� �� � ���������");
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
