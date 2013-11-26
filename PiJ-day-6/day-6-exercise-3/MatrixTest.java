public class MatrixTest {





public static void main(String[] args){



Matrix array2D = new Matrix(5, 5);



/* //just a small test to understand printing elements...
int[][] test = {{1,2,3},{4,5,6},{7,8,9}};
System.out.println(test[0][0]);
System.out.println(test[1][1]);
System.out.println(test[2][2]);
*/


//array2D.toString;


array2D.setElement(2,2,546);
array2D.prettyPrint();

array2D.setRow(2, "15,2,88,7");
array2D.prettyPrint();

array2D.setColumn(2, "17,18,19");
array2D.prettyPrint();

System.out.print("\n");
System.out.println("The program has finished...");



}

}