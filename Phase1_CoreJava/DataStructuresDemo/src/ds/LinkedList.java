package ds;

public class LinkedList {

	Node head;
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public static LinkedList insert(LinkedList list, int data)
	{
		// create new node
		Node node = new Node(data);
		// if the list is empty then new node is the head
		if(list.head == null)
		{
			list.head = node;
		}
		// else iterate in the list and find tha last node whose next is null
		else {
			Node last = list.head;
			while(last.next != null)
			{
				last = last.next;
			}
			last.next = node;
		}
		return list;
	}
	public static void printlist(LinkedList list)
	{
		Node currnode = list.head;
		System.out.println("Printing list");
		while(currnode != null)
		{
			System.out.print(currnode.data+" ");
			currnode = currnode.next;
		}
		System.out.println();
	}
	public static boolean search(LinkedList list, int data)
	{
		Node currnode = list.head;
		boolean flag = false;
		while(currnode != null)
		{
			if(currnode.data == data)
			{
				flag = true;
				break;
			}
			currnode = currnode.next;
		} 
		return flag;
	}
	public static LinkedList deleteByKey(LinkedList list, int key)
	{
		Node curr = list.head, prev = null;
		if(curr != null && curr.data == key)
		{
			list.head = curr.next;
			System.out.println(key +" found and deleted");
			return list;
		}
		while(curr != null && curr.data != key) {
			prev = curr;
			curr = curr.next;
		}
		if(curr != null)
		{
			prev.next = curr.next;
			System.out.println(key +" found and deleted");
		}
		else
			System.out.println(key+" not found");
		return list;
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list = insert(list, 10);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 20);
		list = insert(list, 80);
		printlist(list);
		System.out.println(search(list, 20));
		System.out.println(search(list, 200));
		list = deleteByKey(list, 10);
		printlist(list);
		
	}
}
