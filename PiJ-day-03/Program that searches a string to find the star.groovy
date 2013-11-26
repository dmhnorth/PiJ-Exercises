double input1, input2, output
String opInput = "default", inputText
int len, operationPos = 0, searchFrom, searchTo	= 0//operation pos is the type of character it is looking for
println "\nPlease enter a mathematical operation: "	//\n starts a newline in a string

inputText = System.console().readLine()
len = inputText.length()
searchFrom = len - 1	//This is -1 because the length would just give you the coordinate just after the last character

while (operationPos == 0){		
	searchFrom = searchFrom - 1	//So the searchFrom, (which was previously designated as the len -, which was in turn the input text length)is the last coordinate of the substring, dependant on how long it was obviously
	searchTo = searchFrom + 1	//this is added to each time so SearchTo is actually a step ahead of the search. This is effectively pushed by the changing of searchfrom with every loop
	println inputText.substring(searchFrom, searchTo)	//this prints the search backwards from the end of the project
	if (inputText.substring(searchFrom, searchTo) == "*") {		//So this looks at a substring that equals just one character
		println "found star, pos: " + searchFrom + ", " + searchTo	//this explicitly prints the coordinates of the star
		operationPos = searchFrom	//This then designates the position of the operator for use later in the program
	}
}


