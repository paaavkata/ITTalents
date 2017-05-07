
public class AllWork {

	Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	
	AllWork(){
		tasks = new Task[12];
		freePlacesForTasks = 12;
		currentUnassignedTask = 0;
	}
	
	void addTask(Task newTask){
		if(freePlacesForTasks > 0){
				tasks[--freePlacesForTasks] = newTask;
		}
	}
	
	boolean isAllWorkDone(){
	
		for (Task task : tasks) {
			if(task.getWorkingHours() != 0){
				return false;
			}
		}
		return true;
	
	}
	
	Task getNextTask(){
		if(this.currentUnassignedTask >= tasks.length){
			return null;
		}
		return this.tasks[currentUnassignedTask++];
	}

	public int getFreePlacesForTasks() {
		return this.freePlacesForTasks;
	}

	public void setFreePlacesForTasks(int freePlacesForTasks) {
		this.freePlacesForTasks = freePlacesForTasks;
	}

	public int getCurrentUnassignedTask() {
		return currentUnassignedTask;
	}

	public void setCurrentUnassignedTask(int currentUnassignedTask) {
		this.currentUnassignedTask = currentUnassignedTask;
	}
	

}
