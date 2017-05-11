import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		Pristanishte pristanishte = new Pristanishte();
		for(int i = 1; i <= 50; i++){
			pristanishte.akustirai(new Korab("Korab " + i));
		}
		try {
			Thread.sleep(60*1000);
		} catch (InterruptedException e) {
			System.out.println("Greshka");
		}
		//DB_insert.getCranesInfo();
		//DB_insert.getDocsInfo();
		//DB_insert.best();
	}
}
