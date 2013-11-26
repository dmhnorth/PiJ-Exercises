//Works
//exercise 4, this takes a a piece of text and writes it's words out one line after another
//This is the version that uses substrings

String curEntry
int countstart = -1

print "Please enter a sentence, I will separate it onto lines for you: "
curEntry = System.console().readLine()
for (int i = 0; i < curEntry.length(); i++) {
	char c = curEntry.charAt(i);
		if (c == " ") {
		print curEntry.substring(countstart + 1, i)		//This is the coordinate needed
		print "\n"
		countstart = i
	}
	}
	print curEntry.substring(countstart + 1)