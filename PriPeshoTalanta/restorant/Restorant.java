package restorant;

import java.util.ArrayList;

import klienti.Klient;
import orderable.AlcoholicDrink;
import orderable.Desert;
import orderable.Hrani;
import orderable.Meal;
import orderable.Napitki;
import orderable.NonAlcoholicDrink;
import orderable.Salad;

public class Restorant {
	private String name;
	private String address;
	private int money;
	private Menu menu;
	private ArrayList<Hrani> qstiq;
	private ArrayList<Napitki> napitki;
	private ArrayList<Servitior> servitiori;
	private ArrayList<Klient> klienti;
	private ArrayList<Order> poruchki;
	private int servitioriCount;
	private int napitkiCount;
	private int qstiqCount;
	public Restorant(String name, String address, int money, int servitiori, int qstiq, int napitki) {
		this.name = name;
		this.address = address;
		this.money = money;
		this.qstiqCount = qstiq;
		this.napitkiCount = napitki;
		this.servitioriCount = servitiori;
		this.menu = new Menu();
		this.qstiq = new ArrayList<Hrani>();
		this.napitki = new ArrayList<Napitki>();
		this.servitiori = new ArrayList<Servitior>();
		this.klienti = new ArrayList<Klient>();
		this.poruchki = new ArrayList<Order>();
		generateMenu(qstiq, napitki);
		generateWaiters(servitiori);
	}
	
	public void generateMenu(int hrani, int napitki){
		this.menu = menu.generateMenu(hrani, napitki);
		this.qstiq.addAll(this.menu.getHrani());
		this.napitki.addAll(this.menu.getNapitki());
	}

	public void generateWaiters(int number){
		servitiori.add(new Servitior("Гарсон"));
		servitiori.add(new Servitior("Фарсон"));
		servitiori.add(new Servitior("Марсон"));
		servitiori.add(new Servitior("Дюксон"));
		servitiori.add(new Servitior("ЛюкБесон"));
		
	}

	public ArrayList<Hrani> getQstiq() {
		return qstiq;
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

	public void addPoruchka(Order poruchka) {
		poruchki.add(poruchka);
	}
	public void removePoruchka(Order poruchka) {
		this.money += poruchka.getSum();
		poruchki.remove(poruchka);
	}

	public ArrayList<Servitior> getServitiori() {
		return servitiori;
	}

	public ArrayList<Napitki> getNapitki() {
		return napitki;
	}
	public void addMoney(int money){
		this.money += money;
	}
	public void addKlienti(ArrayList<Klient> klienti){
		this.klienti.addAll(klienti);
	}
	public ArrayList<Klient> getKlienti(){
		return this.klienti;
	}
	public Servitior bestWaiter(){
		int index = 0;
		for(int i = 0; i < this.servitiori.size(); i++){
			if(this.servitiori.get(i).getTips() < this.servitiori.get(i+1).getTips()){
				index = i;
			}
		}
		return this.servitiori.get(index);
	}

	public void printRest(){
		int salads = 0;
		int meals = 0;
		int deserts = 0;
		int alc = 0;
		int nonalc = 0;
		for (int i = 0; i < qstiq.size(); i++) {
			if(qstiq.get(i) instanceof Salad){
				salads++;
				continue;
			}
			if(qstiq.get(i) instanceof Meal){
				meals++;
				continue;
			}
			if(qstiq.get(i) instanceof Desert){
				deserts++;
			}
		}
		for (int i = 0; i < napitki.size(); i++) {
			if(napitki.get(i) instanceof AlcoholicDrink){
				alc++;
				continue;
			}
			if(napitki.get(i) instanceof NonAlcoholicDrink){
				nonalc++;
			}
			
		}
		System.out.println("Ястия:");
		System.out.println("	Супа - " + salads + " порции;");
		System.out.println("	Десерт - " + deserts + " порции;");
		System.out.println("	Основно - " + meals + " порции;");
		System.out.println("Напитки:");
		System.out.println("	Алкохол - " + alc + " напитки;");
		System.out.println("	Безалкохолно - " + nonalc + " напитки;");
	}
}
