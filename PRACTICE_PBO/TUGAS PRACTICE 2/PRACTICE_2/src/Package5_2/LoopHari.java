package Package5_2;

public class LoopHari {
	public static void main(String[] args) {
		int tahun =365;
		int loop=0;
		int sisa;
		String hari[]= {"Minggu", "Senin", "Selasa", "Rabu", "Kamis","Jumat","Sabtu"};
		for (int i=0; i<365/7;i++) {
			System.out.println();
			System.out.println("ke-"+(i+1));
			for(String item : hari) {
				System.out.println(item);
			}
			loop+=1;
		}
		System.out.println("Perulangan yang diperlukan :"+loop);
	}
}

