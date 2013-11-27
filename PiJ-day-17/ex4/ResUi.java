import java.util.Scanner;

public class ResUi implements Runnable{
	//class that counts as soon as created
	
	private taskCount = 0;


	public static void main(String[] args) {
		Scanner sc = new scanner(System.in);
		
		
		
		while (taskCount < 11) {
			System.out.println("Enter a duration: ");
			ResUi resui = new Resui(sc.nextInt());
			Thread t = new Thread(resui);
			t.start();
		}
	}
		
		
	public void run() {
		
		
		//program that asks for inputs until ten have been made
		
	
	}
}