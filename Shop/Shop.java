import java.util.HashMap;
import java.util.Map.Entry;

public class Shop {
	
	private String name;
	private String address;
	private double money;
	private HashMap<Product, Double> produkti;
	
	public Shop(String name, String address, double money) {
		this.name = name;
		this.address = address;
		this.money = money;
		this.produkti = new HashMap<Product, Double>();
	}
	
	public void addProduct(Product produkt){
		this.produkti.put(produkt, produkt.getNalichnost());
	}
	
	public double sell(HashMap<Product, Double> kolichka){
		double totalSum = 0;
		double sum = 0;
		double kol = 0;
		for (Entry<Product, Double> e : kolichka.entrySet()) {
			if(e.getValue() <= produkti.get(e.getKey())){
				sum = e.getKey().getPrice()*kol;
				totalSum += sum;
				e.getKey().sell(e.getValue());
			}
			else{
				System.out.println("Няма достатъчна наличност от " + e.getKey().getName());
			}
		}
		money += totalSum;
		return totalSum;
	}
}
