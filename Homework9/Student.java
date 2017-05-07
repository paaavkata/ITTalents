
public class Student extends Person{
	
	private double score;	
	
	Student(int age, String name, boolean isMale, double score) {
		super(age, name, isMale);
		setScore(score);
		// TODO Auto-generated constructor stub
	}
	Student(){
		//трябва да се добави празен конструктор в Person()
	}
	
	void showStudentInfo(){
		super.showPersonInfo();
		System.out.print(", оценка: " + getScore());
		
	}
	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if(score >= 2 && score <= 6){
			this.score = score;
		}
		else{
			System.out.println("Въведената стойност е невалидна. Трябва да е в интервала от 2 до 6");
		}
	}


	
}
