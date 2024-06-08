package Produk;

// Subkelas DVD yang mewarisi dari kelas Produk
class DVD extends ProdukJF6 {
    private int lengthMinutes;   // Menyimpan durasi film dalam menit
    private int ageRating;       // Menyimpan rating usia film
    private String filmStudio;   // Menyimpan studio film

    // Konstruktor tunggal untuk kelas DVD, menerima nilai untuk setiap bidang instance
    public DVD(int nomor, String nama, int jumlah, double harga, int lengthMinutes, int ageRating, String filmStudio) {
        super(nomor, nama, jumlah, harga);  // Panggilan super() ke konstruktor Produk dengan parameter yang diperlukan
        this.lengthMinutes = lengthMinutes;
        this.ageRating = ageRating;
        this.filmStudio = filmStudio;
    }

    // GETTER (Pengambil) dan SETTER (penyetel) untuk bidang instance DVD
    
    public int getLengthMinutes() {
        return lengthMinutes;
    }

    public void setLengthMinutes(int lengthMinutes) {
        this.lengthMinutes = lengthMinutes;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    public String getFilmStudio() {
        return filmStudio;
    }

    public void setFilmStudio(String filmStudio) {
        this.filmStudio = filmStudio;
    }
    
    // Override metode getInventoryValue() dari superclass ProdukJF6
    @Override
    public double getInventoryValue() {
        // Mendapatkan harga dan kuantitas stok dari superclass ProdukJF6
        double harga = getHargaPerUnit();
        int jumlahUnit = getJumlahUnit();

        // Menghitung nilai inventaris dengan menambahkan biaya penyetokan ulang 5%
        double nilaiInventaris = jumlahUnit * harga * 1.05; // Menambah 5% ke nilai inventaris

        return nilaiInventaris;
    }
    
    // Override metode toString() untuk mencetak informasi lengkap tentang objek DVD
    @Override
    public String toString() {
        return "Nomor Barang    : " + getNomorBarang() +
                "\nNama            : " + getNamaProduk() +
                "\nJumlah Stok     : " + getJumlahUnit() +
                "\nHarga           : " + getHargaPerUnit() +
                "\nNilai Stok      : " + getInventoryValue() +
                "\nDurasi Film     : " + getLengthMinutes() +
                "\nRating Usia     : " + getAgeRating() +
                "\nStudio Film     : " + getFilmStudio() +
                "\nStatus Produk   : " + (isActive() ? "Aktif" : "Dihentikan");
    }
}
