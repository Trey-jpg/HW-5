public class Driver 
{
	public static void main(String[] args)
	{
		// p = Person("Mike", "Litman", 21)
		BibleBook book1 = new BibleBook("Genesis", 50, "The Creation Account");
        BibleBook book2 = new BibleBook("Exodus", 40 , "The Ten Commandments");
        BibleBook book3 = new BibleBook("Daniel", 12 , "Shadrach, Meshach, and Abednego");
		book1.display();
        book2.display();
        book3.display();
		

	}
}