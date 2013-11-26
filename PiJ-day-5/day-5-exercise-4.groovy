//Works - EXCEPT if the answer IS a FIVE letter palindrome
//exercise 4 - day 5 - uses a recursive method to determine if a word is a palindrome


class PalinCalc {

	boolean palindrome(String str) {	//so the idea is that it'll grab the first and last of a string and then cut them off and invoke the string again. If it can keep doing this it returns true, if it gets held up it returns false.
		int stringstartInt = 0
		int stringendInt = str.length() - 1
		int counter = 0
		int middleLetter = (str.length() / 2)

		if ((counter == str.length() - 1)|| str.charAt(counter) == str.charAt(middleLetter + 1)) {//base case required here to halt the method before it invokes the next again. a counter that counts to the end of the word maybe
			return true;
		}

		else if (str.charAt(0) == str.charAt(str.length() - 1)) {
			String nextstr = str.substring(stringstartInt + 1, stringendInt - 1)
			counter = counter + 1
			palindrome(nextstr);
			} else {
				return false;
			}
		}

	}

	
	



//Program starts here

boolean palindromeresult = true
PalinCalc calc1 = new PalinCalc()

println "Please enter some text and I will tell you if it is a Palindrome using a recursive method: "
String userEntry = System.console().readLine();

palindromeresult = calc1.palindrome(userEntry)
	if (palindromeresult) {
	println userEntry + " is a Palindrome."	
	} else {
		println userEntry + " is not a Palindrome."
	}

