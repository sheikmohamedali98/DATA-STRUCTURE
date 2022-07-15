package LinkList;

public class LinkedList<K, V> {

	private Node head;

	public LinkedList() {
		head = null;
	}

	public boolean insertHead(K key, V value) {
		@SuppressWarnings("unchecked")
		Node<K, V> list = new Node(key, value);
		list.next = head;
		head = list;
		return true;
	}

	@SuppressWarnings("unchecked")
	public Node<K, V> deleteFirst() {
		Node<K, V> temp = head;
		head = head.next;
		return temp;
	}

	public void display() {
		// pointer reference
		Node<K, V> ptr = head;

		System.out.print("[");
		while (ptr != null) {
			// print data
			ptr.display();
			// move next item
			ptr = ptr.next;
			System.out.print(";");
		}
		System.out.println("]");

	}
	
	public Node<K,V> find(K key){
		Node<K,V> ptr = head;
		if(head == null){
			return null;
		}
		while(ptr.key!=key){
			if(ptr.next == null){
				return null;
			}
			else{
				ptr = ptr.next;
			}
		}
		return ptr;
	}

	public Node<K,V> delete(K key){
		Node<K,V> ptr = head;
		Node<K,V> previous = null;
		if(head == null){
			return null;
		}
		
		while(ptr.key != key){
			if(ptr.next == null){
				return null;
			}
			else{
				previous = head;
				ptr = ptr.next;
			}
		}
		if(ptr == head){
			head = head.next;
		}
		else{
			previous.next = ptr.next;
		}
		
		return ptr;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public int length(){
		int length = 0;
		for(Node<K,V> ptr = head; ptr != null;ptr = ptr.next){
			length++;
		}
		return length;
	}
	
	@SuppressWarnings("unchecked")
	public void sort(){
		Node<K,V> ptr,next;
		int size = length();
		int k = size;
		for(int i = 0;i<size-1;i++,k--){
			ptr = head;
			next = ptr.next;
			for(int j = 1;j<k;j++){
				if(ptr.value>next.value){
					V tempValue = ptr.value;
					ptr.value = next.value;
					next.value = tempValue;
					
					K tempKey = ptr.key;
					ptr.key = next.key;
					next.key = tempKey;
				}
				ptr = ptr.next;
				next = next.next;
			}
		}
	}
	
	public void concate(LinkedList list){
		if(head == null){
			head = list.head;
		}
		if(list.head == null){
			return ;
		}
		
		Node<K,V> temp = head;
		
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = list.head;
	}
}
