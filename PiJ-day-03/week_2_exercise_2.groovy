//Works
//Have to be careful on the directions of the < and > in the for statements. The below method works! if something isn't working, read the entire thing out loud!
//command line calculator - Write a program that reads a text representing a mathematical operation (one of the four basic ones) with two operands, and then execute it. For example, if the user enters “3/5” the program outputs “0.6”; if the user enters “23 * 4” the program outputs “92”.


String userEntry, num1str = "", num2str = ""
int num1 = 0, num2 = 0


print "Please enter a simple mathematical equation (spaces will be ignored) for me to solve within the terminal: "
userEntry = System.console().readLine()


for (int i = 0; i < userEntry.length(); i++) {
	if (Character.isDigit(userEntry.charAt(i))) {
		num1str = num1str + userEntry.charAt(i)
	} else if (userEntry.charAt(i) == " ") 
	{
		//this is purely an exception so spaces are ignored
	} else 
	{
		num1 = Integer.parseInt(num1str)
		num1str = ""
	}

}
num2 = Integer.parseInt(num1str)


println num1
println num2







for (int y = 0; y < userEntry.length(); y++) {
	if (userEntry.charAt(y) == "+") {
			println "The answer is " + num1 + "+" + num2 + " = " + (num1 + num2)
	} else if (userEntry.charAt(y) == "-") {
			println "The answer is " + num1 + "-" + num2 + " = " + (num1 - num2)
	} else if (userEntry.charAt(y) == "*") {
			println "The answer is " + num1 + "*" + num2 + " = " + (num1 * num2)
	} else if (userEntry.charAt(y) == "/") {
			println "The answer is " + num1 + "/" + num2 + " = " + (num1 / num2)
	}
}
