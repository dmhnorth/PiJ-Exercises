public class HospitalManager {

	//invisible constructor
	
	private Patient patientListStart = null;	//field within HospitalManager
		
		
	public void prettyPrint() {	//methods within HospitalManager
		Patient current = patientListStart;
		while (current != null) {
			System.out.println("There is currently a patient called " + current.getPatientName());			
			current = current.getNextPatient();
		}
	}

	public void revPrettyPrint() {
		Patient currentPrint = patientListStart;
		while (currentPrint.getNextPatient() != null) {
			currentPrint = currentPrint.getNextPatient();
		}



			do {
			System.out.println("In reverse, there is currently a patient called " + currentPrint.getPatientName());
			currentPrint = currentPrint.getPrevPatient();

		} while (currentPrint != patientListStart.getPrevPatient());

	}	
	
	

	public boolean deletePatient(Patient patient) { //everything except first works


		Patient current = patientListStart;


		do {
			if (current == null) { //empty list
				System.out.println("There are no patients in the list.");
				return false;
			}

			if (current.getPatientName().equals(patient.getPatientName()) && patient.getPrevPatient() == null && patient.getNextPatient() == null) { //if only one in list
				patientListStart = null;
				return true;
			}

			if (current.getPatientName().equals(patient.getPatientName()) && patient.getPrevPatient() == null && patient.getNextPatient() != null) { //if patient is first in list
				patientListStart = patient.getNextPatient();
				return true;
			}

			if (current.getPatientName().equals(patient.getPatientName()) && patient.getPrevPatient() != null && patient.getNextPatient() == null) {//if patient is last in list
				patient.getPrevPatient().setNextPatient(null);
				return true;
			}
			if (current.getPatientName().equals(patient.getPatientName()) && patient.getPrevPatient() != null && patient.getNextPatient() != null) { //general case
				patient.getPrevPatient().setNextPatient(patient.getNextPatient());
				patient.getNextPatient().setPrevPatient(patient.getPrevPatient());
				return true;
			}

			current = current.getNextPatient();
		
		} while (current != null);
	return false;
	}


	
	public void listLength() {
		Patient current = patientListStart;
		int counter = 0;
		while (current != null) {			
			current = current.getNextPatient();
			counter++;
		}
		System.out.println("There are currently " + counter + " patients in the Hospital List.");
	}
	
		
	public void addPatient(Patient newPatient) {	
		Patient current = patientListStart;
		
		if (current == null) {	//takes into account empty list
			patientListStart = newPatient;
			}
		while (current.getNextPatient() != null){ //gets us to the end of the list
			current = current.getNextPatient();
			}
			current.setNextPatient(newPatient);	//we set the patients details here
			newPatient.setPrevPatient(current);
				
			
		}
	
	
	
	
	
	public void launch(){	//this is just a method

		Patient fliss = new Patient("Fliss", 21, "death");
		patientListStart = fliss;


		Patient joe = new Patient("Joe", 29, "beard");
		addPatient(joe);

		Patient olly = new Patient("Olly", 25, "is cold");
		addPatient(olly);	

		Patient keimi = new Patient("Keimi", 27, "flu");
		addPatient(keimi);

		Patient ludo = new Patient("Ludo", 40, "headache");
		addPatient(ludo);

		Patient ryan = new Patient("Ryan", 34, "loud");
		addPatient(ryan);

		Patient ringo = new Patient("Ringo", 50, "ringworm");
		addPatient(ringo);

		Patient slash = new Patient("Slash", 69, "shit hat");
		addPatient(slash);

		Patient sexPistols = new Patient("Sex Pistols", 40, "terrible");
		addPatient(sexPistols);

		Patient greenDay = new Patient("Green Day", 51, "embarrassing");
		addPatient(greenDay);


		System.out.println("Added some patients.");
		prettyPrint();	//is almost probably exactly like hm.prettyPrint();
		listLength();
		revPrettyPrint();
		System.out.println("Slash's previous patient is " + slash.getPrevPatient().getPatientName());
		System.out.println("After deleting a few.");
		deletePatient(greenDay);	//almost probably exactly like hm.deletePatient();
		deletePatient(ryan);
		deletePatient(ringo);
		deletePatient(fliss);
		System.out.println("I have deleted, Green Day, Ringo, Fliss and Ryan.");
		System.out.println("Slash's previous patient is " + slash.getPrevPatient().getPatientName());
		prettyPrint();
		listLength();
		System.out.println("Slash's previous patient is " + slash.getPrevPatient().getPatientName());
		revPrettyPrint();
		
	}
	
	public static void main(String[] args) {	//main method, when the class starts it does this

		HospitalManager hm = new HospitalManager();	//an instance of the HospitalManager
		hm.launch();	//method within Hospital manager
	}	
}

