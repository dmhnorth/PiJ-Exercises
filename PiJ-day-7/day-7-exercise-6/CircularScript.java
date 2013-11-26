public class CircularScript {
	
	


	
	public static void main(String[] args) {

	CircularListManager clm = new CircularListManager();


	Node n1 = new Node("n1");
	clm.add(n1);

	Node n2 = new Node("n2");
	clm.add(n2);

	Node n3 = new Node("n3");
	clm.add(n3);

	Node n4 = new Node("n4");
	clm.add(n4);

	Node n5 = new Node("n5");
	clm.add(n5);

	clm.prettyPrint();


	clm.deleteNode(n1);
	clm.deleteNode(n3);
	clm.deleteNode(n5);

	clm.prettyPrint();

	clm.deleteNode(n4);
	clm.deleteNode(n2);

	clm.prettyPrint();

	}
}