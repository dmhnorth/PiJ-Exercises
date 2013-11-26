//
//day 4 - exercise 3 - Write a program that asks the user for the total amount borrowed for a mortgage, the number of years to pay it back, and the interest rate (in this exercise, we assume it is a fixed rate). The program can then calculate how much must be paid at the end




double totalmort = 0, borrow = 0, rate = 0, years = 0

print "Please enter the amount you wish to borrow for the mortgage?: "
borrow = Double.parseDouble(System.console().readLine())
print "Please enter the number of years you wish to spend paying for it: "
years = Double.parseDouble(System.console().readLine())
print "What is the interest rate you would like to borrow at?: "
rate = Double.parseDouble(System.console().readLine())





totalmort  = borrow * (1 + (rate / 100))

println "The total amount to be paid is £" + totalmort