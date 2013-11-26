public class GenericCircularScript {

	
	public static void main(String[] args) {

		GenericCircularScript gcs = new GenericCircularScript();
		gcs.launch();
	
	}	

	public void launch() {
	
		GenericCircularListManager gclm = new GenericCircularListManager<String>();

		Node n1 = new Node("n1");
		gclm.add(n1);

		Node n2 = new Node("n2");
		gclm.add(n2);

		Node n3 = new Node("n3");
		gclm.add(n3);

		Node n4 = new Node("n4");
		gclm.add(n4);

		Node n5 = new Node("n5");
		gclm.add(n5);

		gclm.prettyPrint();


		gclm.deleteNode(n1);
		gclm.deleteNode(n3);
		gclm.deleteNode(n5);

		gclm.prettyPrint();

		gclm.deleteNode(n4);
		gclm.deleteNode(n2);

		gclm.prettyPrint();


		GenericCircularListManager gclm2 = new GenericCircularListManager<Integer>();

		Node in1 = new Node(1);
		gclm2.add(in1);

		Node in2 = new Node(2);
		gclm2.add(in2);

		Node in3 = new Node(3);
		gclm2.add(in3);

		Node in4 = new Node(4);
		gclm2.add(in4);

		Node in5 = new Node(5);
		gclm2.add(in5);

		gclm2.prettyPrint();


		gclm2.deleteNode(in1);
		gclm2.deleteNode(in3);
		gclm2.deleteNode(in5);

		gclm2.prettyPrint();

		gclm2.deleteNode(in4);
		gclm2.deleteNode(in2);

		gclm2.prettyPrint();


		}

	}