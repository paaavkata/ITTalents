
public class Page {
	private	String title;
	private String text;
	
	public boolean searchWord(String word){
		if(this.text != null && !this.text.isEmpty()){
			return this.text.contains(word);
		}
		else{
			return false;
		}
	}
	public boolean containsDigits(){
		if(this.text != null && !this.text.isEmpty()){
			return this.text.matches(".*\\d.*");
		}
		else{
			return false;
		}
	}
	public String getTitle() {
		return title;
	}
	public void deleteTitle() {
		this.title = null;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		if(this.text != null && !this.text.isEmpty()){
			return text;
		}
		else{
			return "";
		}
	}
	public void setText(String text) {
		this.text = text;
	}
	public void deleteText(){
		if(this.text != null && !this.text.isEmpty()){
			this.text = null;
		}
	}
	public void printAll(){
		if(this.text != null && !this.text.isEmpty() && this.title != null && !this.title.isEmpty()){
			System.out.println(title);
			System.out.println(text);	
			System.out.println();
		}
	}
	
}
