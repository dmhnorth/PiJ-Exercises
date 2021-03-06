import java.util.concurrent.Executor;
import java.lang.Exception.*;
import java.util.ArrayList;

public class NiceExecutor implements Executor {

	ArrayList<Runnable> tasks = new ArrayList<Runnable>();
	//need to initialise the amount of threads here?
	
	
	//Runs a task
	public synchronized void execute(Runnable task){
	
	try {
		
			task.run();	
	
		} catch (Exception ex) {
			System.err.println("This task can't be accepted!");
		}
	}
	
	
	//loop that executes every task in the ArrayList. using a for loop
	public synchronized void executeTask(){
	
	try {
		
		for (Runnable t:tasks)
		{
			execute(t);
			
		} System.out.println("executeTask method has completed a time");
	
		} catch (Exception ex) {
			System.err.println("This task can't be accepted!");
		}
	}
	
	
	//adds each task to the ArrayList
	public void addTask(Runnable task) {
	
		tasks.add(task);
	}
	
	
}	