
public class MainQueueString {

	public static void main(String[] args) {
		QueueString queue = new QueueString();
		
		queue.cetak();
		
		queue.insert("ichsan");queue.cetak();
		queue.insert("kara");queue.cetak();
		
		String nilai = queue.get();
		System.out.println(nilai);
		queue.cetak();
				
	}

}
