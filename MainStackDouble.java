
public class MainStackDouble {

	public static void main(String[] args) {
		StackDouble km = new StackDouble();
		km.cetak();
		
		km.push(120.32);km.cetak();
		km.push(105.52);km.cetak();
		km.push(110.2);km.cetak();
		km.push(102.3);km.cetak();
		
		Double KM = km.pop();km.cetak();
		System.out.println(KM);
	}
}
