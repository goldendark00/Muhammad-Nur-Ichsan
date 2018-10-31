import java.util.ArrayList;

public class QueueString {
	ArrayList<String> toples = new ArrayList<String>();
		
	public void insert(String value) {
		toples.add(value);
	}
	
	public String get() {
		String value = toples.get(0);
		toples.remove(0);
		return value;
	}
	
	public void cetak() {
		System.out.println("Values:"+toples.toString());
	}
}
