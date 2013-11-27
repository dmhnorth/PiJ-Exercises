import java.util.Scanner;

public class ResUi implements Runnable{
	//class that counts as soon as created
	
	private static int taskCount;
	private static int taskDuration;
	private int id;

	public ResUi(int duration) {
		this.taskDuration = taskDuration;
		id = taskCount;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		while (taskCount < 10) {
			System.out.println("Enter a duration of " + taskCount + ": ");
			taskDuration = sc.nextInt();
			ResUi resui = new ResUi(taskDuration);
			Thread t = new Thread(resui);
			t.start();

			taskCount++;
		}
		sc.close();
	}
		
	@Override
	public void run() {
		
		try	{
			Thread.sleep(taskDuration);

		}	catch (InterruptedException ex) {
			//Does nothing, just speeds things up
		}
		//ADD FINISHED TASK TO AN ARRAY
		System.out.println("Finished tasks: " + (id));
		
		//program that asks for inputs until ten have been made
		
	
	}
}