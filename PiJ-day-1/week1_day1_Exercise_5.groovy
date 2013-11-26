//WORKS
//Write a program that requests two numbers from the user and then outputs its product. You cannot use the “*” operator.
int x, y, count = 0, ans = 0

print "Enter the first number: "
x = Integer.parseInt(System.console().readLine())

print "Enter the second number you want to multiply the first number by: "
y = Integer.parseInt(System.console().readLine())

while (count < y) {
	count++
	ans = ans + x
}



println x + " X " + y + " = " + ans