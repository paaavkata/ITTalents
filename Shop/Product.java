
public class Product {
	
	private String name;
	private double price;
	private double nalichnost;
	
	public Product(String name, double price, double nalichnost) {
		this.name = name;
		this.price = price;
		this.nalichnost = nalichnost;
	}

	public double getPrice() {
		return price;
	}

	public double getNalichnost() {
		return nalichnost;
	}
	
	public void sell (double kolichestvo){
		this.nalichnost -= kolichestvo;
	}

	public String getName() {
		return name;
	}
	
	
}
