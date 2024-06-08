package rumahSakit;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Interface Pendaftaran
interface Pendaftaran {
    void daftarPasien(RumahSakit rumahSakit, Pasien pasien);
}

// Interface Pengeluaran
interface Pengeluaran {
    void keluarPasien(RumahSakit rumahSakit, int index);
}

// Interface Perubahan
interface Perubahan {
    void ubahPasien(RumahSakit rumahSakit, int index, Pasien pasien);
}

// Class Object Pasien
class Pasien {
    private String nama;
    private int umur;
    private String diagnosis;

    public Pasien(String nama, int umur, String diagnosis) {
        this.nama = nama;
        this.umur = umur;
        this.diagnosis = diagnosis;
    }

    // - - - - - (GETTER) - - - - -
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    // - - - - - (SETTER) - - - - -
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "\nNama    \t: " + nama + "\nUmur    \t: " + umur + "\nDiagnosis\t: " + diagnosis;
    }
}

class PasienRawatInap extends Pasien {
    private int lamaRawat;

    public PasienRawatInap(String nama, int umur, String diagnosis, int lamaRawat) {
    	// super pada subclass konstruktor digunakan untuk memanggil superclass konstruktor
        super(nama, umur, diagnosis);
        
        // this akan mengakses atribut pada kelas ini
        this.lamaRawat = lamaRawat;
    }

    public int getLamaRawat() {
        return lamaRawat;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLama Rawat\t: " + lamaRawat + " hari";
    }
}

class PasienPoli extends Pasien {
    private String poliTujuan;

    public PasienPoli(String nama, int umur, String diagnosis, String poliTujuan) {
    	// super pada subclass konstruktor digunakan untuk memanggil superclass konstruktor
    	super(nama, umur, diagnosis);
        
    	// this akan mengakses atribut pada kelas ini
    	this.poliTujuan = poliTujuan;
    }

    public String getPoliTujuan() {
        return poliTujuan;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPoli Tujuan\t: " + poliTujuan;
    }
}

class PasienUGD extends Pasien {
    private String keadaanDarurat;

    public PasienUGD(String nama, int umur, String diagnosis, String keadaanDarurat) {
    	// super pada subclass konstruktor digunakan untuk memanggil superclass konstruktor
    	super(nama, umur, diagnosis);
        
    	// this akan mengakses atribut pada kelas ini
    	this.keadaanDarurat = keadaanDarurat;
    }

    public String getKeadaanDarurat() {
        return keadaanDarurat;
    }

    @Override
    public String toString() {
        return super.toString() + "\nKeadaan Darurat\t: " + keadaanDarurat;
    }
}

// Jika mengimplementasikan interface Pendaftaran, Pengeluaran 
// maka diwajibkan menggunakan method pada interface Pendaftaran, Pengeluaran 
// ke dalam class objek RumahSakiit
class RumahSakit implements Pendaftaran, Pengeluaran, Perubahan {
    private List<Pasien> daftarPasien = new ArrayList<>();

    public void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    public void hapusPasien(int index) {
        daftarPasien.remove(index);
    }
    
    public void rubahPasien(int index, Pasien pasien) {
        daftarPasien.set(index, pasien);
    }

    public Pasien cariPasien(String nama) {
        for (Pasien pasien : daftarPasien) {
            if (pasien.getNama().equalsIgnoreCase(nama)) {
                return pasien;
            }
        }
        return null;
    }

    public List<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    // Memaksa class RumahSakit mengimplementasikan method daftarPasien
    public void daftarPasien(RumahSakit rumahSakit, Pasien pasien) {
        rumahSakit.tambahPasien(pasien);
    }

    // Memaksa class RumahSakit mengimplementasikan method keluarPasien
    public void keluarPasien(RumahSakit rumahSakit, int index) {
        rumahSakit.hapusPasien(index);
    }

