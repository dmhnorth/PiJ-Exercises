public class HospitalManager {

	//invisible constructor
	
	private Patient patientListStart = null;	//field within HospitalManager
		
		
	public void prettyPrint() {	//just a method defined in this program, not a class method as such
		Patient current = patientListStart;
		while (current != null) {
			System.out.println("There is currently a patient called " + current.getPatientName());			
			current = current.getNextPatient();
		}
	}

	public boolean deletePatient(Patient patient) {


        Patient current = patientListStart;



        do {
            Patient nextPatient = current.getNextPatient();

            if (current == null) { //empty list
                System.out.println("There are no patients in the list.");
                return false;
            }

            if (current == patient && patient.getNextPatient() == null && current == patientListStart) { //if only one in list WORKS
                patientListStart = null;

                return true;
            }

            if (current == patient && patient.getNextPatient() != null) { //if patient is first in list WORKS
                patientListStart = current.getNextPatient();
                System.out.println("First patient has been deleted.");
                return true;
            }

            if (patient == nextPatient) {
                Patient nextNextPatient = nextPatient.getNextPatient();
                current.setNextPatient(nextNextPatient);
                System.out.println(nextPatient.getPatientName() + " has been deleted.");
                return true;
            }

            if (current.getNextPatient() != null) {

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
	
	public void launch(){	//this is just a method

		Patient fliss = new Patient("Fliss", 21, "death");
		patientListStart = fliss;


		Patient joe = new Patient("Joe", 29, "beard");
		patientListStart.addPatient(joe);

		Patient olly = new Patient("Olly", 25, "is cold");
		patientListStart.addPatient(olly);	

		Patient keimi = new Patient("Keimi", 27, "flu");
		patientListStart.addPatient(keimi);

		Patient ludo = new Patient("Ludo", 40, "headache");
		patientListStart.addPatient(ludo);

		Patient ryan = new Patient("Ryan", 34, "loud");
		patientListStart.addPatient(ryan);

		Patient ringo = new Patient("Ringo", 50, "ringworm");
		patientListStart.addPatient(ringo);

		Patient slash = new Patient("Slash", 69, "shit hat");
		patientListStart.addPatient(slash);

		Patient sexPistols = new Patient("Sex Pistols", 40, "terrible");
		patientListStart.addPatient(sexPistols);

		Patient greenDay = new Patient("Green Day", 51, "embarrassing");
		patientListStart.addPatient(greenDay);


		System.out.println("Added some patients.");
		prettyPrint();	//is almost probably exactly like hm.prettyPrint();
		listLength();
		System.out.println("After deleting a few.");
		deletePatient(greenDay);	//almost probably exactly like hm.deletePatient();
		deletePatient(slash);
		deletePatient(ringo);
		deletePatient(fliss);
		prettyPrint();
		listLength();
	}
	
	public static void main(String[] args) {	//main method, when the class starts it does this

		HospitalManager hm = new HospitalManager();	//an instance of the HospitalManager
		hm.launch();	//method within Hospital manager
	}	
}
