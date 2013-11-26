// WORKS
// exercise 12 - Write a program that output a number piramid
// currently requires the ability to move to the next line after printing the right amount of numbers

int cur = 1, prtcnt = 0
String curstring = cur


while (cur < 8) {
		if (prtcnt != cur)		//we are counting how many times the 
		{
		print curstring.substring(0)
		prtcnt++
		} else {
	prtcnt = 0
	cur++
	curstring = cur
	//print "\n"	//this command is effectively just printing the command 'move to the next line'
	println ""		//it works the same as this does
	
				}
}