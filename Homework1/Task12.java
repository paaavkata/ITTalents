import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Въведете ден");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		System.out.println("Въведете месец");
		int month = sc.nextInt();
		System.out.println("Въведете година");
		int year = sc.nextInt();
		
		boolean visokosna = (year %4 == 0 && year % 100 !=0) || (year % 400 == 0);
		System.out.println(visokosna);		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 	10 || month == 12){
			if (day == 31 && month == 12){
				day=1;
				year++;
				month=1;
			}
			else{
				if(day == 31 && month != 12){
					day=1;
					month++;
				}
				else {
					day++;
				}
			}
		
			
			
		}
		else if(month == 2){
			if(visokosna == true && day == 29){
				day=1;
				month++;
			}
			else if(visokosna == true && day == 28){
				day++;
			}
			else if(day == 28){
				day=1;
				month++;
			}
			else {
				day++;
			}
				
		}
		else {
			if(day == 30){
				day=1;
				month++;
			}
			else {
				day++;
			}
			
		}
		System.out.println("Следващият ден е: "+day+"."+month+"."+year);	
		
	}

}
