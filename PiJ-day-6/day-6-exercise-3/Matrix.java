public class Matrix {
	private int [][] matrix;
	

	Matrix(int row, int col){ //constructor method
		matrix = new int[row][col];
	
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = 1;
			}
		}

	}

	public void setElement(int row, int col, int value) { //for setting 
		boolean ended = false;
		
		if (row < matrix.length && col < matrix[0].length) {
			this.matrix[row][col] = value;
			System.out.println("Your setElement() to " + value + " was carried out.");
			
			
		} else {
			System.out.println("Your setElement(parameters) for change of value " + value + " is out of bounds.");
			System.out.println();
		}
	}

public void setRow (int row, String userEntry) {
		
			
	if (row < matrix.length) { //checks row size is valid
			
		String entryParse = "";
		int strEntryCounter = 0;		
		String lastEntryParse = "";
	
			for (int i = 0; i < userEntry.length(); i++) {
				
				if (Character.isDigit(userEntry.charAt(i))) {
					entryParse =  entryParse + userEntry.charAt(i);
				} else {
					int x = Integer.parseInt(entryParse); //where the current string entry is parsed and set				
					setElement(row,strEntryCounter,x);
					strEntryCounter++;					
					entryParse = ""; 	
					}								
				}
				int x = Integer.parseInt(entryParse); //catches last entry
				setElement(row,strEntryCounter,x); //instead of>> this.matrix [row][strEntryCounter] = x;
				strEntryCounter++;					
				System.out.println("Your row change should be filled successfully.");
				
		 
	
	} else {
			System.out.println("Your row is out of bounds. setRow was not carried out.");
			}
		
	}


public void setColumn (int col, String userEntry) {
		
			
	if (col < matrix[0].length) { //checks row size is valid
			
		String entryParse = "";
		int strEntryCounter = 0;		
		String lastEntryParse = "";
	
			for (int i = 0; i < userEntry.length(); i++) {
				
				if (Character.isDigit(userEntry.charAt(i))) {
					entryParse =  entryParse + userEntry.charAt(i);
				} else {
					int x = Integer.parseInt(entryParse); //where the current string entry is parsed and set				
					setElement(strEntryCounter,col,x);
					strEntryCounter++;					
					entryParse = ""; 	
					}								
				}
				int x = Integer.parseInt(entryParse); //catches last entry
				setElement(strEntryCounter,col,x); //instead of>> this.matrix [row][strEntryCounter] = x;
				strEntryCounter++;					
				System.out.println("Your column change should be filled successfully.");
				
		 
	
	} else {
			System.out.println("Your column is out of bounds. setRow was not carried out.");
			}
		
	}
/*
	public void toString() {
	}
*/


	public void prettyPrint() {
	
	int rows = this.matrix.length;
	int columns = this.matrix[0].length;

	System.out.println("\nHere is a printout of your matrix:");
		for (int i = 0; i < rows; i++) {
    		for (int j = 0; j < columns; j++) {
        		System.out.print(matrix[i][j] + " ");
    		}
    	System.out.print("\n");
		}
	}
	


}
