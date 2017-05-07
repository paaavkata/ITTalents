
public class Computer {
	public int year;
	public double price;
	public boolean isNotebook;
	public int hardDiskMemory;
	public double freeMemory;
	public String operationSystem;
	public String name;
	
	public void changeOperationSystem(String newOperationSystem){
		operationSystem = newOperationSystem;
	}
	
	public void useMemory(double memory){
		if(freeMemory > memory){
			freeMemory -= memory;
		}
		else{
			System.out.println("Not enough free memory!");
		}
	}
	
	Computer(){
		isNotebook = false;
		operationSystem = "WinXP";
	}
	Computer(int year, double price, int hardDiskMemory, double freeMemory){
		new Computer();
		if(year > 1930 && year < 2017){
			this.year = year;
		}
		else{
			System.out.println("Wrong year!");
		}

		if(price > 0){
			this.price = price;
		}
		else{
			System.out.println("Wrong price!");
		}
		
		if(hardDiskMemory > 0){
			this.hardDiskMemory = hardDiskMemory;
		}
		else{
			System.out.println("Wrong number for memory!");
		}
	
		if(freeMemory > 0){
			this.freeMemory = freeMemory;
		}
		else{
			System.out.println("Wrong number for memory!");
		}
	}
	
	Computer(int year, double price, boolean isNotebook, int hardDiskMemory, double freeMemory, String operationSystem){
		if(year > 1930 && year <= 2017){
			this.year = year;
		}
		else{
			System.out.println("Wrong year!");
		}

		if(price > 0){
			this.price = price;
		}
		else{
			System.out.println("Wrong price!");
		}
		
		if(hardDiskMemory > 0){
			this.hardDiskMemory = hardDiskMemory;
		}
		else{
			System.out.println("Wrong number for memory!");
		}
	
		if(freeMemory > 0){
			this.freeMemory = freeMemory;
		}
		else{
			System.out.println("Wrong number for memory!");
		}
		this.isNotebook = isNotebook;
		if(operationSystem != null && !operationSystem.isEmpty()){
			this.operationSystem = operationSystem;
		}
		else{
			this.operationSystem = "MS-Dos";
		}
	}
	
	public int comparePrice(Computer compared){
		if(compared.price > this.price){
			return 1;
		}
		else if(compared.price == this.price){
			return 0;
		}
		else{
			return -1;
		}
		
	}
	
	public void compareConclusion(Computer compared){
		int number = comparePrice(compared);
		if(number == 1){
			System.out.println(this.name + " е по-евтин от " + compared.name);
		}
		if(number == 0){ 
			System.out.println(this.name + " е на същата цена като " + compared.name);
		}
		if(number == -1){
			System.out.println(this.name + " е по-скъп от " + compared.name);
		}
	}
}
