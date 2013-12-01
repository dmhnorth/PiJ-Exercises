import java.util.Scanner;


public class RelaxPalin {





	public void launch() {

	Scanner sc = new Scanner(System.in);


	String userEntry = "";
	StringBuffer breakdown = new StringBuffer();
	String breakdownRev = "";
	String breakdownStr = "";

	System.out.println("This program will tell you if your entry is a relaxed Palindrome.");
	System.out.println("Please enter a String: ");
	userEntry = sc.nextLine();

		System.out.println(userEntry + " was the userEntry.");

			for (int i = 0; i < userEntry.length(); i++) {
				if (Character.isLetter(userEntry.charAt(i))) {
					breakdown.append(userEntry.charAt(i));
				}
				System.out.println(breakdown);
			}


		breakdownStr = breakdown.toString();
		breakdownRev = breakdown.reverse().toString();

		System.out.println("breakdownRev: " + breakdownRev + ", breakdownStr: " + breakdownStr);

		if (breakdownStr.equals(breakdownRev)) {
			System.out.println("Yeah, '" + userEntry + "' is totally a relaxed Palindrome.");
				} else {
					System.out.println("Nope, '" + userEntry + "' is well not a relaxed Palindrome.");
				}




	}


	public static void main(String[] args) {

		
		
		RelaxPalin rp = new RelaxPalin();
		rp.launch();

	}

}