package kendaraan_TI;


class Kendaraan {
	// atribut
	protected int roda;
	protected String nama,jenis;
	
	// constructor
	protected Kendaraan(int rda,String nma,String jns){
		roda  = rda;
		nama  = nma;
		jenis = jns;
	}
	protected void infoKendaraan(){
		System.out.println("~~~");
		System.out.println("Nama  : "+nama);
		System.out.println("Jenis : "+jenis);
		System.out.println("Roda  : "+roda);
		System.out.println();
	}
}

/*
 * method super pada subclass konstruktor digunakan untuk memanggil superclass konstruktor
 */
class mobil extends Kendaraan{
	String keterangan;
	protected mobil(int rda, String nma, String jns,String ktrg) {
		// super pada subclass konstruktor digunakan untuk memanggil superclass konstruktor
		super(rda, nma, jns);
		keterangan=ktrg;
		
	}
	public void infoKendaraan(){
		// super pada subclass konstruktor digunakan untuk memanggil superclass konstruktor
		super.infoKendaraan();
		System.out.println("Keterangan : "+keterangan);
	}
}

class motor extends Kendaraan{
	String keterangan;
	public motor(int rda,String nma,String jns,String ktrg){
		// super pada subclass konstruktor digunakan untuk memanggil superclass konstruktor
		super(rda, nma, jns);
		keterangan=ktrg;
		
	}
	public void infoKendaraan(){
		// super pada subclass konstruktor digunakan untuk memanggil superclass konstruktor
		super.infoKendaraan();
		System.out.println("Keterangan : "+keterangan);
	}
}

class tank extends Kendaraan{
	String keterangan;
	public tank(int rda,String nma,String jns,String ktrg){
		// super pada subclass konstruktor digunakan untuk memanggil superclass konstruktor
		super(rda, nma, jns);
		keterangan=ktrg;
	}
	public void infoKendaraan(){
		// super pada subclass konstruktor digunakan untuk memanggil superclass konstruktor
		super.infoKendaraan();
		System.out.println("Keterangan : "+keterangan);
	}
}

class pesawat extends Kendaraan{
	String keterangan;
	public pesawat(int rda, String nma, String jns,String ktrg) {
		// super pada subclass konstruktor digunakan untuk memanggil superclass konstruktor
		super(rda, nma, jns);
		keterangan=ktrg;
		
	}
	public void infoKendaraan(){
		// super pada subclass konstruktor digunakan untuk memanggil superclass konstruktor
		super.infoKendaraan();
		System.out.println("Keterangan : "+keterangan);
	}
}

public class PoliKendaraan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Polimorfisme
		Kendaraan mbl  = new mobil  (4 , "Avanza      ", "Mobil  ", "Punya 4 ban");
		Kendaraan mtr  = new motor  (2 , "Aerox       ", "motor  ", "Punya 2 ban");
		Kendaraan pswt = new pesawat(10, "Lion        ", "Pesawat", "Bisa terbang");
		Kendaraan tnk  = new tank   (0 , "T-14 Armata ", "Tank   ", "Menggunakan rantai");
		
		
		mbl.infoKendaraan();
		mtr.infoKendaraan();
		tnk.infoKendaraan();
		pswt.infoKendaraan();
	}
}

