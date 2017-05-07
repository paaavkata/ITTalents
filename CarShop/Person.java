package CarShop;

public class Person {
	
	private Car myCar = new Car("",0,0,0);
	private double moneyInTheBank;
	public void buyCar(Car car){
		this.myCar = car;
		this.moneyInTheBank -= car.getPrice();
	}
	
	public void sellCar(Car car, double price, Person buyer, CarShop dealer){
		if(buyer == null){
			dealer.addCar(car);
			System.out.println("Автомобилът е продаден на " + dealer.getName());
		}
		buyer.myCar = this.myCar;
		this.myCar = null;
	}
	
	public void barter(Car bought, Car selled, double price, Person buyer, CarShop dealer){
		sellCar(selled, price, buyer, dealer);
		dealer.sellNextCar(buyer);
		dealer.addMoney(-price);
		dealer.addCar(selled);
		
	}

	public Car getMyCar() {
		return myCar;
	}
	
}
