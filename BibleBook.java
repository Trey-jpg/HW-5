public class BibleBook

{
	private String book;
	private int chapter;
	private String description;
	
	public BibleBook(String book, int chapter, String description)
	{
		this.book = book;
		this.chapter = chapter;
		this.description = description;
	}
	
	public String getFname()
	{
		return this.book;
	}
	
	public void display()
	{
		System.out.println(this.book + " " + this.chapter + " (Description: " + this.description + ")");
	}
}
