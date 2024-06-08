package responsi;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Interface Pendaftaran
interface Pendaftaran {
    void daftarAnggotaHobi(KlubHobi klubhobi, Anggota anggota);
}

// Interface Pengeluaran
interface Pengeluaran {
    void keluarAnggotaHobi(KlubHobi klubhobi, Anggota anggota);
}

// Interface Perubahan
interface Perubahan {
    void ubahAnggotaHobi(KlubHobi klubhobi, int index, Anggota anggota);
}

// Class Object Anggota
class Anggota {
    private String nama;
    private int umur;

    // Konstruktor dengan parameter 
    // Konstruktor ini akan menginisialisasi variabel kelas dengan 
    // nilai yang dikirim dari kelas driver utama. 
    public Anggota(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // - - - - - (GETTER) - - - - -
    // Accessors (getter): Metode yang mengembalikan (mendapatkan) nilai 
    // dari setiap variabel kelas. 

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // - - - - - (SETTER) - - - - -
    // Mutators (setter): Metode yang mengubah (set) nilai setiap variabel kelas.
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "\nNama    \t: " + nama + "\nUmur    \t: " + umur;
    }
}

// - - - - - (INHERITANCE/PEWARISAN) - - - - -
// Untuk menerapkan inheritance, gunakan keyword extends
class hobiOlahraga extends Anggota {	
    private String jenisOlahraga;
    private int nomorPunggung;
    private String posisi;

    public hobiOlahraga(String nama, int umur,  String jenisOlahraga, int nomorPunggung, String posisi) {
    	// super pada subclass konstruktor digunakan untuk memanggil superclass konstruktor
        super(nama, umur);
        
        // this akan mengakses atribut pada kelas ini
        this.jenisOlahraga = jenisOlahraga;
        this.nomorPunggung = nomorPunggung;
        this.posisi        = posisi;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOlahraga\t: " + jenisOlahraga + "\nNomor Punggung\t: " + nomorPunggung + "\nPosisi   \t: " + posisi;
    }
}

// - - - - - (INHERITANCE/PEWARISAN) - - - - -
// Untuk menerapkan inheritance, gunakan keyword extends
class hobiMemasak extends Anggota {
    private String masakanFavorit;

    public hobiMemasak(String nama, int umur, String masakanFavorit) {
    	// super pada subclass konstruktor digunakan untuk memanggil superclass konstruktor
    	super(nama, umur);
        
    	// this akan mengakses atribut pada kelas ini
    	this.masakanFavorit = masakanFavorit;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMasakan Favorit\t: " + masakanFavorit;
    }
}

// - - - - - (INHERITANCE/PEWARISAN) - - - - -
// Untuk menerapkan inheritance, gunakan keyword extends
class hobiMusik extends Anggota {
    private String alatMusik;

    public hobiMusik(String nama, int umur, String alatMusik) {
    	// super pada subclass konstruktor digunakan untuk memanggil superclass konstruktor
    	super(nama, umur);
        
    	// this akan mengakses atribut pada kelas ini
    	this.alatMusik = alatMusik;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAlat Musik\t: " + alatMusik;
    }
}

// Jika mengimplementasikan interface Pendaftaran, Pengeluaran, Perubahan 
// maka diwajibkan menggunakan method pada interface Pendaftaran, Pengeluaran, Perubahan 
// ke dalam class objek KlubHobi
class KlubHobi implements Pengeluaran, Pendaftaran,  Perubahan {
	// Array list merupakan sebuah class yang memungkinkan kita 
	// membuat sebuah objek untuk menampung apapun
    private List<Anggota> daftarAnggota = new ArrayList<Anggota>();

    public void tambahAnggota(Anggota anggota) {
    	
    	// method add berfungsi untuk menambahkan nilai pada array list
        daftarAnggota.add(anggota);
    }

    public void hapusAnggota(Anggota anggota) {
    	
    	// method remove berfungsi untuk menghapus nilai pada array list
        daftarAnggota.remove(anggota);
    }
    
    public void rubahAnggota(int index, Anggota anggota) {
    	
    	// method set berfungsi untuk mengubah nilai pada array list berdasarkan index 
        daftarAnggota.set(index, anggota);
    }

    public Anggota cariAnggota(String nama) {
        for (Anggota anggota : daftarAnggota) {
        	
        	// equalsIgnoreCase berfungsi membandingkan 2 variable bertipe data string 
        	// tidak akan melihat huruf besar ataupun kecil, yang terpenting mempunyai nilai yang sama
            if (anggota.getNama().equalsIgnoreCase(nama)) {
                return anggota;
            }
        }
        return null;
    }

    public List<Anggota> getDaftarAnggotaHobi() {
        return daftarAnggota;
    }

