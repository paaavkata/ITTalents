
public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student boy1 = new Student();
		Student boy2 = new Student();
		final double scholarshipGrade = 4.4;
		
		boy1.name = "Ивайло Драганов";
		boy1.age = 22;
		boy1.subject = "Математика";
		boy1.grade = 5.5;
		boy1.yearInCollege = 2;
		
		boy2.name = "Гошо от Почивка";
		boy2.age = 24;
		boy2.subject = "Философия";
		boy2.grade = 5.2;
		boy2.yearInCollege = 3;
		
		
		Student boy3 = new Student("Иван Петков", "Математика", 18);
		boy3.grade = 3.5;
		Student boy4 = new Student("Драго Симеонов", "Математика", 19);
		boy4.grade = 6.0;
		Student boy5 = new Student("Илия Бешков", "Математика", 19);
		boy5.grade = 2.0;
		Student girl5 = new Student("Евдокия Симеонова", "Информатика", 20);
		girl5.grade = 4.5;
		Student girl6 = new Student("Атанаска Петкова", "Информатика", 21);
		girl6.grade = 4.9;
		Student girl7 = new Student("Синя Луна", "Философия", 22);
		girl7.grade = 5.9;
		Student girl8 = new Student("Спаска Станкова", "Философия", 23);
		girl8.grade = 3.9;
		Student boy6 = new Student("Ежко бежко", "Философия", 19);
		boy6.grade = 4.9;
		Student boy7 = new Student("Симеон Симеонов", "Философия", 23);
		boy7.grade = 5.4;
		
		boy4.receiveScholarship(scholarshipGrade, 100);
		girl7.receiveScholarship(scholarshipGrade, 100);
		boy7.receiveScholarship(scholarshipGrade, 100);
		girl8.receiveScholarship(scholarshipGrade, 100);
		
		boy6.upYear();
		girl5.upYear();
		girl6.upYear();
		boy3.upYear();
		boy1.upYear();
		boy1.upYear();

		
		StudentGroup matematics = new StudentGroup("Математика");
		StudentGroup informatics = new StudentGroup("Информатика");
		StudentGroup philosophy = new StudentGroup("Философия");
		
		matematics.addStudent(boy1);
		matematics.addStudent(boy3);
		matematics.addStudent(boy4);
		matematics.addStudent(boy5);
		
		informatics.addStudent(girl5);
		informatics.addStudent(girl6);
		
		philosophy.addStudent(girl7);
		philosophy.addStudent(girl8);
		philosophy.addStudent(boy6);
		philosophy.addStudent(boy7);
		
		System.out.println("Най-високият успех в групата по математика е на " + matematics.theBestStudent());
		philosophy.printStudentsInGroup();
		informatics.emptyGroup();
	}

}
