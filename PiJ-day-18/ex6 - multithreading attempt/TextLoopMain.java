import java.util.concurrent.Executor;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ExecutorService;	//importing all the executor classes

public class TextLoopMain {

public static void main(String args[]) {
		
		NiceExecutor myEx1 = new NiceExecutor();
		
		if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
			System.out.println("USAGE: java TextLoop <mode>");
			System.out.println(" mode 0: without threads");
			System.out.println(" mode 1: with threads");
		} else if (args[0].equals("0")) {
			for (int i = 0; i < 10; i++) {
				Runnable r = new TextLoop("Thread " + i);
				r.run();
			}
		} else {
			for (int i = 0; i < 10; i++) {
				Runnable r = new TextLoop("Thread " + i);
				myEx1.addTask(r);
				
			} myEx1.executeTask();
		}
	}
	
}