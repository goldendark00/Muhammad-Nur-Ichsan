import java.util.ArrayList;

public class ArrayListInteger {

	public static void main(String[] args) {
		ArrayList<Integer> ichsan = new ArrayList<Integer>();
		ichsan.add((int) 256);
		ichsan.add((int) 45449);

		System.out.println(ichsan.toString());
		System.out.println("indexnya : "+ichsan.indexOf(1));
		System.out.println("size : "+ichsan.size());
	}
}
