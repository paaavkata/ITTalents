
public class Employee extends Person{
	
	private double daySalary;
	
	
	Employee(int age, String name, boolean isMale, double salary) {
		super(age, name, isMale);
		setDaySalary(salary);
		// TODO Auto-generated constructor stub
	}
	
	double calculateOvertime(double hours){
		if(super.getAge() >= 18){
			return (hours*getDaySalary()*1.5/8);
		}
		else{
			return 0;
		}
	}
	void showEmployeeInfo(){
		super.showPersonInfo();
		System.out.print(", дневна заплата: " + getDaySalary());

	}
	public double getDaySalary() {
		return daySalary;
	}
	public void setDaySalary(double daySalary) {
		this.daySalary = daySalary;
	}

}
