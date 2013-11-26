public class Node<T> {
	
	private T nodeData;
	private Node<T> nextNode;
	private Node<T> prevNode;

	public Node(T nodeData){
		this.nodeData = nodeData;
		this.nextNode = null;
		this.prevNode = null;
	}

	public T getNodeData(){
		return this.nodeData;
	}

	public Node<T> getNext(){
		return this.nextNode;
	}

	public Node<T> getPrev(){
		return this.prevNode;
	}

	public void setNext(Node<T> node){
		this.nextNode = node;
	}

	public void setPrev(Node<T> node){
		this.prevNode = node;
	}

}


