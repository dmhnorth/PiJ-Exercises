

int[] firstArray;
firstArray = new int[4];
firstArray[0] = 10;
firstArray[1] = 15;
firstArray[2] = 20;
firstArray[3] = 25;

System.out.println("Second entry in the first array is " + firstArray[1]);

//System.out.println ("Please use the array copier to create and name a copy of the array! invoke using ArrayCopier.copy(int[]): ")
int[] secondArray = ArrayCopier.copy(firstArray)
System.out.println ("The third entry in the new array is " + secondArray[2]);


