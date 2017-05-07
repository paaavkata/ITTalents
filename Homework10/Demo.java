
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllWork tasks = new AllWork();
		int days = 0;
		Task task1 = new Task("Чистене на снега", 14);
		Task task2 = new Task("Разбиване на леда", 11);
		Task task3 = new Task("Копиране на документи", 6);
		Task task4 = new Task("Събиране на отпадъци", 3);
		Task task5 = new Task("Чистене на пода", 2);
		Task task6 = new Task("Разговори с клиенти", 17);
		Task task7 = new Task("Писане на документи", 5);
		Task task8 = new Task("Транспортиране на документи", 4);
		Task task9 = new Task("Ремонт на служебния автомобил", 7);
		Task task10 = new Task("Осчетоводяване на фактури", 2);
		Task task11 = new Task("Разработване на приложение", 20);
		Task task12 = new Task("Правене на кафе", 1);
		
		tasks.addTask(task1);
		tasks.addTask(task2);
		tasks.addTask(task3);
		tasks.addTask(task4);
		tasks.addTask(task5);
		tasks.addTask(task6);
		tasks.addTask(task7);
		tasks.addTask(task8);
		tasks.addTask(task9);
		tasks.addTask(task10);
		tasks.addTask(task11);
		tasks.addTask(task12);
		
		Employee[] workers = new Employee[4];
		workers[0] = new Employee("Иван");
		workers[1] = new Employee("Драган");
		workers[2] = new Employee("Петкан");
		workers[3] = new Employee("Балкан");
		
		for (int i = 0; i < workers.length; i++) {
			workers[i].setAllWork(tasks);
		}
		
		while(!tasks.isAllWorkDone()){
			if(workers[0].getHoursLeft() == 0 && workers[1].getHoursLeft() == 0 && workers[2].getHoursLeft() == 0 && workers[3].getHoursLeft() == 0){
				System.out.println("Започва нов ден.");
				days++;
				for (int i = 0; i < workers.length; i++) {
					workers[i].startWorkingDay();
				}
			}
			for (int j = 0; j < workers.length; j++) {
				if(workers[j].getHoursLeft() > 0){
					workers[j].work();
				}
				
			}
		}
		System.out.println("Всичката работа е свършена от работниците за " + days + " дни.");
	}

}
