
public class MainQueueFloat {

	public static void main(String[] args) {
		QueueFloat km = new QueueFloat();
		km.cetak();
		
		km.insert((float)12.32);km.cetak();
		km.insert((float)15.52);km.cetak();
		km.insert((float)111.2);km.cetak();
		km.insert((float)123.3);km.cetak();
		
		Float KM = km.get();km.cetak();
		System.out.println(KM);
	}
}
