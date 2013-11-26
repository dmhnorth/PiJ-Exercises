//Works
//Write a program that reads some text from the user and then says how many letters ’e’ are there in that text. Then modify the program so that it reads the text from the user and then asks for a letter. The program should then say how many times you can find the letter in the text.


String let = "e", userEntry
int chcnt


print "Enter a word and I will tell you how many e's it has in it: "
userEntry = System.console().readLine()
println "Now enter the letter you would like to find in the sentence: "
let = System.console().readLine()

for (int i = 0; i < userEntry.length(); i++) {	//this is a 'for' loop, which carries on until the bit in the middle is fulfilled
	char x = userEntry.charAt(i);
	
	if (x == let)
	{
	chcnt++;
	}
	}
	println "There are " + chcnt + " of the letter " + let + " in the string " + userEntry