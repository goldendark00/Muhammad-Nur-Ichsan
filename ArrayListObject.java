import java.util.ArrayList;

public class ArrayListObject {

	public static void main(String[] args) {
		ArrayList<Mahasiswa> Ichsan = new ArrayList<Mahasiswa>();
		Ichsan.add(new Mahasiswa("Ichsan", "D0217007", "A", "Binanga"));
		Ichsan.add(new Mahasiswa("sari", "D0217003", "A", "Bone"));
		Ichsan.add(new Mahasiswa("Putra", "D0217002", "A", "UjungPandang"));
		Ichsan.add(new Mahasiswa("wulan", "D0217004", "A", "Bandung"));
		Ichsan.forEach(ichsan ->{
			System.out.println("Nama : "+ ichsan.getNama()+", Nim : "+ ichsan.getNim()+", Kelas : "+ ichsan.getKelas()+ ", Alamat : "+ ichsan.getAlamat());
		});
	}
}
