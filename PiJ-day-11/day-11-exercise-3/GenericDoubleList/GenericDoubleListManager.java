public class GenericDoubleListManager<T>{
	
	private Node<T> head = null;

	
	public void add(Node<T> newNode) {	//conv
		if (head == null) {
			head = newNode;
			newNode.setPrev(head);
			newNode.setNext(head);

			System.out.println("The node list is started");
			

		} else addNewNode(newNode);
	}

	public void addNewNode(Node<T> newNode) {	//conv
		Node<T> aux = head;

		if (head.getPrev() == head.getNext()) { //EXCEPTION FOR FIRST WORKING ON
			head.setPrev(newNode);
		} else {
			aux.setPrev(newNode);
		}

		while (aux.getNext() != head) {
			aux = aux.getNext();
			}

		aux.setNext(newNode);
		newNode.setNext(head);
		newNode.setPrev(aux);
		

		System.out.println("A Node has been added.");
		return;		
		}
	
	public boolean deleteNode(Node<T> node) {
		Node<T> aux = head;
		do {
			if (head == null) {
				System.out.println("Nothing to delete.");
				return false;
			} else if (head.getNext() == head) {
				head = null;
				System.out.println("The list was deleted.");
				return true;
			} else if (aux.getNext() == node && node == head) {
				head = head.getNext();
				aux.setNext(aux.getNext().getNext());
				aux.getNext().setPrev(aux);
				System.out.println("The node " + node.getNodeData() + " was deleted.");
				return true;

			} else if (aux.getNext() == node && node != head) {
				aux.setNext(aux.getNext().getNext());
				aux.getNext().setPrev(aux);
				System.out.println("The node " + node.getNodeData() + " was deleted.");
				return true;
			}
			aux = aux.getNext();
		} while (aux != head);
		return false;
}

	public void prettyPrint() {
		Node<T> aux = head;
		if (head == null) {
			System.out.println("Can't print if the list is empty...");
			return;
		}
		do {
			System.out.println("There is a node called: " + aux.getNodeData() + " with nextNode: " + aux.getNext().getNodeData() + " and prevNode: " + aux.getPrev().getNodeData());			
			aux = aux.getNext();
		} while (aux != head);
		return;
	}

	public void revPrettyPrint() {
		Node<T> aux = head;
		if (head == null) {
			System.out.println("Can't print in reverse if the list is empty...");
			return;
		}
		do {
			System.out.println("In reverse, there is a node called: " + aux.getNodeData() + " with nextNode: " + aux.getNext().getNodeData() + " and prevNode: " + aux.getPrev().getNodeData());			
			aux = aux.getPrev();
		} while (aux != head);
		return;
	}
}