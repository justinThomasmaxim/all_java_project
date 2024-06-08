package MODUL_2;
import java.util.Arrays;
import java.util.Scanner;
public class Nomor_3 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {   // Program Utama
        clearScreen();
        // Input jumlah elemen
        System.out.print("Masukkan jumlah elemen : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println("\nArray = " + Arrays.toString(arr));
        // Mengurutkan array menggunakkan function conquer
        // 0 adalah index pertama dan n-1 adalah index terakhir array
        divide(arr, 0, n - 1);
        // Mencetak array yang diurutkan
        printArray(arr, n);
    }
    static void printArray(int[] arr, int n) {
        System.out.print("\nArray terurut = ");
        System.out.print("[ ");
        // Mencetak data pada semua elemennya menggunakkan looping
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
    // Function divide
    // Array akan dibagi menjadi dua bagian hingga masing-masing hanya memiliki satu elemen
    public static void divide(int[] arr, int kiri, int kanan) {
        if (kiri < kanan) {
            int tengah = (kiri + kanan) / 2;
            // Mengurutkan bagian kiri dari array
            // Mengurutkan dari elemen kiri (dari index 0) sampai tengah
            divide(arr, kiri, tengah);
            // Mengurutkan bagian kanan dari array
            // Mengurutkan dari elemen tengah + 1 sampai kanan
            divide(arr, tengah + 1, kanan);
            // Conquer bagian yang diurutkan
            conquer(arr, kiri, tengah, kanan);
        }
    }
    // Function conquer
    // Dua bagian tersebut akan disatukan kembali secara berurutan
    public static void conquer(int[] arr, int kiri, int tengah, int kanan) {
        // Misal user meinputkan jumlah elemen yaitu 4
        int n1 = tengah + 1 - kiri;  // (1) + 1 - (0) = 2
        int n2 = kanan - tengah;     // (3) - (1)     = 2
        int[] Left = new int[n1];  // salin n1 ke Left sebagai jumlah elemen pada Left
        int[] Right = new int[n2]; // salin n2 ke Right sebagai jumlah elemen pada Right
        for (int i = 0; i < n1; i++) {
            Left[i] = arr[kiri + i];  // salin dari kiri ke Left
        }
        for (int j = 0; j < n2; j++) {
            Right[j] = arr[tengah + 1 + j];  // salin dari tengah + 1 ke Right
        }
        int i = 0, j = 0, k = kiri;
        // Pengecekan bagian kiri (larik 1) dan kanan (larik 2)
        // Diurutkan dari kecil terbesar
        while (i < n1 && j < n2) {
            // Jika pada bagian kiri lebih kecil dari atau sama dengan bagian kanan,
            // maka salin elemen Left[i] ke arr[k] 
            // Jika tidak, maka salin elemen Right[i] ke arr[k]
            if (Left[i] <= Right[j]) {
                // Jika elemen pertama pada larik 1 lebih kecil dari larik 2
                arr[k] = Left[i];
                // maka elemen pertama pada larik 1 akan di salin ke elemen pertama array
                i++; // Maju 1 posisi ke kanan pada larik 1
            } else {
                // Jika tidak, elemen pertama pada larik ke 2 lah yang akan disalin ke elemen pertama array
                arr[k] = Right[j];
                j++; // Maju 1 posisi ke kanan pada larik 2
            }
            k++; // Array maju 1 posisi ke kanan
            // ( PROSES BERULANG SAMPAI ELEMEN TERAKHIR)
        }
        // Menyalin sisa larik 1 ke Array, jika masih ada
        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }
        // Menyalin sisa larik 2 ke Array, jika masih ada
        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
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