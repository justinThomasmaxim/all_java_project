package Produk;

public class ProdukJF6 {
	
	// Deklarasi field instance
	private int nomorBarang;
	private String namaProduk;
	private int jumlahUnit;
	private double hargaPerUnit;
	
	private boolean active = true;
	
	// Konstruktor default
	public ProdukJF6() {
		// Tujuan kode : Inisialisasi bidang ke nilai defaultnya
	}
	
	// Konstruktor default
	public ProdukJF6(int nomor, String nama, int jumlah, double harga) {
		// Inisialisasi bidang dengan nilai dari kelas driver
		this.nomorBarang = nomor;
		this.namaProduk = nama;
		this.jumlahUnit = jumlah;
		this.hargaPerUnit = harga;
	}
	
	 public int getNomorBarang() {
	        return nomorBarang;
	    }

    public void setNomorBarang(int nomorBarang) {
        this.nomorBarang = nomorBarang;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public int getJumlahUnit() {
        return jumlahUnit;
    }

    public void setJumlahUnitTersedia(int jumlahUnit) {
        this.jumlahUnit = jumlahUnit;
    }

    public double getHargaPerUnit() {
        return hargaPerUnit;
    }

    public void setHargaPerUnit(double hargaPerUnit) {
        this.hargaPerUnit = hargaPerUnit;
    }
    
    public boolean isActive() {
    	return active;
    }
    
    public void setActive(boolean active) {
    	this.active = active;
    }
    
    public double getInventoryValue() {
    	return this.jumlahUnit * this.hargaPerUnit;
    }
    
  
    public String toString() {
    	return 	"Nomor Barang    : " + nomorBarang +
    			"\nNama            : " + namaProduk +
    			"\nJumlah Stok     : " + jumlahUnit +
    			"\nHarga           : " + hargaPerUnit +
    			"\nNilai Stok      : " + getInventoryValue() +
    			"\nStatus Produk   : " + (isActive() ? "Aktif" : "Dihentikan");
    }
    
    public void addToInventory(int quantityToAdd) {
        // Metode ini memungkinkan penambahan jumlah unit dalam stok.

        // Menambahkan 'quantityToAdd' ke jumlah unit yang tersedia.
        this.jumlahUnit += quantityToAdd;

        System.out.println("Tambahkan " + quantityToAdd + " unit ke inventaris.");
    }

    public void deductFromInventory(int quantityToDeduct) {
        // Metode ini memungkinkan pengurangan jumlah unit dalam stok.

        // Memastikan stok mencukupi untuk dikurangi.
        if (this.jumlahUnit >= quantityToDeduct) {
            // Mengurangi 'quantityToDeduct' dari jumlah unit yang tersedia.
            this.jumlahUnit -= quantityToDeduct;
            System.out.println("Kurangi " + quantityToDeduct + " unit ke inventaris.");
        } else {
            System.out.println("Jumlah persediaan tidak mencukupi. Tidak dapat mengurangi.");
        }
    }
}



















//public class ProdukJF6 {
//	
//	// Deklarasi field instance
//	private int nomorBarang;
//	private String namaProduk;
//	private int jumlahUnit;
//	private double hargaPerUnit;
//	
//	private boolean active = true;
//	
//	// Konstruktor default
//	public ProdukJF6() {
//		// Tujuan kode : Inisialisasi bidang ke nilai defaultnya
//	}
//	
//	// Konstruktor default
//	public ProdukJF6(int nomor, String nama, int jumlah, double harga) {
//		// Inisialisasi bidang dengan nilai dari kelas driver
//		this.nomorBarang = nomor;
//		this.namaProduk = nama;
//		this.jumlahUnit = jumlah;
//		this.hargaPerUnit = harga;
//	}
//	
//	 public int getNomorBarang() {
//	        return nomorBarang;
//	    }
//
//    public void setNomorBarang(int nomorBarang) {
//        this.nomorBarang = nomorBarang;
//    }
//
//    public String getNamaProduk() {
//        return namaProduk;
//    }
//
//    public void setNamaProduk(String namaProduk) {
//        this.namaProduk = namaProduk;
//    }
//    
//    public int getJumlahUnit() {
//        return jumlahUnit;
//    }
//
//    public void setJumlahUnitTersedia(int jumlahUnit) {
//        this.jumlahUnit = jumlahUnit;
//    }
//
//    public double getHargaPerUnit() {
//        return hargaPerUnit;
//    }
//
//    public void setHargaPerUnit(double hargaPerUnit) {
//        this.hargaPerUnit = hargaPerUnit;
//    }
//    
//    public boolean isActive() {
//    	return active;
//    }
//    
//    public void setActive(boolean active) {
//    	this.active = active;
//    }
//    
//    public double getInventoryValue() {
//    	return this.jumlahUnit * this.hargaPerUnit;
//    }
//    
//  
//    public String toString() {
//    	return 	"Nomor Barang    : " + nomorBarang +
//    			"\nNama            : " + namaProduk +
//    			"\nJumlah Stok     : " + jumlahUnit +
//    			"\nHarga           : " + hargaPerUnit +
//    			"\nNilai Stok      : " + getInventoryValue() +
//    			"\nStatus Produk   : " + (isActive() ? "Aktif" : "Dihentikan");
//    }
//}