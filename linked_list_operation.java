package piyush;

public class ll {
	Node head;
	class Node{
		int data ;
		Node next;
		Node(int data){
			this.data = data;
			this.next=null;
		}
	}
	// adding at the first position 
	public void add(int data) {
		Node newnode= new Node(data);
		if(head==null) {
			head= newnode;
			return;
		}
		newnode.next=head;
		head= newnode;
	}
	// adding at the last position 
	public void addlast(int data) {
	    Node newNode = new Node(data);
	    if (head == null) {
	        head = newNode;
	        return;
	    }
	    Node currNode = head;
	    while (currNode.next != null) {
	        currNode = currNode.next;
	    }
	    currNode.next = newNode;
	}
	// delete the nodes from the first
	public void delfir() {
		if(head==null) {
			System.out.print("the list is empty");
			return;
		}
		head = head.next;
	}
	//delete the node from the last 
	public void dellast() {
		if (head== null) {
			System.out.print("the list is empty");
			return;
		}
		if (head.next==null) {
			head=null;
			return;
		}
		Node seclast = head;
		Node last = head.next;
		while(last.next!=null) {
			last= last.next;
			seclast= seclast.next;
		}
		seclast.next=null;
	}
// display the message 
public void display() {
	if(head==null) {
		System.out.print("the list is Empty");
	}
	Node currNode= head;
	while(currNode!=null) {
		System.out.print("-->"+currNode.data);
		currNode= currNode.next;
	}
}
public static void main(String args[]) {
	ll n= new ll();
	n.add(0);
	n.add(2);
	n.display();
	n.addlast(10);
	n.display();
	n.delfir();
	n.display();
	n.dellast();
	n.display();
}
}
