public class Person {
	private String name;		
	private Person nextPerson;
	
	
	public Person(String name) {
		this.name = name;				
		this.nextPerson = null;		
		}
		

		
		public Person getNextPerson(){
				return nextPerson;
		}				
		
		public String getPersonName(){
				return name;
		}
		
		public void setPersonName(String n){
			this.name = n; 
		}
		
		public void setNextPerson(Person p) {
			this.nextPerson = p;
		}
	
		public void addBehind(Person person) {	//recursive method
				if (this.nextPerson==null)	{
					this.nextPerson=person;
				} else {
					this.nextPerson.addBehind(person);
				}
		}



	}	
	

		