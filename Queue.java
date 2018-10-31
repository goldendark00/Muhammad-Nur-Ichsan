import java.util.ArrayList;

public class Queue <T> {
private ArrayList<T> queue = new ArrayList<T> ();
private int top = -1;

public int size () { return top; }

	public void insert (T item) {
		queue.add (top++, item);
  	}
	public T get () {
		return queue.remove (top--);
	}
}
