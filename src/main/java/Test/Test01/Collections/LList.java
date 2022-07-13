package Test.Test01.Collections;

public class LList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int a){
			data=a;
			next = null;
		}
	}

	void printList() {
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LList l1=new LList();
		l1.head=new Node(10);
		Node n2= new Node(12);
		Node n3= new Node(6);
		
		l1.head.next = n2;
		n2.next = n3;
		
		l1.printList();
		
		

	}

}
