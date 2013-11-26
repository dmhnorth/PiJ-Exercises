//Works
//Binary and decimal program that converts strings and decimals


class BinaryCalculator {
	

	String binary2decimal(String str) {
		String decimalResult = "Nothing calculated"
		int decimalResultInt = 0;
		int scan = str.length() - 1;	//maybe this should be calculated differently, using a minus.length within the loop?
		int count = 0

		while (scan >= 0) {	//the multplier is dictated by scanning both ends 
			if (str.charAt(count) == "1") {
				decimalResultInt = decimalResultInt + (1 * 2 ** scan); //the math here is right
				scan = scan - 1;
				count = count + 1;
			} else {
				scan = scan - 1;
				count = count + 1;
			}
		}
		
		decimalResult = decimalResultInt
		return decimalResult
	}

	String decimal2binary(int x) {	
		String binaryresult = ""
	
	
			while(x != 0) {
				if (x % 2 == 1) {
			
				binaryresult = 1 + binaryresult	//This should just add the int of the remainder, not a string
				x = x / 2
		
			} else {
				binaryresult = 0 + binaryresult
				x = x / 2
				println "I went through here"
			}
		}
		return binaryresult
	}	
}

//Program starts here...

boolean ended = false
BinaryCalculator calc1 = new BinaryCalculator()

while (!ended) {
print "Please enter a number or some binary. This program is for converting either way: "
	String userEntry = System.console().readLine();
	int userEntryInt = Integer.parseInt(userEntry);
println "The string entered is " + userEntry
println "The Integer entered is " + userEntryInt
println "Please enter a choice:" 
println "1 to convert binary2decimal" 
println "2 to convert decimal2binary"
println "3 to end the program: "
	
	int choice = Integer.parseInt(System.console().readLine())
switch (choice) {

	case 1:
		println "Your decimal value is: " + calc1.binary2decimal(userEntry)	//input is a string
	break;
	
	case 2:
		println "Your binary value is: " + calc1.decimal2binary(userEntryInt);	//somethings wrong here
	break;
	
	case 3:
		println "You have exited the program."		
		ended = true
	break;

	default:
		println "That is not a recognised response."
		ended = true	
	break;
	}
}
