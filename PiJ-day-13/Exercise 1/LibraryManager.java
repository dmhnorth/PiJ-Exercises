public interface LibraryManager {
	/**
	*Add a new book to the library list
	*/
	void addBook(Book book);
	
	
	/**
	*Returns the title of a new book
	*/
	String getTitle(Book book);
	
	/**
	*Moves a book into the OUT list
	*/
	Book checkOut(Book book);
	
	
	
	
}