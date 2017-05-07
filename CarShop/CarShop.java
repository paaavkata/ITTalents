package CarShop;

public class CarShop {
	Person buyer = new Person();
	Car[] showroom;
	private int freePlaces;
	private int currentCar;
	private String name;
	private double moneyInTheBank;
	CarShop(int capacity){
		showroom = new Car[capacity];
		freePlaces = capacity;
	}
	
	public int getCurrentCar() {
		return currentCar;
	}
	
	public void addMoney(double income){
		this.moneyInTheBank += income;
	}
	
	public boolean addCar(Car car){
		if(freePlaces > 0){
			for (int i = 0; i < showroom.length; i++) {
				if(showroom[i] == null){
					showroom[i] = car;
					freePlaces--;
					System.out.println("Автомобилът " + car.getName() + " е добавен в магазина на позиция " + (i+1));
					break;
				}
			}
			return true;
		}
		else{
			System.out.println("Няма повече свободни места.");
			return false;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
	}
	
	public Car getNextCar(){
		return showroom[currentCar+1]; 
	}
	
	public void sellNextCar(Person buyer){
		buyer.buyCar(getNextCar());
		addMoney(getNextCar().getPrice());
		removeCar(getNextCar());
	}
	
	public boolean removeCar(Car car){
		if(showroom[currentCar] == null){
			System.out.println("Клетката е празна. Няма автомобил за премахване");
			return false;
		}
		else{
			showroom[currentCar] = null;
			return true;
		}
	}
	
	public void showAllCarsInTheShop(){
		for (int i = 0; i < showroom.length; i++) {
			System.out.println("Марка: " + showroom[i].getName());
			System.out.println("Година на производство: " + showroom[i].getYear());
			System.out.println("Мощност: " + showroom[i].getPower());
			System.out.println("Цена: " + showroom[i].getPrice());
			System.out.println();
		}
	}
	
	public void showFreeCells(){
		for(int i = 0; i < showroom.length; i++) {
			System.out.print(i+1 + "|");
		}
		System.out.println();
		for(int i = 0; i < showroom.length; i++) {
			if(i < 9){
				System.out.print((showroom[i] == null ? 0 : 1) + "|");
			}
			else{
				System.out.print((showroom[i] == null ? 0 : 1) + " |");
			}
		}
		System.out.println();
	}
}
