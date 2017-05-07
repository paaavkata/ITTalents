
public class Demo {
	
	public static void main(String[] args) {
		
		Shop magazin = new Shop("Рекорд", "Иван Странски", 10000);
		
		Product meso = new Product("Месо", 10.89, 15.6);
		Product sirene = new Product("Сирене", 14.89, 8.6);
		Product riba = new Product("Риба", 17.89, 5.5);
		
		Product bira = new Product("Бира", 2.89, 20);
		Product kniga = new Product("Книга", 17.89, 4);
		Product stol = new Product("Стол", 45.89, 10);
		
		magazin.addProduct(meso);
		magazin.addProduct(sirene);
		magazin.addProduct(riba);
		magazin.addProduct(bira);
		magazin.addProduct(kniga);
		magazin.addProduct(stol);
		
		Client pesho = new Client(230, 13);
		Client gosho = new Client(85, 10);
		Client misho = new Client(50, 15);
		Client grisho = new Client(400, 20);
		
		pesho.enterShop(magazin);
		gosho.enterShop(magazin);
		misho.enterShop(magazin);
		grisho.enterShop(magazin);
				
		pesho.addToCart(meso, 1.5);
		pesho.addToCart(sirene, 0.5);
		pesho.addToCart(riba, 0.8);
		pesho.addToCart(bira, 3);
		pesho.addToCart(kniga, 1);
		pesho.addToCart(stol, 2);
		
		gosho.addToCart(meso, 1.1);
		gosho.addToCart(sirene, 1.5);
		gosho.addToCart(riba, 0.4);
		gosho.addToCart(bira, 2);
		gosho.addToCart(kniga, 2);
		gosho.addToCart(stol, 1);
		
		misho.addToCart(meso, 0.5);
		misho.addToCart(sirene, 0.8);
		misho.addToCart(riba, 0.4);
		misho.addToCart(bira, 5);
		misho.addToCart(kniga, 3);
		misho.addToCart(stol, 3);
		
		grisho.addToCart(meso, 10);
		grisho.addToCart(sirene, 2);
		grisho.addToCart(riba, 3);
		grisho.addToCart(bira, 10);
		grisho.addToCart(kniga, 5);
		grisho.addToCart(stol, 10);
		
		pesho.pay();
		gosho.pay();
		misho.pay();
		grisho.pay();
		
		
	}
}
