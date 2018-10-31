
public class MainQueueDouble {

	public static void main(String[] args) {
		QueueDouble km = new QueueDouble();
		km.cetak();
		
		km.insert(120.32);km.cetak();
		km.insert(105.52);km.cetak();
		km.insert(110.2);km.cetak();
		km.insert(102.3);km.cetak();
		
		Double KM = km.get();km.cetak();
		System.out.println(KM);
	}
}
