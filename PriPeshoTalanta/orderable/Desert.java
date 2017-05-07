package orderable;

public class Desert extends Hrani implements IStudent{

	public Desert(int gramaj) {
		
		super("Мелба", (gramaj >= 200 && gramaj <= 300 ? gramaj : 250), 4);
		// TODO Auto-generated constructor stub
	}

}
