//works!
//Write a program that reads some text from the user and then says how many ent2ters ’e’ are there in that text. Then modify the program so that it reads the text from the user and then asks for a ent2ter. The program should then say how many times you can find the ent2ter in the text.


String ent2 = "";
String ent1 = "";
String ent2Chk = "";
int chcnt



print "Enter a string and I will tell you how many times it occurs in the second string: "
ent1 = System.console().readLine()
println "Now enter the string you would like to find occurence of in string one: "
ent2 = System.console().readLine()



for (int i = 0; i < ent2.length(); i++) {
	//System.out.println("i is currently: " + i);

	try {
	if (ent2.substring(i, i + ent1.length()) == ent1) {
		chcnt++;
		System.out.println(ent2.substring(i, ent1.length()) + " matched: " + chcnt + " times so far.")
		
	} else {
		//System.out.println(ent2.substring(i, ent1.length()) + " doesn't match.")
	}
	} catch (Exception ex) {
		System.out.println("...just catching out of bounds checks...");
	}
/*
	if (ent2Chk == ent1) {	//final check for a string, works
		
		chcnt++;
		System.out.println("ent2Chk matched: " + ent2Chk + " " + chcnt + " times so far.")
		ent2Chk = "";
			} 

	}
	
*/

	}
	println "There are " + chcnt + " occurences of the string: " + ent1 + ", in the string: " + ent2