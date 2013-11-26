public class SupermarketQueue implements PersonQueue {
	
	private Person queueStart = null;
	private String name;
	public int queueCount;
	
		SupermarketQueue (String name) { //constructor purely to create queue names
			this.name = name;
		}

		public String getQueueName() {	//queues now have names and you retrieve with this
			return this.name;
		}

		public void insert(Person person) {
			
			if (queueStart==null) {
				queueStart = person;
			} else {
				queueStart.addBehind(person);
			}
		}
	
		public Person retrieve() {
			if (queueStart.getNextPerson()==null) {	//if empty queue
					return null;
			} else {
				Person result = queueStart;
				queueStart.setNextPerson(queueStart.getNextPerson().getNextPerson());
				return result;
			}
		}

		public int queueSize() {
			int result = 0;
			Person next = queueStart;
			boolean finished = false;
			while (!finished) {
				if (next != null) {
					result++;
					next = next.getNextPerson();
			} else {
				finished = true;
			} 
			} return result;
		}

		public Person getQueueStart() {
			return queueStart;
		}

}