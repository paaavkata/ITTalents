
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] hora = new Person[10];
		Person ivan = new Person(20, "Иван Иванов", true);
		input(ivan, hora);
		Person ivana = new Person(17, "Ивана Иванова", false);
		input(ivana, hora);
		Student gosho = new Student(16, "Георги Георгиев", true, 4.5);
		input(gosho, hora);
		Student gergana = new Student(14, "Гергана Георгиева", false, 5.4);
		input(gergana, hora);
		Employee mario = new Employee(22, "Марио Мариов", true, 100);
		input(mario, hora);
		Employee maria = new Employee(17, "Мария Мариова", false, 40);
		input(maria, hora);
		
		for (int i = 0; i < hora.length; i++) {
			if(hora[i] != null){
				if(hora[i] instanceof Student){
					((Student) hora[i]).showStudentInfo();
				}
				else{
					if(hora[i] instanceof Employee){
						((Employee) hora[i]).showEmployeeInfo();
					}
					else{
						hora[i].showPersonInfo();
					}
				}
			}
		}
		System.out.println();
		double overtime = 2;
		for (int i = 0; i < hora.length; i++) {
			if(hora[i] instanceof Employee){
				System.out.println("Работникът: " + ((Employee) hora[i]).getName() + " е заработил " 
				+ ((Employee) hora[i]).calculateOvertime(overtime) + " лв. за " + overtime + " часа работа извън работно време");
			}
		}
		
	}
	
	static void input(Person chovek, Person[] masivHora){
		for (int i = 0; i < masivHora.length; i++) {
			if(masivHora[i] == null){
				masivHora[i] = chovek;
				break;
			}
		}
	}

}
