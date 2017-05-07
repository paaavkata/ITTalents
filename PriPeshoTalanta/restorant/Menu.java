package restorant;

import java.util.ArrayList;
import java.util.Random;

import orderable.AlcoholicDrink;
import orderable.Desert;
import orderable.Hrani;
import orderable.Meal;
import orderable.Napitki;
import orderable.NonAlcoholicDrink;
import orderable.Salad;

public class Menu {
	private ArrayList<Hrani> hrani;
	private ArrayList<Napitki> napitki;
	private int salati = 0;
	private int qstiq = 0;
	private int deserti = 0;
	private int sokove = 0;
	private int alkoholi = 0;
	public Menu() {
		this.hrani = new ArrayList<Hrani>();
		this.napitki = new ArrayList<Napitki>();
	}
	public void addBeverageToMenu(Napitki beverage){
		napitki.add(beverage);
	}
	public void addMealToMenu(Hrani meal){
		hrani.add(meal);
	}
	public int sellBeverage(int index){
		return napitki.get(index).getCena();
		
	}
	public int sellMeal(int index){
		return hrani.get(index).getCena();
	}
	public Menu generateMenu(int hrani, int napitki){
		int rand;
		Salad cezar;
		Meal pile;
		Desert melba;
		AlcoholicDrink whiskey;
		NonAlcoholicDrink sok;
		for (int i = 0; i < hrani; i++) {
			rand = new Random().nextInt(300)+300;
			cezar = new Salad(rand);
			addMealToMenu(cezar);
		}
		salati = hrani;
		for (int i = 0; i < hrani; i++) {
			rand = new Random().nextInt(400)+400;
			pile = new Meal(rand); 
			addMealToMenu(pile);
		}
		qstiq = hrani;
		for (int i = 0; i < hrani; i++) {
			rand = new Random().nextInt(100)+200;
			melba = new Desert(rand);
			addMealToMenu(melba);
		}
		deserti = hrani;
		for (int i = 0; i < napitki; i++) {
			whiskey = new AlcoholicDrink();
			addBeverageToMenu(whiskey);
		}
		alkoholi = napitki;
		for (int i = 0; i < napitki; i++) {
			sok = new NonAlcoholicDrink();
			addBeverageToMenu(sok);
		}
		sokove = napitki;
		return this;
	}
	public ArrayList<Hrani> getHrani(){
		return hrani;
	}
	public ArrayList<Napitki> getNapitki(){
		return napitki;
	}
		
}
