import java.util.*;

public class Stack <T> {
private ArrayList<T> stack = new ArrayList<T> ();
private int top = -1;

public int size () { return top; }

	public void push (T item) {
		stack.add (top++, item);
  	}
	public T pop () {
		return stack.remove (--top);
	}
}
