import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете низ от символи");
		
		String text = sc.nextLine();
		
		int numbers = 0;
		int sum = 0;
		int index = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i) >= 45 || text.charAt(i) <= 57){
				if(text.charAt(i) == 45 && text.charAt(i+1) >= 49){
					numbers = text.charAt(i)+text.charAt(i+1);
					while ((int)text.charAt(i+2) >= 49 && (int)text.charAt(i+2) <= 57){
							
							numbers += text.charAt(i+2);
							
							sum += numbers;
					}
					System.out.println(numbers);
				}
			}
		}
	}
}

