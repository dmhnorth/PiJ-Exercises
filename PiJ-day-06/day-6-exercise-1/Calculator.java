public class Calculator {
	
	public Calculator(){
	}
	

	public int add(int x, int y) {	//addition
		int z = x + y;				//I do not need private within these as they are contained within the scope of the method
		return z;
	}
	
	public int subtract(int x, int y) {	//subtract
		int z = x - y;
		return y;
	}
		
	public int multiply(int x, int y) { //multiply
		int z = x * y;
		return z;
	}
		
	public double divide(int x, int y) { //divide
		if (y == 0) {
			return 0;
		}
		double xx = (double) x;
		double yy = (double) y;
		double z = xx / yy;
		return z;
	}	

	public int modulus(int x, int y) { //modulo
		int z = x % y;
		return z;
	}
	
	
}
	

	