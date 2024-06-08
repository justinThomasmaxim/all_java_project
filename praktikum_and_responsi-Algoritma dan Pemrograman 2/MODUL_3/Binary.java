package MODUL_3;

import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int N = 8;
        int A[] = { 5, 2, 9, 7, 1, 6, 8, 3 }; // Tanpa di sorting
        Arrays.sort(A);  // Di Sorting
        int BatasAtas, BatasBawah, Tengah;
        int cari = 2;
        BatasAtas = 0;
        BatasBawah = N - 1;
        Tengah = 0;
        boolean ketemu;
        ketemu = false;
        clearScreen();
        while ((BatasAtas <= BatasBawah) && (ketemu == false)) {
            Tengah = (BatasAtas + BatasBawah) / 2;
            if (A[Tengah] == cari) {
                ketemu = true;
            } else if (A[Tengah] <= cari) {
                BatasAtas = Tengah + 1;
            } else {
                BatasBawah = Tengah - 1;
            }
        }
        if (ketemu) {
            System.out.println("Angka : " + cari + "\nData berada di index nomor " + Tengah);
        } else {
            System.out.println("Angka :" + cari + "\nData tidak ditemukan");
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
}