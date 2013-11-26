public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		}
		
		public void addPatient(Patient newPatient) {
			if(this.nextPatient == null) {
				this.nextPatient = newPatient;
			} else {
			this.nextPatient.addPatient(newPatient);//other methods go here
			}
		}
		
		public Patient getNextPatient(){
				return nextPatient;
		}

		public String getPatientName(){
				return name;
		}
		
		public void setPatientName(String n){
			this.name = n; 
		}
		
		public void setNextPatient(Patient p) {
			this.nextPatient = p;
		}
	}
		
		

		