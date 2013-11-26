public class IntegerTreeTest {
	
	public void launch(){

	IntegerTreeNode treeOfLife = new IntegerTreeNode(7);
	treeOfLife.add(3);
	treeOfLife.add(1);
	treeOfLife.add(12);
	treeOfLife.add(27);
	treeOfLife.add(71);
	treeOfLife.add(-4);
	



	System.out.println("Does is contain an 8? " + treeOfLife.contains(8));
	System.out.println("The max in the tree from the first node made is: " + treeOfLife.getMax());
	System.out.println("The min in the tree from the first node made is: " + treeOfLife.getMin());

}




public static void main(String[] args) {
	
	IntegerTreeTest tt = new IntegerTreeTest();
	tt.launch();	
}

}