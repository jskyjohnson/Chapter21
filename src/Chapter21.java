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
 * 
 */

public class Chapter21 {
	
	public Chapter21(){
		ListNode node3 = new ListNode("Node 3", null );
		ListNode node2 = new ListNode("Node 2", node3 );
		ListNode node1 = new ListNode("Node 1", node2 );
		ListNode head = node1;
		System.out.println("The Size is "+sizeB(head));
	}
	public boolean hasTwo(ListNode head){
		return head.getNext().getNext() != null;
	}
	
	public ListNode removeFirst(ListNode head){
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
	
	public int sizeA(ListNode head){ // a
		int n = 0;
		for (ListNode node = head; node != null; node = node.getNext()){
			n++;
		}
		return n;
	}
	
	public int sizeB(ListNode head){ // b
		int n = 0;
		if(head.getValue() == null){
			System.out.println("Tears");
		}
		if(head.getValue() != null){
			n += sizeB(head.getNext());
		}
		return n;
	}
	
	public static void main(String[] args){
		System.out.println("Chapter 21");
		Chapter21 k = new Chapter21();
	}
}
