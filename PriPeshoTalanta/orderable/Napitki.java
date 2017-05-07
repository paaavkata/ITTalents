package orderable;

public abstract class Napitki {
	private String name;
	private int cena;
	
	public Napitki(String name, int price) {
		this.name = name;
		this.cena = price;
	}

	public int getCena() {
		return cena;
	}
	public void printInfo(){
		System.out.println("Напитка " + this.name +  ", цена " + this.cena);
	}
	
}
