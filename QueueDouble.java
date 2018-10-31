import java.util.ArrayList;

public class QueueDouble {
	ArrayList<Double> Jauh = new ArrayList<Double>();
	int top = -1;

	public void insert(Double value) {
		Jauh.add(value);
		top++;
	}
	public double get() {
		double value = Jauh.get(top);
		Jauh.remove(top);
		top--;
		return value;
	}
	public void cetak() {
		System.out.println(Jauh.toString());
	}
}
