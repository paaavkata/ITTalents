import java.util.Scanner;

public class Task8 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Въведете низ от символи");
	String text = sc.nextLine();
	
	int j = text.length()-1;
	
	boolean mirror = true;
	
	for (int i = 0; i < text.length()/2; i++) {
		if(text.charAt(i) != text.charAt(j)){
			mirror = false;
			break;
		}
		j--;
	}
	System.out.println(mirror ? "Низът е палиндром" : "Низът не е палиндром");
	}
}
