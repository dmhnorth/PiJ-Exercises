public class ArrayCopier {	//no fields required here because nothing needs to be kept here
							//USE AS FEW FIELDS AS POSSIBLE - SERGIO
	
	public ArrayCopier(){	//this is the constructor method that initialises the memory for anything within a new instance of arraycopier
	}											//can be used to remember last operation
	
	public static int[] copy(int[] src) {	//Static creates this method within the Heap as soon as this class is reserved in memory. 
											//could be used for something that is the same across all instances of this class. However if this method needs to be used in relation to the 'member variables' of an instance, then it can't be used like this.
		int i = src.length;	
		int[] dst = new int[i];	//declares and initialises a new space in the heap the same size as the src array VITAL
		for (int y = 0; y < i; y++) {	//This will go through and copy the details of the array
		dst[y] = src[y];	//using the ref just made above
		}
		return dst;
	}	
}		