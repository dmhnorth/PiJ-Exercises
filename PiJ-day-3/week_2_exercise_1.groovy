//Exercise to create a calculator for simple things between two numbers

double userentry1, userentry2
boolean ended = false


while (!ended) {

print "Please enter your first number: "
userentry1 = Double.parseDouble(System.console().readLine())

print "Now please enter a second number: "
userentry2 = Double.parseDouble(System.console().readLine())


println "Now we will can calculate the two numbers together"
println "To divide the first by the second press 1"
println "To multiply the first by the second press 2"
println "To the second away from the first press 3"
println "To add the two numbers together press 4"
println "To end the program please hit 5"
print "What is your option?: "

String o = System.console().readLine()	//0 or o is a bad name for a String because it looks like a number
int option = Integer.parseInt(o)
switch (option) {
case 1:
	println userentry1 / userentry2
	break;
case 2:
	println userentry1 * userentry2
	break;
case 3:
	println userentry1 - userentry2
	break;
case 4:
	println userentry1 + userentry2
	break;
case 5:
	println "You have ended the program"
	ended = true
	break;
default:
	println "That was not an option."
	break;
		}
		}