package Homework2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee worker1 = new Employee("����� ���������");
		
		worker1.setHoursLeft(8);
		
		Task task1 = new Task("������ �� �����", 5);
		worker1.currentTask = task1;
		worker1.work();
		worker1.showReport();
		
		Task task2 = new Task("���������� �� ��������", 6);
		worker1.currentTask = task2;
		worker1.work();
		worker1.showReport();
		
		worker1.setHoursLeft(8); // new day
		worker1.work();
		worker1.showReport();
		
		
	}

}
