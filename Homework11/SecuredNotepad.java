import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements INotepad{
	private String password;
	
	SecuredNotepad(String pass, int pages){
		super(pages);
		this.setPassword(pass);
	}
	
	private void setPassword(String pass){
		boolean malka = false;
		boolean golqma = false;
		boolean cifra = false;
			if(pass.length() >= 5){
				for (int i = 0; i < pass.length(); i++) {
					if(pass.charAt(i) > 'a' && pass.charAt(i) < 'z'){
						malka = true;
						continue;
					}
					if(pass.charAt(i) > 'A' && pass.charAt(i) < 'Z'){
						golqma = true;
						continue;
					}
					if(pass.charAt(i) > '0' && pass.charAt(i) < '9'){
						cifra = true;
					}
				}
				if(malka && golqma && cifra){
					this.password = pass;
				}
				else{
					System.out.println("Паролата трябва да съдържа поне една малка буква, една голяма буква и една цифра.");
					System.out.println("Въведете нова парола:");
					Scanner scan = new Scanner(System.in);
					pass = scan.nextLine();
					setPassword(pass);
				}
			}
			else{
				System.out.println("Въведената парола е прекалено къса. Въведете парола с повече от 5 символа:");
				Scanner scan = new Scanner(System.in);
				pass = scan.nextLine();
				setPassword(pass);
			}
	}
	@Override
	public void addText(String text, String title, int page) {
		// TODO Auto-generated method stub
		if(this.validate()){	
			super.addText(text, title, page);
		}
	}

	@Override
	public void overWriteText(String text, String title, int page) {
		// TODO Auto-generated method stub
		if(this.validate()){	
			super.overWriteText(text, title, page);
		}
	}

	@Override
	public void deleteText(int page) {
		// TODO Auto-generated method stub
		if(this.validate()){	
			super.deleteText(page);
		}
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		if(this.validate()){	
			super.printAll();
		}
	}
	
	private boolean validate(){
		System.out.println("Въведете парола за достъп:");
		Scanner scan = new Scanner(System.in);
		String pass = scan.nextLine();
		if(pass.equals(this.password)){
			System.out.println("OK!");
			return true;
		}
		else{
			System.out.println("Въведената парола е невалидна. Опитайте отново");
			validate();
			return false;
		}
	}
	@Override
	public void searchWord(String word) {
		// TODO Auto-generated method stub
		if(validate()){
			super.searchWord(word);
		}
	}
	@Override
	public void printAllPagesWithDigits() {
		// TODO Auto-generated method stub
		if(validate()){
			super.printAllPagesWithDigits();
		}
	}

}
