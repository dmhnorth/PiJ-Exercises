public class CommandLineCalc {


	public String calculate(String userEntry) {
	
		String num1str = "";
		int num1 = 0, num2 = 0;


                               //change to StringBuffer
		


		for (int i = 0; i < userEntry.length(); i++) {
			if (Character.isDigit(userEntry.charAt(i))) {
					num1str = num1str + userEntry.charAt(i);
			} else if (userEntry.charAt(i) == ' ')
			{
					//this is purely an exception so spaces are ignored
			} else
			{
					num1 = Integer.parseInt(num1str);
					num1str = "";
			}

		}
	num2 = Integer.parseInt(num1str);

	String answer = "End";

	
	for (int y = 0; y < userEntry.length(); y++) {
			if (userEntry.charAt(y) == '+') {
							answer =("The answer is " + num1 + " + " + num2 + " = " + (num1 + num2));
			} else if (userEntry.charAt(y) == '-') {
							answer =("The answer is " + num1 + " - " + num2 + " = " + (num1 - num2));
			} else if (userEntry.charAt(y) == '*') {
							answer =("The answer is " + num1 + " * " + num2 + " = " + (num1 * num2));
			} else if (userEntry.charAt(y) == '/') {
							answer =("The answer is " + num1 + " / " + num2 + " = " + (num1 / num2));
			}
		}
	return answer;
	}
}