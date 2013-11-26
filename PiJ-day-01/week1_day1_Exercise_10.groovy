//WORKS 
//Modify your former program so that it outputs ”Yes” when the numbers are consecutive, regardless of whether they go up or down. For example, both ”2,3,4,5,6,-1” and ”10,9,8,7,-1” should now result in ”Yes”.

boolean sequential = true
boolean ended = false
int lastentry, current




println "Please input a number, I will tell you if they were consecutive when you enter -1: "
	lastentry = Integer.parseInt(System.console().readLine())


while (!ended) {
	println "Please input the next number: "
	current = Integer.parseInt(System.console().readLine())

		
		if (current == -1 || lastentry == -1) 
			{
			ended = true
			if (sequential == true) {
			println "Yes"
			} else {
			println "No"
			}
			}
			
		
		
		else if ((current == lastentry + 1 && sequential == true) || (current == lastentry - 1 && sequential == true)) // having the second part here means that if the boolean is ever turned false, it can never become true again
		{
		sequential = true
		lastentry = current
		} else {
		sequential = false

		}
			}
