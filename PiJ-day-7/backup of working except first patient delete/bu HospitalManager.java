public class HospitalManager {

	//invisible constructor

	private Patient patientListStart = null;	//field within HospitalManager


    public void prettyPrint() {	//just a method defined in this program, not a class method as such
        Patient current = patientListStart;
        Patient printEnd = patientListStart.getNextPatient();

        while (printEnd.getNextPatient() != patientListStart.getNextPatient()) {
            printEnd = printEnd.getNextPatient();

        }

        while (current != printEnd) {
            System.out.println("There is currently a patient called " + current.getPatientName());
            current = current.getNextPatient();
        } System.out.println("There is currently a patient called " + current.getPatientName());
    }


    public void addPatient(Patient newPatient) {

        if (patientListStart == null) {         //empty list
            patientListStart = newPatient;
            patientListStart.setNextPatient(newPatient); 
            System.out.println("You have created a new patient list with one patient: " + newPatient.getPatientName());


        } else {
            Patient current = patientListStart;
            boolean ended = false;

        do {
                Patient nextPatient = current.getNextPatient();

                if (nextPatient.getNextPatient() == patientListStart.getNextPatient()) {
                    current.getNextPatient().setNextPatient(newPatient);
                    newPatient.setNextPatient(patientListStart.getNextPatient());
                    System.out.println("You have added a new patient to the list: " + newPatient.getPatientName());
                    return;
                }
                current = current.getNextPatient();



            } while (!ended);
        }
    }







    public boolean deletePatient(Patient patient) {


        Patient current = patientListStart;



<<<<<<< HEAD:backup of working except first patient delete/bu HospitalManager.java
        do {
            Patient nextPatient = current.getNextPatient();

            if (patientListStart == null) { //empty list
                System.out.println("There are no patients in the list.");
                return false;
            }

            if (patientListStart == patient && patientListStart.getNextPatient() == patient) { //if only one in list
                patientListStart = null;
                System.out.println("The list has been deleted as there was only one patient.");
                return true;

            }
      /*      
            if (patient == nextPatient && patient == patientListStart.getNextPatient()){	//delete first patient, maybe redefine the way I add patient so that they are pushed forward instead of added at the front?
				current.getNextPatient().setNextPatient(patientListStart.getNextPatient().getNextPatient());
				System.out.println("The first patient has been deleted");
			
            }
	*/
            if (patient == nextPatient) {
                Patient nextNextPatient = nextPatient.getNextPatient();
                current.setNextPatient(nextNextPatient);
                System.out.println(nextPatient.getPatientName() + " has been deleted.");
                return true;
            }
            current = current.getNextPatient();


        //System.out.println("Infinite loop if repeated infinite times...");
        } while (current != null);
=======
        if (current.getNextPatient() == patientListStart) {               //deletes first doesn't work
            patientListStart = patientListStart.getNextPatient();
			current.setNextPatient(patientListStart);
            System.out.println("You have deleted the first patient in the list.");
            return true;
        }
       

        if (patient == nextPatient) {	//use current.getnextpatient instead of creating this new one
            Patient nextNextPatient = nextPatient.getNextPatient();
            current.setNextPatient(nextNextPatient);
            System.out.println(nextPatient.getPatientName() + " has been deleted.");
            return true;
        }
        current = current.getNextPatient();
    } while (current != null);
>>>>>>> ad05422f2a7b444e67582b632daaf6e5c3864c1d:day-7-exercise-6/HospitalManager.java
        return false;
    }
	
	public void listLength() {
		Patient current = patientListStart;
		int counter = 0;

        Patient countEnd = patientListStart.getNextPatient();

        while (countEnd.getNextPatient() != patientListStart.getNextPatient()) {
            countEnd = countEnd.getNextPatient();

        }

        while (current != countEnd) {
			current = current.getNextPatient();
			counter++;
		} counter = counter + 1;
		System.out.println("There are currently " + counter + " patients in the Hospital List.");
	}
	
	public void launch(){	//this is just a method

		Patient fliss = new Patient("Fliss", 21, "death");
		addPatient(fliss);


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
		System.out.println("After deleting a few.");
		deletePatient(greenDay);	//almost probably exactly like hm.deletePatient();
		deletePatient(slash);
		deletePatient(ringo);
        prettyPrint();
		System.out.println("After deleting Fliss, the first patient...");
        deletePatient(fliss);
		prettyPrint();
		listLength();
	}
	
	public static void main(String[] args) {	//main method, when the class starts it does this

		HospitalManager hm = new HospitalManager();	//an instance of the HospitalManager
		hm.launch();	//method within Hospital manager
	}	
}
