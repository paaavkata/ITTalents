import java.util.Scanner;

public class Task7 {
public static void main(String[] args) {
System.out.println("Програмата размества стойностите на три произволно въведени числа");
	
	System.out.println("Въведете час");
	Scanner sc = new Scanner(System.in);
	int hour = sc.nextInt();
	
	System.out.println("Въведете сума пари");
	double money = sc.nextDouble();
	
	System.out.println("Въведете здравословно състояние(true-здрав, false-болен)");
	boolean condition = sc.nextBoolean();
	
	if (hour>0 && hour<24) {
	
	if (condition==false) {
		if (money>0) {
			if (hour>=8 && hour <=20) {
				System.out.println("Няма да излизам, защото съм болен, но ще отида да си купя лекарства");
			}
			else {
				System.out.println("Няма да излизам, защото съм болен и няма да отида си купя лекарства, защото аптеката е затворена за деня");
			}
		}
		else {
			System.out.println("Няма да излизам, защото съм болен. Ще пия чай, защото нямам пари за лекарства.");
		}
	}
	else {
		if (hour>=10 && hour<=22) {
			if (money>10){ 
			System.out.println("Ще отида на кино с приятели, защото имам пари и съм здрав.");
			}
			else {
				System.out.println("Ще отида на кафе, защото нямам достатъчно пари за кино");
			}
		}
		else {
			System.out.println("Здрав съм, но няма да ходя никъде, защото всичко е затворено за деня");
		}
	}
	}
	else {
		System.out.println("Въведеният час не е между 0 и 24 часа");
	}
		
}
}
