public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient prevPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.prevPatient = null;
		}
		

		
		public Patient getNextPatient(){
				return nextPatient;
		}
		
		public Patient getPrevPatient(){
				return prevPatient;
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
	
		public void setPrevPatient(Patient p) {
			this.prevPatient = p;
		}
	}	
	

		