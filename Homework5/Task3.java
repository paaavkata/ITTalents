import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����� ����");
		String text1 = sc.next();
		
				
		System.out.println("�������� ����� ����");
		String text2 = sc.next();	
		
		int length = 0;
		int smaller = 0;
		
		if(text1.length() == text2.length()){
			
			System.out.println("����� ���� �� � ����� �������");
			System.out.println("������� �� �������");
			
			for (int i = 0; i < text1.length(); i++) {
				if(text1.charAt(i) != text2.charAt(i)){
					System.out.println(i+1 + " " + text1.charAt(i) + "-" + text2.charAt(i));
				}
			}
		}
		
		else{	
			
			System.out.println(text1.length() > text2.length() ? "������� ��� � ��-����� �� ������� �� ������" : "������� ��� � ��-����� �� ������� �� ������");
			System.out.println("������� �� �������");
			
			if(text2.length() < text1.length()){
				length = text1.length();
				smaller = text2.length();
			}
			
			else{
				length = text2.length();
				smaller = text1.length();
			}
			
			for (int i = 0; i < length; i++) {
				
				if(i < smaller && text1.charAt(i) != text2.charAt(i)){
					System.out.println(i+1 + " " + text1.charAt(i) + "-" + text2.charAt(i));
				}
				
				else if(i >= smaller){
					System.out.println((i+1) + " ���� ������");
				}
			}
		
		}
		
		
	}
}
