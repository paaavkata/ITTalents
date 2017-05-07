
public class Employee {
	
	private String name;
	public Task currentTask;
	private int hoursLeft;
	AllWork allWork ;
	public Employee(String name){
		this.name = name;
	}

	public String getName() {
		return name;
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

		this.hoursLeft = hoursLeft;

	}
	
	public void work(){
		if(currentTask == null){
			if(allWork.getCurrentUnassignedTask() < allWork.tasks.length){
				setCurrentTask(allWork.getNextTask());
				System.out.println("���������� " + this.getName() + " ������� �� ������ ����� ��������: " + getCurrentTask().getName());
			}
			else{
				return;
			}
		}

		if(this.hoursLeft >= this.currentTask.getWorkingHours()){
			this.hoursLeft -= this.currentTask.getWorkingHours();
			this.currentTask.setWorkingHours(0);
			this.currentTask = null;
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
	public void startWorkingDay(){
		this.setHoursLeft(8);
	}

	public AllWork getAllWork() {
		return allWork;
	}

	public void setAllWork(AllWork allWork) {
		this.allWork = allWork;
	}
	
}
