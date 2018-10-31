import java.util.ArrayList;

public class QueueFloat {
ArrayList<Float> Jauh = new ArrayList<Float>();
int top = -1;

public void insert(Float value) {
	Jauh.add(value);
	top++;
}
public float get() {
	float value = Jauh.get(top);
	Jauh.remove(top);
	top--;
	return value;
}
public void cetak() {
	System.out.println(Jauh.toString());
}
}
