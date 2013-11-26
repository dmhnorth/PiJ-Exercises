public class Person{
	

	
	
	
	
	/*ORIGINAL which doesn't account for two spaces in a name
	public String getInitials(String fullName) {
		String result = "";
		String[] words = fullName.split(" ");
		for(int i = 0; i < words.length; i++) {
			String nextInitial = "" + words[i].charAt(0);
			result = result + nextInitial.toUpperCase();
		}
		return result;
	}
	*/
	
	public String getInitials(String fullName) {
		String result = "";
		String[] words = fullName.split(" ");
		for(int i = 0; i < words.length; i++) {		//this is printing each word from the array to test
			String nextWord = "" + words[i];
			System.out.println(nextWord);
		}
		for(int i = 0; i < words.length; i++) {
			if(!words[i].equals("")){				//this now checks whether an array is empty, if it is, it isn't used to evaluate an initial
				String nextInitial = "" + words[i].charAt(0);
				result = result + nextInitial.toUpperCase();
			}
		}
		return result;
	}
}