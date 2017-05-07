import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {
		int p=1;
		while(p<10){
			int i = p;
			while(i<10){
				System.out.print(p+"*"+i+"; ");
				i++;
			}
			p++;
			System.out.println();
		}
		
	}	
}
