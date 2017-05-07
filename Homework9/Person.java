
public class Person {
	
	private int age;
	private String name;
	private boolean isMale;
	
	Person(int age, String name, boolean isMale){
		this.setAge(age);
		this.setMale(isMale);
		this.setName(name);
	}
	Person(){
		
	}
	
	void showPersonInfo(){
		System.out.println();
		System.out.print("Име: " + getName() + ", възраст: " + getAge() + ", пол: " + (isMale() ? "Мъж" : "Жена"));
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 0){
			this.age = age;
		}
		else{
			System.out.println("Въведената стойност е отрицателна.");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
}
