//Works, but worth asking about line 15 and why it was stopping it work
//exercise 8 - A palindrome is a word, phrase, number, or other sequence of units that may be read the same way in either direction. Examples of strict palindromes include “ABBA”, “madam”, “radar”, “kayak”, and “step on no pets”. Write a program that reads a text and detects whether the text is a strict palindrome.

String chA, chB, userEntry
int chAi, chBi
boolean palin = true

print "Please enter a string and I will tell you if it is a palindrome: "

userEntry = System.console().readLine()
int chBmarker = userEntry.length() - 1

for (int i = 0; i < userEntry.length(); i++) {	//this is going to walk one way through the sentence, whilst the other end counts down	
	if (userEntry.charAt(i) == userEntry.charAt(chBmarker)) {
	//palin = true 
	chBmarker = chBmarker - 1	
	} else { 
	palin = false
	}
											}
	
	if (palin) {
	println "Yes " + userEntry + " is a palindrome!"
	} else {
	println "No it doesn't work. idiot."
	}