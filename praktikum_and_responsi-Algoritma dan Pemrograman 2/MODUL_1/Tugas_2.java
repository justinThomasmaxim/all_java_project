package MODUL_1;  // Menyesuaikan nama foldernya
import java.util.*;  // Menggunakkan library Scanner

public class Tugas_2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        clearScreen();  // Melakukan pemanggilan fungsi clear screen
        System.out.print("Masukkan bilangan bulat positif : ");
        int angka = input.nextInt();
        System.out.println("Faktorial dari " + angka + " adalah " + Faktorial(angka));

    }
    static int Faktorial(int angka) {
        if (angka == 1) {
            return 1;
        } else {
            // Jika angka yang di input user nilainya tidak sama dengan 1,
            // maka akan ada perhitungan angka di input tadi dikalikan dengan angka yang dikurangkan 1 hasil pemanggilan,
            // kemudian akan berhenti jika angka sudah sama dengan 1
            return angka*Faktorial(angka-1);
        }
    }
    // Fungsi clear screen untuk layar consol
    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.err.println("tidak bisa clear screen");
        }
    }
}
