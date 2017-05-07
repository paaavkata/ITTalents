
public class Student {
	public String name;
	public String subject;
	public double grade = 4.0;
	public int yearInCollege = 1;
	public int age;
	private boolean isDegree = false;
	public double money = 0;
	
	Student(){

	}
	
	Student(String name, String subject, int age){
		new Student();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	public void upYear(){
		if(!isDegree && this.yearInCollege <= 3){
			yearInCollege++;
			System.out.println("��������� " + this.name + " ��������� � " + this.yearInCollege + " ����.");
		}
		else{
			System.out.println("��������� � ��������.");
			isDegree = true;
		}
	}
	
	public double receiveScholarship(double min, double amount){
		if(this.grade >= min && this.age < 30){
			this.money += amount;
			System.out.println(this.name + " ��� " + amount + " ��. ��������� �� ���� �����.");
			return this.money;
			
		}
		else{
			System.out.println(this.name + " ���� ���������� ����� ���� �����.");
			return this.money;
		}
	}
}
