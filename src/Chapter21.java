//Sky Johnson
/*Read Chapter 21
*
*Complete pp 523-526 problems:
*
*1-5
*8,
*13 OR 15 (15 chosen)
*/
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Iterator;

/*Question 1 
 *ListNode node3 = new ListNode("Node 3", null );
 *ListNode node2 = new ListNode("Node 2", node3 );
 *ListNode node1 = new ListNode("Node 1", node2 );
 *ListNode head = node1;
 */

/*Question 2
 * public boolean hasTwo(ListNode head){
 *		return head.getNext().getNext() != null;
 * }
 */

/* Question 3
 * public ListNode removeFirst(ListNode head){
		try{
			head = head.getNext();
			return head;
		}catch(NoSuchElementException e){
			System.out.println("List is Empty!");
			return null;
			
		}catch(Exception e){
			System.out.println("Error");
			return null;
		}
	}
 */

/* Question 4 a
 *  public int size(ListNode head){
		int n = 0;
		for (ListNode node = head; node != null; node = node.getNext()){
			n++;
		}
		return n;
	}
 */

/* Question 4 b
 * public int sizeB(ListNode head){ // b
		int n = 1;
		if(head.getNext() != null){
			n += sizeB(head.getNext());
		}
		return n;
	}
 */

/* Question 5
 * public ListNode add(ListNode head, Object value){ // 5
		ListNode node = head;
		while(node.getNext() != null){
			node = node.getNext();
		}
		ListNode newnode = new ListNode(value, null);
		node.setNext(newnode);
		return head;
	}
 */

/* Question 8
 * public ListNode rotate(ListNode head){ // 8
		ListNode newhead = head.getNext();
		ListNode node = head;
		while(node.getNext() != null){
			node = node.getNext();
		}
		node.setNext(head);
		head.setNext(null);
		return newhead;
	}
 */

public class Chapter21 {
	
	public Chapter21(){
//		ListNode node3 = new ListNode("Node 3", null ); //Question 1
//		ListNode node2 = new ListNode("Node 2", node3 );
//		ListNode node1 = new ListNode("Node 1", node2 );
//		ListNode head = node1;
//		System.out.println((head));
//		head = add(head, "Node 4");
//		System.out.println(head);
//		head = rotate(head);
//		System.out.println(head);
//		
		ListNode2 dNode6 = new ListNode2(new Integer(6)); //For Question 15
		ListNode2 dNode5 = new ListNode2(new Integer(2));
		ListNode2 dNode4 = new ListNode2(new Integer(2));
		ListNode2 dNode3 = new ListNode2(new Integer(1));
		ListNode2 dNode2 = new ListNode2(new Integer(4));
		ListNode2 dNode1 = new ListNode2(new Integer(5));
		dNode1.setNext(dNode2);
		dNode2.setNext(dNode3);
		dNode3.setNext(dNode4);
		dNode4.setNext(dNode5);
		dNode5.setNext(dNode6);
		dNode6.setNext(null);
		dNode1.setPrevious(null);
		dNode2.setPrevious(dNode1);
		dNode3.setPrevious(dNode2);
		dNode4.setPrevious(dNode3);
		dNode5.setPrevious(dNode4);
		dNode6.setPrevious(dNode5);
		System.out.println(dNode1);
		quickSort(dNode1,dNode2);
		System.out.println(dNode1);
		
	}
	public boolean hasTwo(ListNode head){ //Question 2
		return head.getNext().getNext() != null;
	}
	
	public ListNode removeFirst(ListNode head){ //Question 3
		try{
			head = head.getNext();
			return head;
		}catch(NoSuchElementException e){
			System.out.println("List is Empty!");
			return null;
			
		}catch(Exception e){
			System.out.println("Error");
			return null;
		}
	}
	
	public int sizeA(ListNode head){ // Question 4 a
		int n = 0;
		for (ListNode node = head; node != null; node = node.getNext()){
			n++;
		}
		return n;
	}
	
	public int sizeB(ListNode head){ // Question 4 b
		int n = 1;
		if(head.getNext() != null){
			n += sizeB(head.getNext());
		}
		return n;
	}
	
	public ListNode add(ListNode head, Object value){ // Question 5
		ListNode node = head;
		while(node.getNext() != null){
			node = node.getNext();
		}
		ListNode newnode = new ListNode(value, null);
		node.setNext(newnode);
		return head;
	}
	
	public ListNode rotate(ListNode head){ // Question 8
		ListNode newhead = head.getNext();
		ListNode node = head;
		while(node.getNext() != null){
			node = node.getNext();
		}
		node.setNext(head);
		head.setNext(null);
		return newhead;
	}
	
	public void quickSort(ListNode2 fromNode, ListNode2 toNode) {
		ListNode2 pivotNode = fromNode;
		Object p = pivotNode.getValue();

		ListNode2 node1 = fromNode;
		ListNode2 node2 = toNode;
		while (node1 != node2) {
			if (((Integer) node1.getValue()).compareTo((Integer) p) <= 0)
				node1 = node1.getNext();
			else if (((Integer) node2.getValue()).compareTo((Integer) p) >= 0)
				node2 = node2.getPrevious();
			else {
				swap(node1, node2);
				node1 = node1.getNext();
				if (node1 != node2)
					node2 = node2.getPrevious();
			}
		}

		if (((Integer) node1.getValue()).compareTo((Integer) p) > 0) {
			swap(pivotNode, node1.getPrevious());
			pivotNode = node1.getPrevious();
		} else {
			swap(pivotNode, node1);
			pivotNode = node1;
		}
		
		if (fromNode != pivotNode) {
			quickSort(fromNode, pivotNode.getPrevious());
		}
		if (toNode != pivotNode) {
			quickSort(pivotNode.getNext(), toNode);
		}
	}
	
	public void swap(ListNode2 node1, ListNode2 node2) {
		Object temp = node1.getValue();
		node1.setValue(node2.getValue());
		node2.setValue(temp);
	}
	
	public static void main(String[] args){
		System.out.println("Chapter 21");
		Chapter21 k = new Chapter21();
	}
	
}
