import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String> ichsan = new ArrayList<String>();
		ichsan.add("Saya");
		ichsan.add("Suka");

		System.out.println(ichsan.toString());
		System.out.println("indexnya : "+ichsan.indexOf("Saya"));
		System.out.println("size : "+ichsan.size());
	}
}
