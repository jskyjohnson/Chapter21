//Sky Johnson
/*Read Chapter 21
*
*Complete pp 523-526 problems:
*
*1-5
*8,
*13 OR 15
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
		ListNode node3 = new ListNode("Node 3", null ); //Question 1
		ListNode node2 = new ListNode("Node 2", node3 );
		ListNode node1 = new ListNode("Node 1", node2 );
		ListNode head = node1;
		System.out.println((head));
		head = add(head, "Node 4");
		System.out.println(head);
		head = rotate(head);
		System.out.println(head);
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
	
	public static void main(String[] args){
		System.out.println("Chapter 21");
		Chapter21 k = new Chapter21();
	}
}
