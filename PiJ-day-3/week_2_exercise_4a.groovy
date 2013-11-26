//WORKS
//exercise 4, this takes a a piece of text and writes it's words out one line after another
//This is the version that walks through the string entered, if a space is present it prints to the next line, if else it prints it

String curEntry


print "Please enter a sentence, I will separate it onto lines for you: "
curEntry = System.console().readLine()
for (int i = 0; i < curEntry.length(); i++) {
	char c = curEntry.charAt(i);
		if (c == " ") {
		print "\n"
		} else {
		print c
	}
											}