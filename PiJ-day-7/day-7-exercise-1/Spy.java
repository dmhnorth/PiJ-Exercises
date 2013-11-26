public class Spy {
	public static int spyCount = 0;
	private int ID = 0;
	
		public Spy(){
			spyCount++;
			ID = spyCount;
			System.out.println("You have created a new spy with the ID " + ID);
			System.out.println("There are currently " + spyCount + " Spies");
		}	
		
		private void die() {
			spyCount = spyCount - 1;
			System.out.println("Spy " + this.ID + " has been detected and elmininated.");
			System.out.println("There are currently " + spyCount + " Spies");
		}
	
public static void main(String[] args) {

	Spy fliss = new Spy();
	System.out.println("You have created a new spy with the ID " + fliss.ID);
	Spy joe = new Spy();
	System.out.println("You have created a new spy with the ID " + joe.ID);
	
	joe.die();
	fliss.die();
	}

}
