import java.util.ArrayList;
import java.util.Random;

import klienti.Klient;
import klienti.Mutra;
import klienti.Student;
import klienti.Vegan;
import restorant.Restorant;
import restorant.Servitior;

public class Demo {

	static Restorant priPeshoTalanta = new Restorant("При Пешо Таланта", "Гургулят 30", 1000, 5, 30 ,30);
	//static ArrayList<Klient> posetiteli = new ArrayList<Klient>();	
	
	public static void main(String[] args) {
		
		startDay();
		
		System.out.println("Заведението " + priPeshoTalanta.getName() + " вече разполага с " + priPeshoTalanta.getMoney() + " лв. капитал.");
		
		Servitior best = priPeshoTalanta.bestWaiter();
		
		System.out.println("Сервитьор с най-голям бакшиш: " + best.getName() + ", изкарал " + best.getTips() + " лв.");
		
		priPeshoTalanta.printRest();
		
		
	}
	
	public static void startDay(){
		priPeshoTalanta.addKlienti(generateClients(15));
		
		for (int i = 0; i < priPeshoTalanta.getKlienti().size(); i++) {
			priPeshoTalanta.getKlienti().get(i).makeOrder();
		}
		for (int i = 0; i < priPeshoTalanta.getKlienti().size(); i++) {
			priPeshoTalanta.getKlienti().get(i).askForCheck();
		}
		for (int i = 0; i < priPeshoTalanta.getKlienti().size(); i++) {
			priPeshoTalanta.getKlienti().get(i).payCheck();
		}
		
	}
	
	public static ArrayList<Klient> generateClients(int count){
		ArrayList<Klient> klienti = new ArrayList<Klient>();
		for(int i = 0; i < count; i++){
			int rand;
			rand = new Random().nextInt(10);
			if(rand <= 2){
				klienti.add(new Vegan(priPeshoTalanta));
			}
			else{
				if(rand > 2 && rand <=5){
					klienti.add(new Student(priPeshoTalanta));
				}
				else{
					klienti.add(new Mutra(priPeshoTalanta));
				}
			}
		}
		return klienti;
	}
	
}
