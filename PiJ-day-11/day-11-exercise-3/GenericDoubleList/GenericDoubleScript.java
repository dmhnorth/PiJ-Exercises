public class GenericDoubleScript {

	
	public static void main(String[] args) {

		GenericDoubleScript gcs = new GenericDoubleScript();
		gcs.launch();
	
	}	

	public void launch() {
	
		GenericDoubleListManager gdlm = new GenericDoubleListManager<String>();

		Node n1 = new Node("n1");
		gdlm.add(n1);

		Node n2 = new Node("n2");
		gdlm.add(n2);

		Node n3 = new Node("n3");
		gdlm.add(n3);

		Node n4 = new Node("n4");
		gdlm.add(n4);

		Node n5 = new Node("n5");
		gdlm.add(n5);

		gdlm.prettyPrint();
		gdlm.revPrettyPrint();

		gdlm.deleteNode(n1);
		gdlm.deleteNode(n3);
		gdlm.deleteNode(n5);

		gdlm.prettyPrint();
		gdlm.revPrettyPrint();


		gdlm.deleteNode(n4);
		gdlm.deleteNode(n2);

		gdlm.prettyPrint();
		gdlm.revPrettyPrint();

		GenericDoubleListManager gdlm2 = new GenericDoubleListManager<Integer>();

		Node in1 = new Node(1);
		gdlm2.add(in1);

		Node in2 = new Node(2);
		gdlm2.add(in2);

		Node in3 = new Node(3);
		gdlm2.add(in3);

		Node in4 = new Node(4);
		gdlm2.add(in4);

		Node in5 = new Node(5);
		gdlm2.add(in5);

		gdlm2.prettyPrint();
		gdlm2.revPrettyPrint();

		gdlm2.deleteNode(in1);
		gdlm2.deleteNode(in3);
		gdlm2.deleteNode(in5);

		gdlm2.prettyPrint();
		gdlm2.revPrettyPrint();

		gdlm2.deleteNode(in4);
		gdlm2.deleteNode(in2);

		gdlm2.prettyPrint();
		gdlm2.revPrettyPrint();


		}

	}