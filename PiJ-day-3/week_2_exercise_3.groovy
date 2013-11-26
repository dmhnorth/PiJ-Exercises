//Exercise 3, this program gives you the number of notes and coins in change from a designated purchase
// in order for this to work I will need to take the cost away from the tendered amount. this will result in the change required, which I will divide notes into

double tender, cost, curChange, fifties, twenties, tens, fives, cTwos, cOnes, cFifties, cTwenties, cTens, cFives, cTwopennies, cPennies 


print "How much did the item cost?: "
cost = Double.parseDouble(System.console().readLine())

println "How much money was tendered?: "
tender = Double.parseDouble(System.console().readLine())

curChange = tender - cost

println "Your change is: £" + curChange


while (curChange >= 50) {
	fifties++
	curChange = curChange - 50
	}
while (curChange >= 20) {
	twenties++
	curChange = curChange - 20
	}
while (curChange >= 10) {
	tens++
	curChange = curChange - 10
	}
while (curChange >= 5) {
	fives++
	curChange = curChange - 5
	}
while (curChange >= 2) {
	cTwos++
	curChange = curChange - 2
	}
while (curChange >= 1) {
	cOnes++
	curChange = curChange - 1
	}
while (curChange >= 0.50) {
	cFifties++
	curChange = curChange - 0.50
	}
while (curChange >= 0.20) {
	cTwenties++
	curChange = curChange - 0.20
	}
while (curChange >= 0.10) {
	cTens++
	curChange = curChange - 0.10
	}
while (curChange >= 0.05) {
	cFives++
	curChange = curChange - 0.05
	}
while (curChange >= 0.02) {
	cTwopennies++
	curChange = curChange - 0.02
	}
while (curChange >+ 0.01) {
	cPennies++
	curChange = curChange - 0.01
	}




println "You have " + fifties + " fifties"
println "You have " + twenties + " twenties"
println "You have " + tens + " tens"
println "You have " + fives + " fives"
println "You have " + cTwos + " two pound coins"
println "You have " + cOnes + " one pound coins" 
println "You have " + cFifties + " Fifty pence coins"
println "You have " + cTwenties + " Twenty pence coins"
println "You have " + cTens + " Ten pence coins"
println "You have " + cFives + " Five pence coins"
println "You have " + cTwopennies + " Two penny coins"
println "You have " + cPennies + " One penny coins"