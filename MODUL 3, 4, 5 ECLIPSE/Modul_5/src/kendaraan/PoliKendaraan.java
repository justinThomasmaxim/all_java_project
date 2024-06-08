package kendaraan;

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
 * method super akan selalu mengakses atribut superclass
 */
class mobil extends Kendaraan{
	protected mobil(int rda, String nma, String jns) {
		// super akan selalu mengakses atribut superclass
		super(rda, nma, jns);
	}
}

class motor extends Kendaraan{
	public motor(int rda,String nma,String jns){
		// super akan selalu mengakses atribut superclass
		super(rda, nma, jns);
	}
}

class tank extends Kendaraan{
	String keterangan;
	public tank(int rda,String nma,String jns,String ktrg){
		// super akan selalu mengakses atribut superclass
		super(rda, nma, jns);
		keterangan=ktrg;
	}
	public void infoKendaraan(){
		// super akan selalu mengakses atribut superclass
		super.infoKendaraan();
		System.out.println("Keterangan : "+keterangan);
	}
}

class pesawat extends Kendaraan{
	public pesawat(int rda, String nma, String jns) {
		// super akan selalu mengakses atribut superclass
		super(rda, nma, jns);
	}
}

public class PoliKendaraan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Polimorfisme
		Kendaraan mbl  = new mobil  (4 , "Ford       ", "Mobil  ");
		Kendaraan mtr  = new motor  (2 , "Ninja      ", "motor  ");
		Kendaraan pswt = new pesawat(10, "Garuda     ", "Pesawat");
		Kendaraan tnk  = new tank   (0 , "Leopard 2A7", "Tank   ", "Menggunakan rantai");
		
		
		mbl.infoKendaraan();
		mtr.infoKendaraan();
		tnk.infoKendaraan();
		pswt.infoKendaraan();
	}
}
