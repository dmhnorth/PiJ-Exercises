public class IntegerTreeNode {
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;
	

	public IntegerTreeNode(int n) { //constructor
		value = n;
		left = null;
		right = null;
	}
/* method to add a node and value.
It checks whether a TreeNode is empty, and if it is, it places it there.
if not, it evaluates it's size compared to the current and checks for nulls further
down the tree.
*/
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);	
			} else {
				right.add(newNumber); //uses recursion on next node
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber); //uses recursion on next node
			}
		}
	}


/* method to see if a particular value exists in the tree
It checks the current node for the value, then checks if our value
is larger or smaller than the current if it's not equal.
This determines which node to travel to check next.
*/
	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n); //recursion			
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}

	
	//methods go here...


/*
works when used IntegerTreeNode.getMax()
returns 0 if tree is empty
originally had an if for if the integer tree node is null, However!
Due to the way an IntegerTreeNode(int n) is constructed, it MUST have a value.
*/
	public int getMax() {		
		if (right == null) {
			return value;
		} else {
			return right.getMax();
			}
		}

/*
works when used IntegerTreeNode.getMin()
returns 0 if tree is empty
*/
	public int getMin() {
		if (left == null) {
			return value;
		} else {
			return left.getMin();
		}
	}

}