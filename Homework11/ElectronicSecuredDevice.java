import java.util.Scanner;

public class ElectronicSecuredDevice extends SecuredNotepad implements INotepad, IElectronicDevice{
	private boolean isStarted = false;
	
	ElectronicSecuredDevice(String pass, int pages) {
		super(pass, pages);
		this.start();
		// TODO Auto-generated constructor stub
	}

	public void addText(String text, String title, int page) {
		// TODO Auto-generated method stub
		if(this.isStarted()){	
			super.addText(text, title, page);
		}
	}

	@Override
	public void overWriteText(String text, String title, int page) {
		// TODO Auto-generated method stub
		if(this.isStarted()){	
			super.overWriteText(text, title, page);
		}
	}

	@Override
	public void deleteText(int page) {
		// TODO Auto-generated method stub
		if(this.isStarted()){	
			super.deleteText(page);
		}
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		if(this.isStarted()){	
			super.printAll();
		}
	}
	
	@Override
	public void searchWord(String word) {
		// TODO Auto-generated method stub
		if(this.isStarted()){
			super.searchWord(word);
		}
	}
	@Override
	public void printAllPagesWithDigits() {
		// TODO Auto-generated method stub
		if(this.isStarted()){
			super.printAllPagesWithDigits();
		}
	}


	@Override
	public void start() {
		// TODO Auto-generated method stub
		this.setStarted(true);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		this.setStarted(false);
	}

	@Override
	public boolean isStarted() {
		// TODO Auto-generated method stub
		if(this.isStarted){
			return true;
		}
		else{
			System.out.println("Устройството е изключено.");
			return false;
		}
	}

	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}

}
