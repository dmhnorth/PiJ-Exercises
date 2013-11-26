public class Supermarket {
	
	private SupermarketQueue q1 = new SupermarketQueue("Queue 1");
	private SupermarketQueue q2 = new SupermarketQueue("Queue 2");
	private SupermarketQueue q3 = new SupermarketQueue("Queue 3");

		public void addPersonToQueue(SupermarketQueue queue, Person person) {
			queue.insert(person);
			System.out.println("You have added " + person.getPersonName() + " to the queue " + queue.getQueueName() + ".");
		}

		public void servePersonInQueue(SupermarketQueue queue) {
			queue.retrieve();
			System.out.println("The person now at the front of " + queue.getQueueName() + " is " + queue.getQueueStart().getPersonName());
		}
	




			



public static void main(String[] args) { //program head
	
	Supermarket mozzas = new Supermarket();
	mozzas.launch();	//launches program within the program
	}
	

	public void launch() {

		System.out.println("Queue 3 length: " + q1.queueSize());
		System.out.println("Queue 2 length: " + q2.queueSize());
		System.out.println("queue 3 length: " + q3.queueSize());
		System.out.println("adding some people...");
		
		Person aaron = new Person("Aaron");
		addPersonToQueue(q1, aaron);
		Person abi = new Person("Abi");
		addPersonToQueue(q2, abi);
		Person ackery = new Person("Ackery");
		addPersonToQueue(q3, ackery);

		System.out.println("Queue 3 length: " + q1.queueSize());
		System.out.println("Queue 2 length: " + q2.queueSize());
		System.out.println("queue 3 length: " + q3.queueSize());
		System.out.println("after adding one person to each...");

		Person barry = new Person("Barry");
		addPersonToQueue(q1, barry);
		Person bernie = new Person("Bernie");
		addPersonToQueue(q2, bernie);
		Person bubsy = new Person("Bubsy");
		addPersonToQueue(q3, bubsy);

		System.out.println("Queue 3 length: " + q1.queueSize());
		System.out.println("Queue 2 length: " + q2.queueSize());
		System.out.println("queue 3 length: " + q3.queueSize());
		System.out.println("after adding another person to each...");

		servePersonInQueue(q1);
		servePersonInQueue(q2);
		System.out.println("Queue 3 length: " + q1.queueSize());
		System.out.println("Queue 2 length: " + q2.queueSize());
		System.out.println("queue 3 length: " + q3.queueSize());
		System.out.println("after serving a person in queue 1 and 2 but not three...");		

		servePersonInQueue(q3);
		System.out.println("Queue 3 length: " + q1.queueSize());
		System.out.println("Queue 2 length: " + q2.queueSize());
		System.out.println("queue 3 length: " + q3.queueSize());
		System.out.println("after serving a person in queue 3...");			
	}


}