    // Memaksa class RumahSakit mengimplementasikan method keluarPasien
    public void ubahPasien(RumahSakit rumahSakit, int index, Pasien pasien) {
    	rumahSakit.rubahPasien(index, pasien);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RumahSakit rumahSakit = new RumahSakit();

        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.println("\n+===========================+");
            System.out.println("|           Menu:           |");
            System.out.println("+===========================+");
            System.out.println("|1. Tambah Pasien           |");
            System.out.println("|2. Cari Pasien             |");
            System.out.println("|3. Tampilkan Daftar Pasien |");
            System.out.println("|4. Keluar                  |");
            System.out.println("|5. Ubah Pasien             |");
            System.out.println("|6. Hapus                   |");
            System.out.println("+===========================+");
            System.out.print("Pilih menu (1/2/3/4): ");

            try {
                int pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan Nama Pasien     : "); String nama = input.nextLine();
                        System.out.print("Masukkan Umur Pasien     : "); int umur = input.nextInt();
                        input.nextLine();
                        System.out.print("Masukkan Diagnosis Pasien: "); String diagnosis = input.nextLine();

                        System.out.println("Pilih Jenis Pasien:");
                        System.out.println("1. Rawat Inap");
                        System.out.println("2. Poli");
                        System.out.println("3. UGD");
                        System.out.print("Masukkan pilihan (1/2/3): ");  int jenisPasien = input.nextInt();
                        input.nextLine();

                        Pasien pasien = null;

                        switch (jenisPasien) {
                            case 1:
                                System.out.print("Masukkan Lama Rawat (hari): "); int lamaRawat = input.nextInt();
                                input.nextLine();
                                pasien = new PasienRawatInap(nama, umur, diagnosis, lamaRawat);
                                break;
                            case 2:
                                System.out.print("Masukkan Poli Tujuan: "); String poliTujuan = input.nextLine();
                                pasien = new PasienPoli(nama, umur, diagnosis, poliTujuan);
                                break;
                            case 3:
                                System.out.print("Masukkan Keadaan Darurat: "); String keadaanDarurat = input.nextLine();
                                pasien = new PasienUGD(nama, umur, diagnosis, keadaanDarurat);
                                break;
                            default:
                                System.out.println("Jenis pasien tidak valid.");
                        }

                        if (pasien != null) {
                            rumahSakit.tambahPasien(pasien);
                            System.out.println("Pasien berhasil ditambahkan.");
                        }
                        break;
                    case 2:
                    	 System.out.print("Masukkan Nama Pasien yang Dicari: ");
                         String namaCari = input.nextLine();
                         Pasien hasilCari = rumahSakit.cariPasien(namaCari);
                         if (hasilCari != null) {
                             System.out.println("\nData Pasien Ditemukan:");
                             System.out.println(hasilCari);
                         } else {
                             System.out.println("Pasien dengan nama tersebut tidak ditemukan.");
                         }
                         break;
                     case 3:
                         List<Pasien> daftarPasien = rumahSakit.getDaftarPasien();
                         System.out.println("\nDaftar Pasien:");
                         int i = 0;
                         for (Pasien p : daftarPasien) {
                        	 System.out.println("\nData ke-"+(i+1));
                             System.out.println(p);
                             i++;
                         }
                         break;
                     case 4:
                         System.out.println("\nProgram Berakhir.");
                         System.exit(0);
                         break;
                     case 5:
                    	 System.out.print("Masukkan data pasien ke berapa ingin diubah, ke-: ");
                         int index = input.nextInt();
                         input.nextLine();
                         System.out.print("Masukkan Nama Pasien     : ");  nama = input.nextLine();
                         System.out.print("Masukkan Umur Pasien     : ");  umur = input.nextInt();
                         input.nextLine();
                         System.out.print("Masukkan Diagnosis Pasien: ");  diagnosis = input.nextLine();
                         Pasien pasienDiubah = new Pasien(nama, umur, diagnosis);
                         rumahSakit.rubahPasien(index-1, pasienDiubah);
                         
                         break;
                     case 6:
                    	 System.out.print("Masukkan data pasien ke berapa ingin dihapus, ke-: "); int indeks = input.nextInt();
                         input.nextLine();
                         rumahSakit.hapusPasien(indeks-1);
                         break;
                     default:
                         System.out.println("\nMenu tidak valid. Silakan pilih menu yang benar.");
                 }
             } catch (Exception exception_message) {
                 System.out.println("Terjadi error " + exception_message);
             }

             System.out.print("\nTekan Enter untuk lanjut : ");
             input.nextLine();
         }
     }
 }
