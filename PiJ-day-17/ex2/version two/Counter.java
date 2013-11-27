public class Counter {
	private int n = 0;
	
	public synchronized void increase() {
	n = n + 1;
	}

	public int getCount() {
	return n;
	}
}
