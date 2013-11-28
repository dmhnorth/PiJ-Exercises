import java.util.Scanner;
import java.util.ArrayList;

public class ResUi implements Runnable{
	
	private static ArrayList completeTasks;
	
	private int taskDuration;
	private int id;

	public ResUi(int duration, int taskCount) {		
		taskDuration = duration;
		id = taskCount;
	}

	public StringBuffer printCompleteTasks() {
		StringBuffer completeTasksStr = new StringBuffer();
		
		for (int i = 0; i < completeTasks.size(); i++) {
			if (!completeTasks.get(i).equals(0) && completeTasks != null) {
				completeTasksStr.append(completeTasks.get(i) + ", ");	//could reorganise as a sout
			}
		} return completeTasksStr;
	} 
	

	
		
	@Override
	public void run() {		

		try	{
			Thread.sleep(taskDuration);

		}	catch (InterruptedException ex) {
			//Does nothing, just speeds things up
		}
		if (completeTasks == null) {
			completeTasks = new ArrayList();
		}
		completeTasks.add(id);
		


		System.out.println("Finished task (singleID): " + (id));
		System.out.println("List of finished tasks (ArrayList): " + printCompleteTasks());
		
		
	
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int taskCount = 0;
		
		while (taskCount < 10) {
			taskCount++;
			System.out.println("Enter a duration of " + taskCount + ": ");
			int taskDuration = sc.nextInt();
			ResUi resui = new ResUi(taskDuration, taskCount);
			Thread t = new Thread(resui);
			t.start();

			
		}
		sc.close();
	}

}