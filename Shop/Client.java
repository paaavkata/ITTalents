import java.util.HashMap;

public class Client {
	
	private Shop magazin;
	private double cash;
	private int max;
	private HashMap<Product, Double> kolichka;

	public Client(double cash, int max) {
		this.cash = cash;
		this.max = max;
		kolichka = new HashMap<Product, Double>();
	}
	
	public void enterShop(Shop magazin){
		this.magazin = magazin;
	}
	
	public void pay(){
		double zaplateno = this.magazin.sell(this.kolichka);
		this.cash -= zaplateno;
		System.out.println("Клиентът е заплатил " + zaplateno + " лв. на магазина.");
	}
	
	public void addToCart(Product produkt, double kolichestvo){
		if(this.max > 0){	
			if(!kolichka.containsKey(produkt)){
				kolichka.put(produkt, kolichestvo);
			}
			else{
				double kol = kolichka.get(produkt) + kolichestvo;
				kolichka.put(produkt, kol);
				this.max--;
			}
		}
		else{
			System.out.println("Клиентът няма повече място за покупки");
		}
	}
	
	public void removeFromCart(Product produkt, double kolichestvo){
		double kol = kolichka.get(produkt) - kolichestvo;
		if(kol == 0){
			kolichka.remove(produkt);
			this.max++;
		}
		else{
			kolichka.put(produkt, kol);
		}
	}
}
