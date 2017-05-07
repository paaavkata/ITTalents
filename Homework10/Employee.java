
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
				System.out.println("Работникът " + this.getName() + " започна да работи върху задачата: " + getCurrentTask().getName());
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
		System.out.println("Работникът " + this.name + " днес е работил върху задачата " + this.currentTask.getName() + ".");
		if(this.currentTask.getWorkingHours() == 0){
			System.out.println("Задачата е завършена.");
		}
		else{
			System.out.println("За завършването на задачата са необходими още " + this.currentTask.getWorkingHours() + " часа.");
		}
		
		System.out.println("От работното време на работника остават " + this.getHoursLeft() + " часа");
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
