package orderable;

public class Meal extends Hrani implements IMutra{

	public Meal(int gramaj) {
		super("Кавърма", (gramaj >= 400 && gramaj <= 800 ? gramaj : 600), 9);
		// TODO Auto-generated constructor stub
	}

}
