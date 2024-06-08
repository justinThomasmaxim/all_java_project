package Produk;

//Subkelas CD yang mewarisi dari kelas Produk
class CD extends ProdukJF6 {
	 private String artist;         // Menyimpan nama artis CD
	 private int numberOfSongs;     // Menyimpan jumlah lagu dalam CD
	 private String label;          // Menyimpan label CD
	
	 // Konstruktor tunggal untuk kelas CD, menerima nilai untuk setiap bidang instance
	 public CD(int nomor, String nama, int jumlah, double harga, String artist, int numberOfSongs, String label) {
	     super(nomor, nama, jumlah, harga);  // Panggilan super() ke konstruktor Produk dengan parameter yang diperlukan
	     this.artist = artist;
	     this.numberOfSongs = numberOfSongs;
	     this.label = label;
	 }
	
	// GETTER (Pengambil) dan SETTER (penyetel) untuk bidang instance DVD
	 
	 public String getArtist() {
	        return artist;
	 }

     public void setArtist(String artist) {
        this.artist = artist;
     }

     public int getNumberOfSongs() {
        return numberOfSongs;
     }

     public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
     }

     public String getLabel() {
        return label;
     }

     public void setLabel(String label) {
        this.label = label;
     }
     
     // Override metode toString() untuk mencetak informasi lengkap tentang objek CD
     @Override
     public String toString() {
         return "Nomor Barang    : " + getNomorBarang() +
                 "\nNama            : " + getNamaProduk() +
                 "\nJumlah Stok     : " + getJumlahUnit() +
                 "\nHarga           : " + getHargaPerUnit() +
                 "\nNilai Stok      : " + getInventoryValue() +
                 "\nArtis           : " + getArtist() +
                 "\nJumlah Lagu     : " + getNumberOfSongs() +
                 "\nLabel           : " + getLabel() +
                 "\nStatus Produk   : " + (isActive() ? "Aktif" : "Dihentikan");
     }
}




