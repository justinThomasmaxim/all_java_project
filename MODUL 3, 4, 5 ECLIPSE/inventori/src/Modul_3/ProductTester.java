package Modul_3;

// Class object
class Product{
	 // Atribut
   private int nomorBarang;
   private String namaProduk;
   private int jumlahUnitTersedia;
   private double hargaPerUnit;

   // Konstruktor tanpa parameter memberi nilai default
   public Product() {
      
   }

   // Konstruktor dengan parameter
   public Product(int nomorBarang, String namaProduk, int jumlahUnitTersedia, double hargaPerUnit) {
	   
	   // this berfungsi mengarahkan variabel tersebut ke atribut class bukan parameter pada method
       this.nomorBarang = nomorBarang;
       this.namaProduk = namaProduk;
       this.jumlahUnitTersedia = jumlahUnitTersedia;
       this.hargaPerUnit = hargaPerUnit;
   }

   // Getter dan Setter untuk nomorBarang
   public int getNomorBarang() {
       return nomorBarang;
   }

   public void setNomorBarang(int nomorBarang) {
       this.nomorBarang = nomorBarang;
   }

   
/*
* Accessors (getter): Metode yang mengembalikan (mendapatkan) 
* nilai dari setiap variabel kelas
* Mutators (setter): Metode yang mengubah (set) nilai setiap variabel 
* kelas
*/
   // Getter dan Setter untuk namaProduk
   public String getNamaProduk() {
       return namaProduk;
   }

   public void setNamaProduk(String namaProduk) {
       this.namaProduk = namaProduk;
   }

   // Getter dan Setter untuk jumlahUnitTersedia
   public int getJumlahUnitTersedia() {
       return jumlahUnitTersedia;
   }

   public void setJumlahUnitTersedia(int jumlahUnitTersedia) {
       this.jumlahUnitTersedia = jumlahUnitTersedia;
   }

   // Getter dan Setter untuk hargaPerUnit
   public double getHargaPerUnit() {
       return hargaPerUnit;
   }

   public void setHargaPerUnit(double hargaPerUnit) {
       this.hargaPerUnit = hargaPerUnit;
   }

   // Metode untuk menampilkan nilai variabel
   public void displayProductDetails() {
       System.out.println("Nomor : " + getNomorBarang());
       System.out.println("Nama  : " + getNamaProduk());
       System.out.println("Stok  : " + getJumlahUnitTersedia());
       System.out.println("Harga : " + getHargaPerUnit());
   }
}


// Class Driver atau Class utama
public class ProductTester {
	
	// Main Method atau Program Utama
    public static void main(String[] args) {
        // Membuat dan menginisialisasi objek Produk
    	Product product1 = new Product(); // Konstruktor default
    	Product product2 = new Product(); // Konstruktor default

    	Product product3 = new Product(1, "Ryzen 5 5600X		", 5, 5000000);
    	Product product4 = new Product(2, "GeForce RTX 3080		", 3, 8000000);
    	Product product5 = new Product(3, "Samsung Galaxy S21	", 10, 12000000);
    	Product product6 = new Product(4, "Logitech G Pro Mouse ", 20, 500000);

    	
        // Menampilkan detail produk ke konsol
        System.out.println("\nProduct 1:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2:");
        product2.displayProductDetails();

        System.out.println("\nProduct 3:");
        product3.displayProductDetails();

        System.out.println("\nProduct 4:");
        product4.displayProductDetails();

        System.out.println("\nProduct 5:");
        product5.displayProductDetails();

        System.out.println("\nProduct 6:");
        product6.displayProductDetails();
        
        
        
//        GETTER DAN SETTER
        
        System.out.println("\n");
        
     // Menampilkan 1 atribut saja
    	int nomor = product4.getNomorBarang();
    	System.out.println("Nomor : " + nomor);
    	
//    	Cara yang salah menampilkan atribut yang mempunyai hak akses private
//    	int nomor1 = product4.nomorBarang;
//    	System.out.println(nomor1);
//    	
    	System.out.println("\nNilai yang diubah");
    	// Contoh penggunaan setter untuk mengubah nilai
    	product3.setJumlahUnitTersedia(10);
    	System.out.println("\nProduct 3:");
        product3.displayProductDetails();

    	
    	
    }
}

