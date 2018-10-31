
public class MainStackString {

	public static void main(String[] args) {
		StackString stack = new StackString();
		
		stack.cetak();
		
		stack.push("ichsan");stack.cetak();
		stack.push("kara");stack.cetak();
		
		String nilai = stack.pop();
		System.out.println(nilai);
		stack.cetak();
				
	}

}
