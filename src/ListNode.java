// ListNode class from Java Methods book
public class ListNode {
	private Object value;
	private ListNode next;
	
	public ListNode(Object v){
		value = v;
		next = null;
	}
	
	public ListNode(Object v, ListNode nx){
		value = v;
		next = nx;
	}
	
	public Object getValue() {return value;}
	public ListNode getNext() {return next;}
	
	public void setValue(Object v){ value = v;}
	public void setNext(ListNode nx){ next = nx;}
}
