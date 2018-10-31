import java.util.ArrayList;

public class StackFloat {
ArrayList<Float> Jauh = new ArrayList<Float>();
int top = -1;

public void push(Float value) {
	Jauh.add(value);
	top++;
}
public float pop() {
	float value = Jauh.get(top);
	Jauh.remove(top);
	top--;
	return value;
}
public void cetak() {
	System.out.println(Jauh.toString());
}
}
