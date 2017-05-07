package klienti;

import java.util.ArrayList;
import java.util.Random;

import orderable.Hrani;
import orderable.IMutra;
import orderable.IVegan;
import orderable.Napitki;
import restorant.Order;
import restorant.Restorant;
import restorant.Servitior;

public class Vegan extends Klient {

	public Vegan(Restorant priPeshoTalanta) {
		super("Евкалипт", 30);
		setZavedenie(priPeshoTalanta);
		// TODO Auto-generated constructor stub
	}
	public void setZavedenie(Restorant zavedenie) {
		this.zavedenie = zavedenie;
	}
	public void makeOrder() {
		// TODO Auto-generated method stub
		int sumOfOrder = 0;
		int rand = new Random().nextInt(zavedenie.getQstiq().size()-1);
		ArrayList<Hrani> hrani = new ArrayList<Hrani>();
		ArrayList<Napitki> napitki = new ArrayList<Napitki>();
		while(true){
			
			if(zavedenie.getQstiq().get(rand) instanceof IVegan){
				if(sumOfOrder + zavedenie.getQstiq().get(rand).getCena() > 0.9*this.getMoney()){
					break;
				}
				sumOfOrder += zavedenie.getQstiq().get(rand).getCena();
				hrani.add(zavedenie.getQstiq().get(rand));
				zavedenie.getQstiq().remove(rand);
			}
			rand = new Random().nextInt(zavedenie.getNapitki().size()-1);
			if(zavedenie.getNapitki().get(rand) instanceof IVegan){
				if(sumOfOrder + zavedenie.getNapitki().get(rand).getCena() > 0.9*this.getMoney()){
					break;
				}
				sumOfOrder += zavedenie.getNapitki().get(rand).getCena();
				napitki.add(zavedenie.getNapitki().get(rand));
				zavedenie.getNapitki().remove(rand);
			}
			rand = new Random().nextInt(zavedenie.getQstiq().size()-1);
		}
		System.out.println(this.getName() + " направи поръчка на стойност " + sumOfOrder + "лв.");
		rand = new Random().nextInt(zavedenie.getServitiori().size()-1);
		super.setOrder(new Order(this, sumOfOrder, zavedenie.getServitiori().get(rand), hrani, napitki));
		this.zavedenie.addPoruchka(super.getOrder());
	}
}
