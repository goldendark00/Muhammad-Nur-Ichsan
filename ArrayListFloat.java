import java.util.ArrayList;

public class ArrayListFloat {

	public static void main(String[] args) {
		ArrayList<Float> ichsan = new ArrayList<Float>();
		ichsan.add((float) 55.6);
		ichsan.add((float) 45.79);

		System.out.println(ichsan.toString());
		System.out.println("indexnya : "+ichsan.indexOf(1));
		System.out.println("size : "+ichsan.size());
	}
}
