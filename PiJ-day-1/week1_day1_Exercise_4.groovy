//tells you if the number you enter is prime or not

int x
String user_input

print "enter a number, I will tell you if it is prime: "
x = Integer.parseInt(System.console().readLine())


if (x == 2) {
println "This number is prime"
} else {
user_input = (x % 2 != 0)? "This number is prime" : "This number is not prime"
}
println user_input