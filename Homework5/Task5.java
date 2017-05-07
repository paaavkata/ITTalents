import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете първа дума");
		String text1 = sc.next();
		
		System.out.println("Въведете втора дума");
		String text2 = sc.next();
	
		int index1 = -1;
		int index2 = -1;
				
		for(int i = 0; i < text1.length(); i++) {
			if(index1 != -1){
				break;
			}
			for (int j = 0; j < text2.length(); j++) {
				if(index1 != -1){
					break;
				}
				if(text1.charAt(i) == text2.charAt(j)){
					index1 = i;
					index2 = j;
					break;
				}
			}
		}

		if(index1 == -1 && index2 == -1){
			System.out.println("Във въведените думи няма общи символи");
		}
		else{
			for (int i = 0; i < text1.length(); i++) {
				if(i != index1){
					for (int j = 0; j <= index2; j++) {
						if(j != index2){
							System.out.print(" ");
						}
						else{
							System.out.print(text1.charAt(i));
						}
					
					}
					System.out.println("");
				}
				else{
					System.out.println(text2);
				
				}
			}
		
		}
	}
}

