import java.util.Random;

public class Pratka {
	private long number;
	private Korab korab;
	
	public Pratka(Korab korab) {
		this.korab = korab;
		this.number = generate();
	}
	
	private long generate(){
		return new Random().nextLong();
	}
	
	public long getNumber() {
		return number;
	}
	
	public Korab getKorab(){
		return korab;
	}
}
