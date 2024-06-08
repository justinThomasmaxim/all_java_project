package MODUL_3;
import java.util.Arrays;

public class TugasPraktikum_Sequential {
    // 1. Buatlah 2 array untuk menyimpan data Produk dan Harga.
    public static String[] produk = { "Jaguar", "Lamborghini", "Honda", "Audi", "Suzuki",
                                      "Mazda", "Daihatsu", "Ford", "Hyundai", "Mitsubishi"};
    public static long[] harga = {1340000000L, 34500000000L, 350000000L, 2000000000L, 245000000L, 
                                  500000000L, 169000000L, 789000000L, 122900000L, 278100000L};

    public static void main(String[] args)  {
        clearScreen();
        // Menampilkan data produk tidak terurut
        System.out.println(Arrays.toString(produk));

        // 2. Tampilkan produk bernama "Audi" serta lokasinya dalam struktur data Array.
        // Menggunakkan sequential search
        int indexAudi = -1;
        String nama = "Audi";
        for (int i = 0; i < produk.length; i++) {
            if (produk[i].equalsIgnoreCase(nama)) {
                indexAudi = i;
                break;
            }
        }
        if (indexAudi != -1) {
            System.out.println("\nProduk " + nama + " berada pada posisi ke-" + (indexAudi+1) + " dan index ke-" + indexAudi);
        } else {
            System.out.println("\nProduk " + nama + " tidak ditemukan");
        }
        // 3. Urutkanlah data harga dari nilai termurah hingga termahal.
        Arrays.sort(harga);
        System.out.println("\nHarga setelah diurutkan:");
        // Mencetak semua data pada variabel harga
        int i = 1;
        for (long h : harga) {
            System.out.println(i + ".  " + h);
            i++;
        }
        // 4. Tampilkan harga produk termurah nomor ke-2.
        if (harga.length >= 2) {
            System.out.println("\nHarga produk termurah nomor ke-2 y adalah " + harga[1]);
        } else {
            System.out.println("\nTidak ada harga produk termurah nomor ke-2");
        }
    }
        
    static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.err.println("tidak bisa clear screen");
        }
    }
}
