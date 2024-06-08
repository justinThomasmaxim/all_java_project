package Responsi;

import java.util.Scanner;

public class Tugas1 {
    // ==================== (Sort Data (mergesort)) ====================
    // Function mergesort
    // Array akan dibagi menjadi dua bagian hingga masing-masing hanya memiliki satu elemen
    public static void mergesort(int[] arr, int kiri, int kanan) {
        if (kiri < kanan) {
            int tengah = (kiri + kanan) / 2;
            // Mengurutkan bagian kiri dari array
            // Mengurutkan dari elemen kiri (dari index 0) sampai tengah
            mergesort(arr, kiri, tengah);
            // Mengurutkan bagian kanan dari array
            // Mengurutkan dari elemen tengah + 1 sampai kanan
            mergesort(arr, tengah + 1, kanan);
            // Conquer bagian yang diurutkan
            merge(arr, kiri, tengah, kanan);
        }
    }
    // Function merge
    // Dua bagian tersebut akan disatukan kembali secara berurutan
    public static void merge(int[] arr, int kiri, int tengah, int kanan) {
        // Misal user meinputkan jumlah elemen yaitu 4
        int n1 = tengah + 1 - kiri; // (1) + 1 - (0) = 2
        int n2 = kanan - tengah; // (3) - (1)     = 2
        int[] Left = new int[n1]; // salin n1 ke Left sebagai jumlah elemen pada Left
        int[] Right = new int[n2]; // salin n2 ke Right sebagai jumlah elemen pada Right
        for (int i = 0; i < n1; i++) {
            Left[i] = arr[kiri + i]; // salin dari kiri ke Left
        }
        for (int j = 0; j < n2; j++) {
            Right[j] = arr[tengah + 1 + j]; // salin dari tengah + 1 ke Right
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

    // ==================== (Sort Data (quicksort)) ====================
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // ==================== ( Search Data 1 (Sequential Search) ) ====================
    static void sequentialSearch(int[] arr, int cari) {
        int n = arr.length;
        boolean ditemukan = false;
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (arr[i] == cari) {
                System.out.println("Data " + cari + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
    
        if (ditemukan == false){
           System.out.println("Data " + cari + " tidak ditemukan");
        }
    }

    // ==================== ( Search Data 2 (Binary Search) ) ====================
    static void binarySearch(int[]arr, int cari) {
        int kiri = 0, kanan = arr.length - 1, tengah;
        boolean status = false;
        while(kiri <= kanan){
            tengah = (kiri + kanan) / 2;

            // Pengecekan apakah datanya ditemukan atau tidak
            if (arr[tengah] == cari) {
                // Jika datanya di temukan
                System.out.println("\nData " + cari + " ditemukan pada index ke-" + tengah);
                status = true;
                break;
            } else {
                // Jika datnya tidak ketemu
                // lakukan pengecekan 
                if (arr[tengah] < cari){
                    // jika nilai pada index tengah kurang dari nilai yang dicari
                    kiri = tengah + 1;
                } else {
                    // jika tidak
                    kanan = tengah - 1;
                }
            }
        } // Akhir while

        if (status == false) {
            System.out.println("\nData " + cari + " tidak ditemukan");
        }
    }


    // ==================== ( mencetak data pada array ) ====================
    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
    
    // ==================== (Program Utama) ====================
    public static void main(String[] args) {
        int menu, n = 0, arr[] = {};
        char pilih;
        boolean ulang = true;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\033[H\033[2J");
            System.out.println("====Responsi Alpro II====");
            System.out.println("======Main Tugas 1=======");
            System.out.println("1. Masukkan Data         ");
            System.out.println("2. Sort Data (quicksort) ");
            System.out.println("3. Sort Data (mergesort) ");
            System.out.println("4. Search Data 1 (Sequential Search) ");
            System.out.println("5. Search Data 2 (Binary Search)     ");
            System.out.println("6. Search Data 3         ");
            System.out.println("=========================");
            System.out.print("Masukkan Menu : ");
            menu = input.nextInt();
            System.out.println();
            switch (menu) {
                case 1:
                    System.out.print("Masukkan jumlah data : ");
                    n = input.nextInt();
                    arr = new int[n];
                    System.out.println("Masukkan data : ");
                    for (int i = 0; i < n; i++) {
                        arr[i] = input.nextInt();
                    }
                    System.out.println("\nData berhasil ditambahkan");
                    break;
                case 2:
                    System.out.print("Data      \t: ");
                    printArr(arr, n);

                    // salin elemen arr ke temp
                    int[] temp = new int[n];
                    for (int i = 0; i < n; i++) {
                        temp[i] = arr[i];
                    }

                    // menampilkan data terurut (quicksort)
                    quickSort(temp, 0, n - 1);
                    System.out.print("Data diurutkan\t: ");
                    printArr(temp, n);
                    break;
                case 3:
                    System.out.print("Data      \t: ");
                    printArr(arr, n);

                    // salin elemen arr ke temp
                    temp = new int[n];
                    for (int i = 0; i < n; i++) {
                        temp[i] = arr[i];
                    }

                    // menampilkan data terurut (mergesort)
                    mergesort(temp, 0, n - 1);
                    System.out.print("Data diurutkan\t: ");
                    printArr(temp, n);
                    break;
                case 4:
                    printArr(arr, n);
                    System.out.print("\nMasukkan data yang dicari : ");
                    int cari = input.nextInt();
                    sequentialSearch(arr, cari);
                    break;
                case 5:
                    printArr(arr, n);

                    // Pada binari search, data yang digunakan harus terurut 
                    // sehingga sebelum dilakukan proses pencarian data 
                    // urutkan datanya terlebih dahulu
                    // salin elemen arr ke temp
                    temp = new int[n];
                    for (int i = 0; i < n; i++) {
                        temp[i] = arr[i];
                    }

                    // menampilkan data terurut (mergesort)
                    mergesort(temp, 0, n - 1);
                    System.out.print("Data diurutkan\t: ");
                    printArr(temp, n);
                    System.out.print("\nMasukkan data yang dicari : ");
                    cari = input.nextInt();
                    binarySearch(temp, cari);
                    break;
                // case 6:
                    
                //     break;
                default:
                    System.out.println("Pilihan tidak valid.  Silahkan pilih menu yang tersedia");
                    break;
            }
            System.out.print("\nAnda ingin melanjutkan {y/t} : ");
            pilih = input.next().charAt(0);
            if (pilih == 't' || pilih == 'T') {
                System.out.println("\nSelesai");
                ulang = false;
            }

        } while (ulang);
    }
}

/*
Penjelasan singkat:

1. Program akan meminta pengguna untuk memasukkan jumlah elemen dan nilai-nilai elemen yang ingin diinputkan ke dalam array.

2. Program akan meminta pengguna untuk memilih apakah array akan diurutkan secara ascending atau descending menggunakan algoritma merge sort.

3. Program akan mencetak array yang diurutkan.

4. Program akan meminta pengguna untuk memasukkan elemen yang ingin dicari dalam array.

5. Program akan menggunakan sequential search, binary search, dan ... untuk mencari elemen yang dimasukkan oleh pengguna dalam array.

6. Program akan mencetak hasil pencarian untuk setiap algoritma pencarian yang digunakan.
*/
