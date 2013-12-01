//works!
//Write a program that reads some text from the user and then says how many ent2ters ’e’ are there in that text. Then modify the program so that it reads the text from the user and then asks for a ent2ter. The program should then say how many times you can find the ent2ter in the text.


String ent2 = "";
String ent1 = "";
String ent2Chk = "";
String prevLetter = "";
int chcnt
boolean ended = false;

println "Enter the string you would like to find letters in: "
ent2 = System.console().readLine()
println "Enter a letter or string and I will tell you how many times it occurs in the first string: "
ent1 = System.console().readLine()



while (!ended) {

prevLetter = ent1;



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

	}	
	println "There are " + chcnt + " occurences of: " + ent1 + ", in the string: " + ent2


	chcnt = 0;
	print "Enter a new letter to check for (Previous again to exit): "
	ent1 = System.console().readLine()

		if (ent1 == prevLetter) {
			System.out.println("Thanks for playing!");
			ended = true;
		}


	


}