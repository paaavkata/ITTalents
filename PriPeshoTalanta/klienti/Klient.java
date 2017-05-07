package klienti;

import java.util.ArrayList;
import java.util.Random;

import orderable.Hrani;
import orderable.Napitki;
import restorant.Order;
import restorant.Restorant;
import restorant.Servitior;

public abstract class Klient {
	private String name;
	private int money;
	private Order order;
	protected Restorant zavedenie;
	public Klient(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void setZavedenie(Restorant zavedenie) {
		this.zavedenie = zavedenie;
	}

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setOrder(Order order){
		this.order = order;
	}
	public Order getOrder(){
		return this.order;
	}
	public void askForCheck(){
		this.order.printInfo();
	}
	
	public void payCheck(){
		double tip = 0;
		int rand = new Random().nextInt(10);
		if(rand <= 8){
			rand = new Random().nextInt(5)+5;
			tip = ((double) rand/100);
			this.order.getServitior().addTip(this.order.getSum()*tip);
		}
	
		zavedenie.removePoruchka(this.order);
		System.out.println("Платени са " + ((1+tip)*((double) order.getSum())) + " от " + this.getName());
		System.out.println("-----------------");
	}

	public void makeOrder() {
		// TODO Auto-generated method stub
		
	}

	
}
