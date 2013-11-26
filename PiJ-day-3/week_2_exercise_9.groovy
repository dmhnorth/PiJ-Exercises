//Works
//Write a program that reads a text and then writes on the screen a palindrome by writing the same text followed by the same text in reversed order. For example, if the user enters the text “It was a dark and stormy night” the program must output “It was a dark and stormy nightthgin ymrots dna krad a saw tI”.



String userEntry, result = ""	//for a long time I was getting 'null' in the printout for result because I hadn't initialisd this complex string so it was pointing to null
int chmrk


print "Please enter something you wish to have turned into a palindrome: "
userEntry = System.console().readLine()
chmrk = userEntry.length() - 1


for (int i = 0; i < userEntry.length(); i++ ) {
	String addletter = userEntry.charAt(chmrk)
	chmrk = chmrk - 1
	result = result + addletter
	//println result FOR DEBUGGING
}
// println result FOR DEBUGGING
println userEntry + "" + result