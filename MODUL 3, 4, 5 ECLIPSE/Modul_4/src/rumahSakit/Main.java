package rumahSakit;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Class Object Pasien
class Pasien {
    private String nama;
    private int umur;
    private String diagnosis;

    // Konstruktor dengan paramter untuk inisialisasi objek Pasien
    public Pasien(String nama, int umur, String diagnosis) {
        this.nama = nama;
        this.umur = umur;
        this.diagnosis = diagnosis;
    }

    // Getter untuk nama pasien
    public String getNama() {
        return nama;
    }
    
    // Getter untuk umur pasien
    public int getUmur() {
        return umur;
    }
    
    // Getter untuk diagnosis pasien
    public String getDiagnosis() {
        return diagnosis;
    }
    
    // Setter untuk nama pasien
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Setter untuk umur pasien
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    // Setter untuk diagnosis pasien
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Representasi String dari objek Pasien
    public String toString() {
        return "\nNama    \t: " + nama + "\nUmur    \t: " + umur + "\nDiagnosis\t: " + diagnosis;
    }
}

//Class Object RumahSakit
class RumahSakit {
	// Membuat List untuk menyimpan data ke objek Pasien
    private List<Pasien> daftarPasien = new ArrayList<>();

    // Menambahkan pasien ke daftar pasien rumah sakit
    public void tambahPasien(Pasien pasien) {
    	// menggunakan fungsi add() pada List untuk menambahkan objek Pasien ke daftarPasien
        daftarPasien.add(pasien);
    }
    
    // Mencari pasien berdasarkan nama
    public Pasien cariPasien(String nama) {
    	// For each
        for (Pasien pasien : daftarPasien) {
        	// Memeriksa apakah nama pasien saat ini (pasien.getNama()) 
        	// sama dengan nama yang dicari (nama),
        	// mengabaikan perbedaan huruf besar dan kecil. 
            if (pasien.getNama().equalsIgnoreCase(nama)) {
                return pasien; // Mengembalikan objek Pasien jika ditemukan
            }
        }
        return null; // Mengembalikan null jika pasien tidak ditemukan
    }

    // Getter untuk daftar pasien
    public List<Pasien> getDaftarPasien() {
        return daftarPasien; // Mengembalikan daftar pasien
    }
}


// Class Driver atau Class Utama
public class Main {
	// Main Method atau Program Utama
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	     RumahSakit rumahSakit = new RumahSakit();
	     
	     while (true) {
	    	 // Clear Screen
	    	System.out.print("\033[H\033[2J");
	    	System.out.println("\n+===========================+");
            System.out.println("|           Menu:           |");
            System.out.println("+===========================+");
            System.out.println("|1. Tambah Pasien           |");
            System.out.println("|2. Cari Pasien             |");
            System.out.println("|3. Tampilkan Daftar Pasien |");
            System.out.println("|4. Keluar                  |");
            System.out.println("+===========================+");
            System.out.print("Pilih menu (1/2/3/4): ");        
            
            try {
            	 // Bagian yang akan terjadi error apabila menginputkan data berupa string bukan integer
            	 // Ditangani dengan menggunakan try-catch agar membuat program tetap berjalan
            	 int pilihan = input.nextInt();  
                 input.nextLine(); // Membaca karakter newline
                 
                 switch (pilihan) {
                     case 1:
                         System.out.print("Masukkan Nama Pasien     : ");
                         String nama = input.nextLine();           
                         
                         // Bagian yang akan terjadi error
                         System.out.print("Masukkan Umur Pasien     : ");
                         int umur = input.nextInt();
                         
                         input.nextLine(); // Membaca karakter newline
                         System.out.print("Masukkan Diagnosis Pasien: ");
                         String diagnosis = input.nextLine();

                         Pasien pasien = new Pasien(nama, umur, diagnosis);
                         rumahSakit.tambahPasien(pasien);
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
                         for (Pasien p : daftarPasien) {
                             System.out.println(p);
                         }
                         break;
                     case 4:
                         System.out.println("\nProgram Berakhir.");
                         System.exit(0);
                         break;
                     default:
                         System.out.println("\nMenu tidak valid. Silakan pilih menu yang benar.");
                 }
              // Exception adalah Error yang ditangani oleh try..catch
            } catch (Exception exception_message) {
            	System.out.println("Terjadi error "+ exception_message);
            }           
            System.out.print("\nTekan Enter untuk lanjut : ");
            input.nextLine(); 
        }    
	}
}
