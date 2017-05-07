
public class SimpleNotepad implements INotepad{
	private Page[] document;
	
	SimpleNotepad(int pages){
		this.document = new Page[pages];
		for (int i = 0; i < document.length; i++) {
			document[i] = new Page();
		}
	}
	
	@Override
	public void addText(String text, String title, int page) {
		// TODO Auto-generated method stub
		this.document[page-1].setText(text);
		this.document[page-1].setTitle(title);
	}

	@Override
	public void overWriteText(String text, String title, int page) {
		// TODO Auto-generated method stub
		this.deleteText(page);
		this.addText(text, title, page);
	}

	@Override
	public void deleteText(int page) {
		// TODO Auto-generated method stub
		this.document[page-1].deleteText();
		this.document[page-1].deleteTitle();
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.document.length; i++) {
			this.document[i].printAll();
		}
	}

	@Override
	public void searchWord(String word) {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.document.length; i++) {
			if(this.document[i] != null){
				if(this.document[i].searchWord(word)){
					System.out.println("Текстът '" + word + "' се съдържа в документа на страница " + (i+1) + ".");
				}
			}
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		// TODO Auto-generated method stub
		for (int i = 0; i < document.length; i++) {
			if(document[i] != null){
				if(document[i].containsDigits()){
					System.out.println("Следната страницата съдържа цифра:");
					document[i].printAll();
				}
			}
		}
	}

}
