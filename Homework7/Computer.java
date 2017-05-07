
public class Computer {
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	double freeMemory;
	String operationSystem;
	String name;
	void changeOperationSystem(String newOperationSystem){
		operationSystem = newOperationSystem;
	}
	
	void useMemory(double memory){
		if(freeMemory > memory){
			freeMemory -= memory;
		}
		else{
			System.out.println("Not enough free memory!");
		}
	}
}
