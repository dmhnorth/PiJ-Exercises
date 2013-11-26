public class Node {
	private String name;
	private Node nextNode;

	public Node(String name){
		this.name = name;
		nextNode = null;

	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public Node getNext(){
		return this.nextNode;
	}

	public void setNext(Node node){
		this.nextNode = node;
	}

}


