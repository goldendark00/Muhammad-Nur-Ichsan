
public class MainStackFloat {

	public static void main(String[] args) {
		StackFloat km = new StackFloat();
		km.cetak();
		
		km.push((float)12.32);km.cetak();
		km.push((float)15.52);km.cetak();
		km.push((float)111.2);km.cetak();
		km.push((float)123.3);km.cetak();
		
		Float KM = km.pop();km.cetak();
		System.out.println(KM);
	}
}
