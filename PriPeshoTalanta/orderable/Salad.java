package orderable;

public class Salad extends Hrani implements IStudent, IVegan{

	public Salad(int gramaj) {
		super("Цезар", (gramaj >= 300 && gramaj <= 600 ? gramaj : 450), 5);
		// TODO Auto-generated constructor stub
	}

}
