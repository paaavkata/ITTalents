import java.util.Scanner;

public class Task7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете думите разделени с интервал");
		String text = sc.nextLine();
		String words[] = text.split(" ");
	
		int broi = words.length;
		int longest = words[0].length();
		for (int i = 1; i < words.length; i++) {
			if(words[i].length() > longest){
				longest = words[i].length();
			}
		}
		System.out.println(broi + " думи, най-дългата от които е с " + longest + " символа.");
	
	}
	
}
