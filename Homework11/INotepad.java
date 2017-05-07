
public interface INotepad {
	void addText(String text, String title, int page);
	void overWriteText(String text, String title, int page);
	void deleteText(int page);
	void printAll();
	void searchWord(String word);
	void printAllPagesWithDigits();
}
