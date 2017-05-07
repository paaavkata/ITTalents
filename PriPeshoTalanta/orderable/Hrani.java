package orderable;

public abstract class Hrani {
	private String name;
	private int gramaj;
	private int cena;
	
	public Hrani(String name, int gramaj, int cena) {
		this.name = name;
		this.gramaj = gramaj;
		this.cena = cena;
	}

	public int getCena() {
		return cena;
	}
	public void printInfo(){
		System.out.println("ястие " + this.name + ", грамаж: " + this.gramaj + ", цена " + this.cena);
	}
	
}
