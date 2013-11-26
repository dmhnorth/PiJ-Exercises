//WORKS
//Write a program that requests two numbers from the user and then outputs the quotient and the remainder, e.g. if the user enters 7 and 3, your program should ouput something like “7 divided by 3 is 2, remainder 1”. You cannot use the “/” or “%” operators.

int ent1, ent2, count = 0, rem, ans = 0


println "This program divides the first number by the second"

println "Please enter your first number: "
ent1 = Integer.parseInt(System.console().readLine())

println "Please enter your second number: "
ent2 = Integer.parseInt(System.console().readLine())

while (count < ent1) {	//a looping system is created to count the amount of times a number divides into the second
	count = count + ent2
	ans++
}
if (count > ent1) {
	ans = ans - 1
}

println ent2 + " goes into " + ent1 + " " + ans + " times. With " + (count - ent1) + " remaining." //Working!