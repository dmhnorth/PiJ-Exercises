public class Increaser implements Runnable {	//any object that implements runnable, has to have a run method
	private Counter c;
	
	public Increaser(Counter counter) {
		this.c = counter;
	}

	public static void main(String args[]) {
		Counter counter = new Counter();
		for (int i = 0; i < 100; i++) {
			Increaser increaserTask = new Increaser(counter);
			Thread t = new Thread(increaserTask);	//a class within Java that must contain a run method and implement runnable
			t.start();	//a method within the class Thread that activates any run() within an object that implements Runnable
		}
	}

	public void run() {	//this is a method of Increaser, implemented via runnable
		System.out.println("Starting at " + c.getCount());
		for (int i = 0; i < 1000; i++) {
			c.increase();
		}
		System.out.println("Stopping at " + c.getCount());
	}
//currently getting a different final answer everytime, need to put synchronized somewhere
}