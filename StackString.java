import java.util.ArrayList;

public class StackString {

	ArrayList<String> toples = new ArrayList<String>();
	int top = -1;
	
	public void push(String value) {
		top++;
		toples.add(value);
	}
	
	public String pop() {
		String value = "Tidak Ada Isinya";
		if(!toples.isEmpty()) {
			value = toples.get(top);
			toples.remove(top);
			top--;
		}
		return value;
	}

	public void cetak() {
		System.out.println("Top: "+top+" -> Values:"+toples.toString());
	}

}
