//WORKS
//Read an arbitrarily long sequence of positive numbers from the user, until -1 is entered. At that point, print ”Yes” if the numbers were consecutive and increasing and ”No” otherwise. Sequences ”1,2,3,4,-1” and ”5,6,7,8,9,10,11,-1” should output ”Yes”, but ”2,3,5,6,7,-1”, ”10,9,8,7,-1”, and ”1,1,2,3,4,5-1” should output ”No”.

boolean sequential = true
boolean ended = false
int lastentry, current




println "Please input a number, I will tell you if they were consecutive when you enter -1: "
	lastentry = Integer.parseInt(System.console().readLine())


while (!ended) {
	println "Please input the next number: "
	current = Integer.parseInt(System.console().readLine())

		
		if (current == -1 || lastentry == -1) //Just the ended sequence, checking the ended boolean and printing the right answer
			{
			ended = true
			if (sequential == true) {
			println "Yes"
			} else {
			println "No"
			}
			}
			
		
		
		if (current == lastentry + 1 && sequential == true)	// having the second part here means that if the boolean is ever turned false, it can never become true again
		{
		sequential = true
		lastentry = current
		} else {
		sequential = false
		 
		}
			}
