public class HashUtilities {
	
	public static int shortHash(int x) {

		int hash = Math.abs(x) % 1000;

		return hash;

	}
}