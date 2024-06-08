package MODUL_3;
import java.util.Arrays;  // Menggunakkan fungsi sort (untuk mengurutkan data)

public class TugasPraktikum_Binary {
    public static void main(String[] args) {
        clearScreen();
        // 1. Buatlah 2 array untuk menyimpan data Produk dan Harga.
        String[] produk = {"Jaguar", "Lamborghini", "Honda", "Audi", "Suzuki", "Mazda", "Daihatsu", "Ford", "Hyundai", "Mitsubishi"};
        long[] harga = { 1340000000L, 34500000000L, 350000000L, 2000000000L, 245000000L, 500000000L, 169000000L, 789000000L, 122900000L, 278100000L };
        // Karena menggunakkan binary search, jika data belum terurut maka di urutkan terlebih dahulu
        Arrays.sort(produk);
        // Menampilkan data produk yang terurut;
        System.out.println(Arrays.toString(produk));


        // 2. Tampilkan produk bernama "Audi" serta lokasinya dalam struktur data Array.
        String nama = "Audi";
        binarySearch(produk, nama);


        // 3. Urutkanlah data harga dari nilai termurah hingga termahal.
        Arrays.sort(harga);
        System.out.println("\nHarga setelah diurutkan:");
        int i = 1;
        for (long h : harga) {
            System.out.println(i + ".  " + h);
            i++;
        }


        // 4. Tampilkan harga produk termurah nomor ke-2.
        if (harga.length >= 2) {
            System.out.println("\nHarga produk termurah nomor ke-2 yaitu " + produk[1] + " adalah " + harga[1]);
        } else {
            System.out.println("\nTidak ada harga produk termurah nomor ke-2");
        }


        // int indexAudi = binarySearch(produk, nama);
        // if (indexAudi != -1) {
        //     System.out.println("\nProduk " + nama + " berada di index " + indexAudi);
        // } else {
        //     System.out.println("\nProduk " + nama + " tidak ditemukan");
        // }
    }

    static void binarySearch(String[]kata, String key) {
        int low = 0, high = kata.length - 1, med;
        boolean status = false;
        while(low <= high){
            med = (low + high) / 2;

            // Pengecekan apakah datanya ditemukan atau tidak
            if (key.equalsIgnoreCase(kata[med])) {
                // Jika datanya di temukan
                System.out.println("\nProduk " + key + " berada pada posisi ke-" + (med + 1) + " dan index ke-" + med);
                status = true;
                break;
            } else {
                // Jika datnya tidak ketemu
                // lakukan pembagian array apakah lebih besar dari 0 atau lebih kecil dari 0
                if (key.compareTo(kata[med]) > 0){
                    // Cari datanya yang lebih dari 0
                    low = med + 1;
                } else {
                    // Jika key lebih kecil dari 0
                    high = med - 1;
                }
            }
        } // Akhir while

        if (status == false) {
            System.out.println("\nProduk " + key + " tidak ditemukan");
        }
    }

    static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.err.println("tidak bisa clear screen");
        }
    }
    

    // public static int binarySearch(String[] arr, String key) {
    //     int low = 0, high = arr.length - 1;
    //     while (low <= high) {
    //         int mid = low + (high - low) / 2;
    //         int cmp = key.compareTo(arr[mid]);
    //         if (cmp == 0) {
    //             return mid;
    //         } else if (cmp < 0) {
    //             high = mid - 1;
    //         } else {
    //             low = mid + 1;
    //         }
    //     }
    //     return -1;
    // }
}
