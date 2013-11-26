//Works
//day-4-exercise-7 - Create your own version of boxed int! Create a class Integer2 with only one field (int value) and the following methods:
//getValue(): returns the value of this number as an int, a getter.
//getValue(int): a setter.
//isEven(): returns true if the number is even, false otherwise.
//isOdd(): the opposite.
//prettyPrint(): prints the value of the integer on the screen.
//toString(): returns a String equivalent to the number.
//There is some code to test whether the program works



class Integer2 {
	int value;
	
	int getValue() {	//So with each method, we must use the rule, return+name+parameters
		return value;
	}
	
	void setValue(int x) {
			this.value = x		//this literally refers to the object/instance that we are currently in
	}
								//to call on this value we use i2.getValue(i) -this is displayed below.
	int getAbsoluteValue() {	//for example, we define firstly the name and add the brackets because all methods must have parameters, then decide what the output needs to be. If a result is required we place that date type at the front, however if a result is not required we can use Void. 
		if (value > 0) {		//we then create the statements that act on the value
			return value;		//this returns one thing
		} else {
			return -value;		//this returns another
		}
	}
	
	boolean isEven() {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean isOdd() {			//this is an example of using the methods within the class
		return !isEven();
	}		
	
	String toString() {			//this doesn't require anything in the parameters. It literally just returns a string and that string is ""(nothing) + the value from this instance
		return "" + this.value;
	}
	
	String prettyPrint() {
		return value.toString()	
	}
}

Integer2 i2 = new Integer2();	//code to test if the class works
print "Enter a number: ";
String str = System.console().readLine();
int i = Integer.parseInt(str);
i2.setValue(i);
	print "The number you entered is "
if (i2.isEven()) {
	println "even.";
} else if (i2.isOdd()) {
	println "odd.";
} else {
	println "undefined!! Your code is buggy!";
}
int parsedInt = Integer.parseInt(i2.toString());
if (parsedInt == i2.getValue()) {
	println("Your toString() method seems to work fine.");
}