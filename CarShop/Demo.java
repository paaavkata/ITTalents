package CarShop;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarShop elitcar = new CarShop(6);
		elitcar.showFreeCells();
		
		Person buyer = new Person();
		
		Car audi = new Car("audi", 2010, 300, 25.999);
		Car bmw = new Car("bmw", 2012, 280, 26.999);
		Car vw = new Car("vw", 2013, 170, 20.999);
		Car mercedes = new Car("mercedes", 2014, 330, 29.999);
		Car opel = new Car("opel", 2015, 150, 20.999);
		Car renault = new Car("renault", 2016, 100, 21.999);
		System.out.println(audi.getName());
		buyer.buyCar(bmw);
		
		elitcar.addCar(audi);
		elitcar.addCar(bmw);
		elitcar.addCar(opel);
		elitcar.addCar(renault);
		elitcar.addCar(mercedes);
		elitcar.addCar(vw);
		
		elitcar.showFreeCells();
		
		buyer.barter(audi, buyer.getMyCar(), 21.100, null, elitcar);
		
	}

}
