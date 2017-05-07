import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Програмата изчислява най-оптималния начин на пълнене на съд с кофи от по 2 и 3 литра");
		
		System.out.println("Въведете обем на съда(от 10 до 9999 литра)");
		Scanner sc = new Scanner(System.in);
		int volume = sc.nextInt();
		
		if (volume>=10 && volume<=9999) {
			
			int kofi = volume / 5;
			int kofi2 = kofi;
			int kofi3 = kofi;
			int ostatyk = volume % 5;
			if (ostatyk==1) {
				kofi2 = kofi2-1;
				kofi3 = kofi3+1;
				System.out.println("Съдът ще се напълни с "+kofi2+" кофи вода от по 2 литра и "+kofi3+" кофи от 3 литра");
			}
			else {
				if(ostatyk==2){
					kofi2=kofi2+1;
					System.out.println("Съдът ще се напълни с "+kofi2+" кофи вода от по 2 литра и "+kofi3+" кофи от 3 литра");		
				}
				else {
					if (ostatyk==3){ 
					kofi3=kofi3+1;
					System.out.println("Съдът ще се напълни с "+kofi2+" кофи вода от по 2 литра и "+kofi3+" кофи от 3 литра");		
					}
					else {
						if (ostatyk==4) {
							kofi2=kofi2+2;
							System.out.println("Съдът ще се напълни с "+kofi2+" кофи вода от по 2 литра и "+kofi3+" кофи от 3 литра");
						}
						else {
						System.out.println("Съдът ще се напълни с "+kofi2+" кофи вода от по 2 литра и "+kofi3+" кофи от 3 литра");		
						}
						}
					}
			}
		}
		else {
			System.out.println("Въведеното число не е в посоченият интервал");
		}
	}

}
