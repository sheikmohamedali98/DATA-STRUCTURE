package LinkList;

public class ListControll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer,String> list1 = new LinkedList();
	
		list1.insertHead(1, "sheik");
		list1.insertHead(2, "mohame");
		list1.insertHead(3, "ali");
		list1.sort();
		list1.delete(2);
		//list1.display();
		LinkedList<Integer,String> list2 = new LinkedList();

		list2.insertHead(7, "deepan");
		list2.insertHead(8, "bharath");
		
		list1.concate(list2);
		list1.display();

	}

}
