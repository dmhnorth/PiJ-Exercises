//Works except it doesn't print number 2!
//day 1 exercise 13 prints all the prime numbers up to 1000

int cur = 2, riser = 1




while (cur < 1000) {
	
	if (cur % riser != 0) {	//checks each riser until it equals 0 by divided the current number by itself (one element indicative of a prime)
		riser++
	} else if (riser == cur) {	//if the number eventually hits the current number being checked, it is obviously a prime
		println cur + " is a prime number. "		
		cur++
		riser = 2
	}
	else {	//this resets the system and increase the (cur)rent by one and resets the riser to 2
		cur++
		riser = 2
	}
					}
					println "and that's that."
