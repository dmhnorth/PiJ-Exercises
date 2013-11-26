//WORKS
//exercise 4, this takes a a piece of text and writes it's characters out one line after another

String curEntry


print "Please enter a word, I will print it vertically for you: "
curEntry = System.console().readLine()
for (int i = 0; i < curEntry.length(); i++) {
	char c = curEntry.charAt(i);
	println c	
	}