package LinkList;

public class Node<K ,V> {
K key;
V value;
@SuppressWarnings("rawtypes")
Node next;

public Node(K key, V value) {
	super();
	this.key = key;
	this.value = value;
	
}
public void display(){
	System.out.print("{"+key+","+value+"}");
}

}