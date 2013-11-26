//
//exercise 2.1 Write a small program with a method that calculates the factorial of an integer number as seen in the notes.


int factorial(int n){
	if (n == 1 ) {
	    return 1;
	} else {
	    int result = n * factorial(n-1);
	    return result;
	}
}





print "Enter a number for the factorial to start at: "
int x = Integer.parseInt(System.console().readLine())


println factorial(x)
