import java.util.ArrayList;

public class ArrayListDouble {

	public static void main(String[] args) {
		ArrayList<Double> ichsan = new ArrayList<Double>();
		ichsan.add((double) 556);
		ichsan.add((double) 45.8759);

		System.out.println(ichsan.toString());
		System.out.println("indexnya : "+ichsan.indexOf(1));
		System.out.println("size : "+ichsan.size());
	}
}
