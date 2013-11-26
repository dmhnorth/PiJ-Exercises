public class Comparator {
	
	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}
	
	public int getMax(int n, int m) {
		
		double d1 = (double) n;
		double d2 = (double) m;		
		int result = (int) getMax(d1, d2); //this must be cast to an int in order to disregard the decimal
		return result; 
		
	}
			
	public String getMax(String number1, String number2) {
		double n1 = Double.parseDouble(number1);
		double n2 = Double.parseDouble(number2);						
		
		return Double.toString(getMax(n1, n2));
	}
	
	public static void main(String[] args) {
	   int i1 = 3;
	   int i2 = 5;
	   String s1 = "3";
	   String s2 = "5";
	   double d1 = 3;
	   double d2 = 5;
	   Comparator c = new Comparator();
	   System.out.println("Int getMax = " + c.getMax(i1, i2));
	   System.out.println("String getMax = " + c.getMax(s1, s2));
	   System.out.println("Double getMax = " + c.getMax(d1, d2));
       }
}