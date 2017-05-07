package Homework2;

public class Task {
	
	public String name;
	public int workingHours;
	
	Task(){
		
	}
	
	Task(String name, int hours){
		this.name = name;
		this.workingHours = hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	
	
	
}
