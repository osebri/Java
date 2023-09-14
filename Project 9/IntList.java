/** 
 @Author: Omar Sebri
 */


/**
Defines a class that represents a list of integers
*/
public class IntList {

	/**
	The first node in the list.
	*/
	private IntNode front; 

	/**
	Constructs an initially list is empty.
	*/
	public IntList() {
		front = null;
	}

	

	/**
	Adds given integer to front of list.
	@param val The integer to be added to the list.
	*/
	public void addToFront(int val) {
		front = new IntNode(val, front);
	}

	/**
	Removes the first node from the list.
	If the list is empty, does nothing.
	*/
	public void removeFirst() {
		if (front != null) {
			front = front.next;
		}
	}

	/**
	Prints the list elements from first to last.
	*/
	public void print() {
		System.out.println("--------------------");
		System.out.print("List elements: ");
		IntNode temp = front;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println("\n-----------------------\n");
	}
	/** 
	 Returns the length of the list
	 */
	public int length(){
		int len = 0;
		IntNode temp=front ;
		while(temp!=null){
			len+=1;
			temp=temp.next ;
		}
		return len ;
	}
	/** add an element at the end of the list */
	public void addToend(int val){
		IntNode end = new IntNode(val, null);
		IntNode temp = front ;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=end;
	}
	/** removes the last element of the list */
	public void removeLast(){
		if(front !=null){
			IntNode temp = front ;
			while(temp.next.next!=null){
				temp=temp.next;
			}
			temp.next = null;
		}
	}
	/** replaces a value with a new one */
	public void replace(int oldVal, int newVal){
		IntNode temp = front;
		while(temp!=null){
			if(temp.val==oldVal)
				temp.val=newVal;
			temp=temp.next;
		}
	}
	/** prints the list recursively */
	public void printRec(){
		if(front!=null){
			printer(front);
		}		
	}
	/** helper method for printRec() */
	public void printer(IntNode el){
		if (el!=null){
		System.out.print(el.val+" ");
		printer(el.next);
		}
	}
	/** prints list recursively backwards */
	public void printRecBackwards(){
		if(front!=null){
			printerBackwards(front);
		}		
	}
	/** helper method for printRecBackwards() */
	public void printerBackwards(IntNode el){
		if (el!=null){
		printerBackwards(el.next);
		System.out.print(el.val+" ");
		}
	}

	/**
	An inner class that represents a node in the integer list.
	The public variables are accessed by the IntList class.
	*/
	private class IntNode {
		
		/**
		The value stored in the node.
		*/
		public int val; 
		
		/**
		The link to the next node in the list.
		*/
		public IntNode next; 
		
		/**
		Constructs the node given a value and reference to the next node.
		@param val The value to be stored in the node.
		@param next The reference to the next node in the list.
		*/
		public IntNode(int val, IntNode next) {
			this.val = val;
			this.next = next;
		}
	}
}

