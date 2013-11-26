import org.junit.*;
import static org.junit.Assert.*;


public class BookTest {
	
	Book book1;
	
	@Before	//sets something up at the beginning of the Test (for duration)
	public void buildUp() {
	book1 = new Book("Da Vinci Code", "Dan Brown");
	}
	
	
	@After	//although this is not really needed for this particular class
	public void cleanup() {
		book1 = null;
	}
	
	
	@Test
	public void testBookTitle() {
	assertEquals(book1.getTitle(), "Da Vinci Code");
	}
	
	@Test
	public void testBookAuthor() {
	assertEquals(book1.getAuthor(), "Dan Brown");
	}
}