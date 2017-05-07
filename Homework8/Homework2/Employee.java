package Homework2;

public class Employee {
	
	private String name;
	public Task currentTask = new Task();
	private int hoursLeft;
	
	public Employee(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
		else{
			System.out.println("��������� �������� ���.");
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		
		if(hoursLeft > 0){
			this.hoursLeft = hoursLeft;
		}
		else{
			System.out.println("��������� ������� ���.");
		}
	}
	
	public void work(){
		if(this.hoursLeft >= this.currentTask.workingHours){
			this.hoursLeft -= this.currentTask.workingHours;
			this.currentTask.setWorkingHours(0);
			
		}
		else{
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours()-this.getHoursLeft()); 
			this.setHoursLeft(0);
		}
	}
	
	public void showReport(){
		System.out.println("���������� " + this.name + " ���� � ������� ����� �������� " + this.currentTask.getName() + ".");
		if(this.currentTask.getWorkingHours() == 0){
			System.out.println("�������� � ���������.");
		}
		else{
			System.out.println("�� ������������ �� �������� �� ���������� ��� " + this.currentTask.getWorkingHours() + " ����.");
		}
		
		System.out.println("�� ��������� ����� �� ��������� ������� " + this.getHoursLeft() + " ����");
	}
			
}
