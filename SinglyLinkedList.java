import java.util.Iterator;

public class SinglyLinkedList<T>
{
	private int size;
	private Node<T> first;
	private Node<T> last;

	public SinglyLinkedList() //constructor of SinglyLinkedList
	{
		this.size = 0;
		this.first = null;
		this.last = null;
	}

	public void add(T element)//Add element to the end of the List
	{
		Node<T> node = new Node<T>(element);
		if(first == null)
		{
			first = node;
			last = node;
		}
		else
		{
			last.setNext(node);
			last = node;
		}
		size++;
	}

	// public void insertAt(T element, int index)//inserts element at a certain index
	// {
		
	// }

	// public void remove(T element)//removes first occurance of given element from the list
	// 	//If the element doesnt exist inside the list, throw a nosuchelementexception
	// {
		
	// }

	public void clear()//removes all elements from the list
	{
		first = null;
	}
	public boolean isEmpty()//return true if empty, false otherwise
	{
		if(this.first == null)
			return true;
		else return false;
	}

	public int size()//returns the size of the current list
	{
		return this.size();
	}

	// public T getNthFromFirst(int n)//if index n is invalid must throw indexoutofboundsexception
	// {
		
	// }

	// public T getNthFromLast(int n)//if index n is invalid must throw indexoutofboundsexception
	// {
		
	// }

	// public SinglyLinkedListIterator iterator()
	// {
	// 	//return this.SinglyLinkedListIterator;
	// }

	// public String toString()
	// {

	// }

}


	class SinglyLinkedListIterator implements Iterator<T>
	{
		private SinglyLinkedList list;

		// public SinglyLinkedListIterator()
		// {

		// }

		// public boolean hasNext()
		// {
			
		// }

		public T next()
		{
			while()
		}

		// public void remove()
		// {

		// }
	}

	class Node<T>
	{
		private T info;
		Node<T> nextNode;
		//Node<T> beforeNode;

		public Node(T info)
		{
			this.info = info;
			nextNode = null;
		}

		public T getInfo()
		{
			return this.info;
		}

		public Node<T> getNext()
		{
			return this.nextNode;
		}

		public void setNext(Node<T> next)
		{
			this.nextNode = next;
		}

		// public Node<T> getPreviousNode()
		// {
		// 	return this.previousNode;
		// }

		// public void setPreviousNode(Node<T> previous)
		// {
		// 	this.previousNode = previous;
		// }
	}