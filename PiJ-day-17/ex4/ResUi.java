import java.util.Scanner;
import java.util.ArrayList;

public class ResUi implements Runnable{
	//class that counts as soon as created
	
	private static int taskCount;
	private static int taskDuration;
	private static ArrayList completeTasks;
	private int id;

	public ResUi(int duration) {
		this.taskDuration = taskDuration;
		id = taskCount;
	}

	public StringBuilder printCompleteTasks() {
		StringBuilder completeTasksStr = new StringBuilder();
		
		for (int i = 0; i < completeTasks.size(); i++) {
			if (!completeTasks.get(i).equals(0) && completeTasks != null) {
				completeTasksStr.append(completeTasks.get(i) + ", ");	//could reorganise as a sout
			}
		} return completeTasksStr;
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
		//ARRAY FOR COMPLETE TASKS
		if (completeTasks == null) {
			completeTasks = new ArrayList();
		}
		completeTasks.add(id);
		


		System.out.println("Finished task (singleID): " + (id));
		System.out.println("List of finished tasks (ArrayList): " + printCompleteTasks());
		
		//program that asks for inputs until ten have been made
		
	
	}
}