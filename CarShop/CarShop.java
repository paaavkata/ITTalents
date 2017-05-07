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
					System.out.println("����������� " + car.getName() + " � ������� � �������� �� ������� " + (i+1));
					break;
				}
			}
			return true;
		}
		else{
			System.out.println("���� ������ �������� �����.");
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
			System.out.println("�������� � ������. ���� ��������� �� ����������");
			return false;
		}
		else{
			showroom[currentCar] = null;
			return true;
		}
	}
	
	public void showAllCarsInTheShop(){
		for (int i = 0; i < showroom.length; i++) {
			System.out.println("�����: " + showroom[i].getName());
			System.out.println("������ �� ������������: " + showroom[i].getYear());
			System.out.println("�������: " + showroom[i].getPower());
			System.out.println("����: " + showroom[i].getPrice());
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
