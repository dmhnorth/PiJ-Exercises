public class CircularListManager {
	
	Node head = null;

	
	public void add(Node newNode) {
		if (head == null) {
			head = newNode;
			newNode.setNext(head);
			System.out.println("The node list is started with '" + newNode.getName());
			System.out.println("It's nextNode is: " + newNode.getNext().getName());

		} else addNewNode(newNode);
	}

	public void addNewNode(Node newNode) {
		Node aux = head;

		while (aux.getNext() != head) {
			aux = aux.getNext();
			}

		aux.setNext(newNode);
		newNode.setNext(head);
		System.out.println("The node '" + newNode.getName() + "' has been added.");
		System.out.println("It's nextNode is: " + newNode.getNext().getName());
		return;		
		}
	
	public boolean deleteNode(Node node) {
		Node aux = head;
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
				System.out.println("The node " + node.getName() + " was deleted.");
				return true;

			} else if (aux.getNext() == node && node != head) {
				aux.setNext(aux.getNext().getNext());
				System.out.println("The node " + node.getName() + " was deleted.");
				return true;
			}
			aux = aux.getNext();
		} while (aux != head);
		return false;
}
	public void prettyPrint() {
		Node aux = head;
		if (head == null) {
			System.out.println("Can't print if the list is empty...");
			return;
		}
		do {
			System.out.println("There is a node called: " + aux.getName() + " with nextNode: " + aux.getNext().getName());			
			aux = aux.getNext();
		} while (aux != head);
		return;
	}
}