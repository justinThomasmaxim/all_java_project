package MODUL_2;
import java.util.Scanner;
public class Nomor_1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int baris, kolom;
        clearScreen();
        // Input jumlah untuk baris dan kolom
        System.out.print("Masukkan jumlah baris : ");
        baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        kolom = input.nextInt();
        // Banyak array sesuai hasil inputan
        int[][] matrix1 = new int[baris][kolom];  
        int[][] matrix2 = new int[baris][kolom];
        int[][] sum = new int[baris][kolom];
        // Input elements pada matrik pertama
        System.out.println("Masukkan elemen untuk Matriks Pertama : ");
        for (int i = 0; i < baris; i++) {  // Looping pada baris
            for (int j = 0; j < kolom; j++) {
                matrix1[i][j] = input.nextInt();  // Looping pada kolom
            }
        }
        // Input elements pada matrik kedua
        System.out.println("Masukkan elemen untuk Matriks Kedua   : ");
        for (int i = 0; i < baris; i++) {  // Looping pada baris
            for (int j = 0; j < kolom; j++) {
                matrix2[i][j] = input.nextInt();  // Looping pada kolom
            }
        }
        // Menambahkan dua matrik
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                // Menjumlah matrik 1 dan matrik 2 menggunakkan looping pada baris dan kolom tersebut
                sum[i][j] = matrix1[i][j] + matrix2[i][j];  
            }
        }
        // Mencetak hasil Penjumlahan
        System.out.println("Hasil Penjumlahan Matrik :");
        for (int i = 0; i < baris; i++) {
            System.out.print("{ ");
            for (int j = 0; j < kolom; j++) {
                System.out.print(sum[i][j] + " ");  // Mencetak nilai pada baris kolom 
            }
            System.out.println("}");
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
