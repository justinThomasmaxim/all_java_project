package kelas_bentuk;


// Superclass/Parentclass
class Bentuk{
	protected void gambar() {
		System.out.println("\nsuperclass -> Menggambar");
	}
	
	protected void hapus() {
		System.out.println("superclass -> Menghapus gambar");
	}
}

/*
 * subClass/childClass
 */
class Lingkaran extends Bentuk{
	protected void gambar() {
		System.out.println("\nsubclass   -> Menggambar Lingkaran");
	}
	
	protected void hapus() {
		System.out.println("subclass   -> Menghapus gambar Lingkaran");
	}
}

class Segitiga extends Bentuk{
	protected void gambar() {
		System.out.println("\nsubclass   -> Menggambar Segitiga");
	}
	
	protected void hapus() {
		System.out.println("subclass   -> Menghapus gambar Segitiga");
	}
}

class Elips extends Bentuk{
	protected void gambar() {
		System.out.println("\nsubclass   -> Menggambar Elips");
	}
	
	protected void hapus() {
		System.out.println("subclass   -> Menghapus gambar Elips");
	}
}




public class KelasBentuk extends Bentuk{
	private void tampil(Bentuk[] obj) {
		// Polimorfisme
		// Memanggil method yang sama yaitu method gambar() dan hapus()
		// pada masing-masing class
		for (int i = 0; i < obj.length; i++) {
			obj[i].gambar();
			obj[i].hapus();
			System.out.println("====================");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bentuk[] obj = { new Lingkaran(),
				 new Elips(),
				 new Segitiga()
		};
		KelasBentuk cetak = new KelasBentuk();
		
		// Menampilkan method gambar() & hapus() pada class Bentuk (superclass)
		cetak.gambar();
		cetak.hapus();
		System.out.println("====================");
		
		// Overriding
		// Menumpuk method gambar() & hapus() pada class Bentuk (superclass)
		// dengan method gambar() & hapus() pada subclassnya
		// yaitu class Lingkaran, Elips, dan Segitiga
		cetak.tampil(obj);
	}
}
