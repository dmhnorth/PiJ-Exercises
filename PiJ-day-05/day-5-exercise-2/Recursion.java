public class Recursion{



	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			int result = n * factorial(n-1);
			return result;
		}
	}


	public static int fibonacci(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			int result = fibonacci(n-1) + fibonacci(n-2); //method calls itself
			return result;
		}
	}
/*
	public static int hanoi(int n) {
		if (n == 1) {
			return 1;
		} else {

		}
	}
*/

	public static int pow(int x, int y) {
		if (y == 0) {
			return 1;
		} else if (y == 1) {
			return x;

		} else {
            return  x * pow(x, y - 1);
        }
	}


public static void main(String[] Args) {

System.out.println(Recursion.factorial(4));
System.out.println(Recursion.fibonacci(7));
System.out.println(Recursion.pow(2,4));

}


}