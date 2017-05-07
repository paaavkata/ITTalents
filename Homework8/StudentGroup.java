public class StudentGroup {
	
	String groupSubject;
	Student[] students = new Student[5];
	int freePlaces = 5;
	
	StudentGroup(){

	}
	
	StudentGroup(String groupSubject){
		new StudentGroup();
		this.groupSubject = groupSubject;
	}
	
	public void addStudent(Student newStudent){
		if(this.freePlaces == 0){
			System.out.println("Няма повече свободни места.");
		}
		else{
			if(this.groupSubject.equals(newStudent.subject)){
				students[students.length-this.freePlaces] = newStudent;
				System.out.println(students[students.length-this.freePlaces].name + " е записан в курс " + this.groupSubject);
				freePlaces--;
				
			}
			else{
				System.out.println("Вие не сте записан в този курс.");
			}
		}
	}
	
	public void emptyGroup(){
		students = new Student[5];
		freePlaces = 5;
	}
	
	public String theBestStudent(){
		int max = 0;
		for (int i = 1; i < students.length-freePlaces; i++) {
			if(this.students[i-1].grade < this.students[i].grade){
				max = i;
			}
		}
		return students[max].name;
	}
	
	public void printStudentsInGroup(){
		for (int i = 0; i < students.length-freePlaces; i++) {
			System.out.println("Име: " + students[i].name + ", възраст: " + students[i].age + ", оценка: " + students[i].grade + ", година в колежа: " + students[i].yearInCollege + ", стипендия: ");
			if(students[i].money == 0){
				System.out.print("няма");
			}
			else{
				System.out.print(students[i].money);
			}
			System.out.println();
		}
	}
}
