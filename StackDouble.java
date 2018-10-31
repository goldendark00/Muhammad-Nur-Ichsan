import java.util.ArrayList;

public class StackDouble {
	ArrayList<Double> Jauh = new ArrayList<Double>();
	int top = -1;

	public void push(Double value) {
		Jauh.add(value);
		top++;
	}
	public double pop() {
		double value = Jauh.get(top);
		Jauh.remove(top);
		top--;
		return value;
	}
	public void cetak() {
		System.out.println(Jauh.toString());
	}
}
