//Works
//except doesn't print the commas out separating numbers, however this isn't necessary as it would be used for calculations
//exercise 11 day 2 - Write a program that reads a number with commas and decimal dots (such as “23,419.34”) and then prints a number that is half of it. Do not use Double.parseDouble(). If you were writing a simple spreadsheet, you could use this code to parse the input in the cells.


String userEntry = "", strstore = "", storeDec = ""
int current, store = 0, calcstoreDec = 0, calcstore = 0, firstnum = 0

print "This program will halve a number without using the parseDouble method, enter a 'real' number, using any symbols you like: "
userEntry = System.console().readLine()



for (int i = 0; i < userEntry.length(); i++) {	//while the brackets isn't true, curls will be executed
	String addnum = userEntry.charAt(i)
	
	if (Character.isDigit(userEntry.charAt(i))) //currently a number must be entered first
	{
	strstore = strstore + addnum
	store = Integer.parseInt(strstore)
	//println strstore
	
	} else if (userEntry.charAt(i) == ".") {
		firstnum  = Integer.parseInt(strstore)	
		strstore = ""
	
	} else {
		println "junked character: " + userEntry.charAt(i)
		}
	
	}
	println firstnum = firstnum / 2
	println store = store / 2
	println "Half the number you typed was: " + firstnum + "." + store