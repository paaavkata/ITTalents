public class Task {
	
	private String name;
	private int workingHours;
	

	
	Task(String name, int workingHours) {
		this.name = name;
		this.setWorkingHours(workingHours);
	}
	
	public String getName() {
		return name;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if(workingHours < 0){
			System.out.println("Въведената стойност за време е невалидна");
		}
		else{
			this.workingHours = workingHours;
		}
		
	}
	
	
	
}