    // Memaksa class KlubHobi mengimplementasikan method daftarAnggotaHobi
    public void daftarAnggotaHobi(KlubHobi klubhobi, Anggota anggota) {
        klubhobi.tambahAnggota(anggota);
    }

    // Memaksa class KlubHobi mengimplementasikan method keluarAnggotaHobi
    public void keluarAnggotaHobi(KlubHobi klubhobi, Anggota anggota) {
        klubhobi.hapusAnggota(anggota);
        System.out.println("Anggota " + anggota.getNama() + " telah dikeluarkan dari Klub Hobi.");
        
    }

    // Memaksa class KlubHobi mengimplementasikan method ubahAnggotaHobi
    public void ubahAnggotaHobi(KlubHobi klubhobi, int index, Anggota anggota) {
    	klubhobi.rubahAnggota(index, anggota);
    }

}

// Class Driver Main
public class Main {
	// Main Method
    public static void main(String[] args) {
    	
    	// Inputasi melalui keyboard menggunakan Scanner membutuhkan 
    	// pernyataan import berikut import java.util.Scanner. Untuk membaca 
    	// masukan yang telah dimasukkan pengguna, gunakan objek Java scanner. 
    	// Cara untuk menginisialisasi Scanner:
        Scanner input = new Scanner(System.in);
        
        KlubHobi klubhobi = new KlubHobi();
        boolean inputClose = false;

        // While adalah perulangan Perulangan yang mendifinisikan kondisi diawal blok. 
        // Apabila kondisi tidak terpenuhi(bernilai false) 
        // maka perulangan pun tidak akan pernah dilakukan.
        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.println("\n+============================+");
            System.out.println("|           Menu:            |");
            System.out.println("+============================+");
            System.out.println("|1. Tambah Anggota           |");
            System.out.println("|2. Cari Anggota             |");
            System.out.println("|3. Tampilkan Daftar Anggota |");
            System.out.println("|4. Ubah Anggota             |");
            System.out.println("|5. Hapus Anggota            |");
            System.out.println("|6. Keluar                   |");
            System.out.println("+============================+");
            System.out.print("Pilih menu (1/2/3/4/5/6): ");

            // Untuk menangani error dijava, digunakan statement try..catch.
            // berfungsi untuk mengurung eksekusi yang menampilkan error dan dapat membuat program
            // tetap berjalan tanpa dihentikan secara langsung.
            // Error yang ditangani oleh try..catch biasa disebut dengan exception
            try {
            	// Mengscan token berikutnya sebagai suatu nilai int
                int pilihan = input.nextInt();
                
                // Memindahkan scanner ke baris berikutnya dan mengembalikan nilai dalam string
                input.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan Nama : ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan Umur : ");
                        int umur = input.nextInt();
                        input.nextLine();

                        System.out.println("\n+======================+");
                        System.out.println("|         Hobi         |");
                        System.out.println("+======================+");
                        System.out.println("|1. Olahraga           |");
                        System.out.println("|2. Memasak            |");
                        System.out.println("|3. Bermain Alat Musik |");
                        System.out.println("+======================+");
                        System.out.print("Masukkan pilihan (1/2/3): ");
                        int jenisHobi = input.nextInt();
                        input.nextLine();

                        Anggota anggota = null;

                        switch (jenisHobi) {
                        
                        	// Pada case ini, terdapat Polimorfisme yaitu berubah bentuk. 
                        	// Variabel anggota menggunakan tipe data Anggota. Akan tetapi, dapat di inisialisasikan
                        	// dengan subclass konstruktor hobiOlahraga, hobiMemasak, dan hobiMusik
                            case 1:
                                System.out.print("Masukkan jenis olahraga  : ");
                                String jenisOlahraga = input.nextLine();
                                System.out.print("Masukkan nomor punggung  : ");
                                int nomorPunggung = input.nextInt();
                                input.nextLine();
                                System.out.print("Masukkan posisi          : ");
                                String posisi = input.nextLine();        
                                anggota = new hobiOlahraga(nama, umur, jenisOlahraga, nomorPunggung, posisi);
                                break;
                            case 2:
                                System.out.print("Masukkan Masakan Favorit : ");
                                String masakanFavorit = input.nextLine();
                                anggota = new hobiMemasak(nama, umur, masakanFavorit);
                                break;
                            case 3:
                                System.out.print("Masukkan Alat Musik      : ");
                                String alatMusik = input.nextLine();
                                anggota = new hobiMusik(nama, umur, alatMusik);
                                break;
                            default:
                                System.out.println("Jenis hobi tidak valid.");
                        }

                        if (anggota != null) {
                            klubhobi.tambahAnggota(anggota);
                            System.out.println("Anggota dan Hobinya berhasil ditambahkan.");
                        }
                        break;
                    case 2:
                        System.out.print("Masukkan Nama Anggota yang Dicari: ");
                        String namaCari = input.nextLine();
                        Anggota hasilCari = klubhobi.cariAnggota(namaCari);
                        if (hasilCari != null) {
                            System.out.println("\nData " + namaCari + " Ditemukan:");
                            System.out.print("-------------------------------");
                            System.out.println(hasilCari);
                        } else {
                            System.out.println("Data " + namaCari + " tidak ditemukan.");
                        }
                        break;
                    case 3:
                        List<Anggota> daftarAnggotaHobi = klubhobi.getDaftarAnggotaHobi();
                        System.out.println("\nDaftar Anggota dan Hobinya:");
                        int i = 0;
                        for (Anggota p : daftarAnggotaHobi) {
                            System.out.println("\nData ke-" + (i + 1));
                            System.out.print("-------------------------------");
                            System.out.println(p);
                            i++;
                        }
                        break;
                    case 4:
                        System.out.print("Masukkan data anggota ke berapa ingin diubah, ke-: ");
                        int index = input.nextInt();
                        input.nextLine();
                        System.out.print("Masukkan Nama : ");
                        nama = input.nextLine();
                        System.out.print("Masukkan Umur : ");
                        umur = input.nextInt();
                        input.nextLine();

                        System.out.println("\n+======================+");
                        System.out.println("|         Hobi         |");
                        System.out.println("+======================+");
                        System.out.println("|1. Olahraga           |");
                        System.out.println("|2. Memasak            |");
                        System.out.println("|3. Bermain Alat Musik |");
                        System.out.println("+======================+");
                        System.out.print("Masukkan pilihan (1/2/3): ");
                        jenisHobi = input.nextInt();
                        input.nextLine();

                        Anggota anggotaDiubah = null;
                        switch (jenisHobi) {
	                        
	                     	// Pada case ini, terdapat Polimorfisme yaitu berubah bentuk. 
	                    	// Variabel anggota menggunakan tipe data Anggota. Akan tetapi, dapat di inisialisasikan
	                    	// dengan subclass konstruktor hobiOlahraga, hobiMemasak, dan hobiMusik
                            case 1:
                                System.out.print("Masukkan jenis olahraga  : ");
                                String jenisOlahraga = input.nextLine();
                                System.out.print("Masukkan nomor punggung  : ");
                                int nomorPunggung = input.nextInt();
                                input.nextLine();
                                System.out.print("Masukkan posisi          : ");
                                String posisi = input.nextLine();
                                anggotaDiubah = new hobiOlahraga(nama, umur, jenisOlahraga, nomorPunggung, posisi);
                                break;
                            case 2:
                                System.out.print("Masukkan Masakan Favorit : ");
                                String masakanFavorit = input.nextLine();
                                anggotaDiubah = new hobiMemasak(nama, umur, masakanFavorit);
                                break;
                            case 3:
                                System.out.print("Masukkan Alat Musik      : ");
                                String alatMusik = input.nextLine();
                                anggotaDiubah = new hobiMusik(nama, umur, alatMusik);
                                break;
                            default:
                                System.out.println("Jenis hobi tidak valid.");
                        }

                        klubhobi.rubahAnggota(index - 1, anggotaDiubah);
                        System.out.println("Anggota dan Hobinya berhasil diubah.");
                        break;
                    case 5:
                        System.out.print("Masukkan nama anggota yang akan dikeluarkan: ");
                        String namaKeluarkan = input.nextLine(); // Membaca nama anggota yang akan dikeluarkan.

                        Anggota anggotaKeluarkan = klubhobi.cariAnggota(namaKeluarkan); // Mencari anggota yang akan dikeluarkan.

                        if (anggotaKeluarkan != null) { // Jika anggota ditemukan.
                            klubhobi.keluarAnggotaHobi(klubhobi, anggotaKeluarkan); // Mengeluarkan anggota dari rumah sakit.
                        } else {
                            System.out.println("Anggota tidak ditemukan."); // Jika anggota tidak ditemukan.
                        }
                        break;
                    case 6:
                        System.out.println("\nProgram Berakhir.");
                        System.exit(0);
                        inputClose = true;
                        break;

                    default:
                        System.out.println("\nMenu tidak valid. Silakan pilih menu yang benar.");
                }
            } catch (Exception exception_message) {
                System.out.println("Terjadi error " + exception_message);
            }

            System.out.print("\nTekan Enter untuk lanjut : ");
            input.nextLine();

            // Jika program berakhir maka akan menutup scanner dengan method close()
            if (inputClose) {
                input.close();
            }
        }
    } 
}
