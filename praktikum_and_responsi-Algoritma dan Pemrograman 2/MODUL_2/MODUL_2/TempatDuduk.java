package MODUL_2;

import java.util.Scanner;

public class TempatDuduk {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Menggunakkan array multi dimensi dengan tipe data string
        String[][] meja = new String[2][3];
        clearScreen();
        // Meinputkan nilai pada baris dan kolom dengan menggunakan looping
        for (int bar = 0; bar < meja.length; bar++) {
            for (int kol = 0; kol < meja[bar].length; kol++) {
                System.out.format("Siapa yang akan duduk di meja (%d,%d): ", bar, kol);
                meja[bar][kol] = scan.nextLine();
            }
        }
        System.out.println("-------------------------");
        // Mencetak semua nilai baris dan kolom yang di inputkan
        // tadi dengan menggunakkan looping
        for (int bar = 0; bar < meja.length; bar++) {
            for (int kol = 0; kol < meja[bar].length; kol++) {
                System.out.format("| %s | \t", meja[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }

    // sebuah procedure untuk clearscreen
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

