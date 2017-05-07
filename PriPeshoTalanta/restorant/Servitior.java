package restorant;

public class Servitior {
	private String name;
	private double tips;
	public Servitior(String name) {
		this.name = name;
	}
	public int getOrderSum(Order order){
		return order.getSum();
	}
	public void addTip(double tip){
		this.tips += tip;
		System.out.println("Оставен е бакшиш в размер на " + tip);
	}
	public String getName() {
		return name;
	}
	public double getTips() {
		return tips;
	}
	
}
