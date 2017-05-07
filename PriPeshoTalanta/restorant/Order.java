package restorant;

import java.util.ArrayList;

import klienti.Klient;
import orderable.Hrani;
import orderable.Napitki;
//import orderable.Hrani;
//import orderable.Napitki;

public class Order {
	private Klient klient;
	private int sum;
	private Servitior servitior;
	private ArrayList<Hrani> hrani;
	private ArrayList<Napitki> napitki;
	
	public Order(Klient klient, int sum, Servitior servitior, ArrayList<Hrani> hrani, ArrayList<Napitki> napitki) {
		this.klient = klient;
		this.sum = sum;
		this.servitior = servitior;
		this.hrani = hrani;
		this.napitki = napitki;
		
	}

	public Servitior getServitior() {
		return servitior;
	}

	public int getSum() {
		return sum;
	}
	public void addHrana(Hrani hrana){
		this.hrani.add(hrana);
	}
	public void addNapitka(Napitki napitka){
		this.napitki.add(napitka);
	}
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("Информация за поръчката на " + this.klient.getName());
		System.out.println("Храни:");
		for (int i = 0; i < hrani.size(); i++) {
			this.hrani.get(i).printInfo();
		}
		System.out.println("Напитки:");
		for (int i = 0; i < napitki.size(); i++) {
			this.napitki.get(i).printInfo();
		}
		System.out.println("Обща сума: " + this.sum);
		System.out.println("-----------");
	}
}
