package MODUL_3;

import java.util.Scanner;

public class seq {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] data = { 99, 20, 17, 8, 27, 5, 21, 10, 41, 11 };
        System.out.print("Masukkan data : ");
        int cari = input.nextInt();
        int i;
        boolean ditemukan = false;
        for (i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                ditemukan = true;
                break; // jika data dicari ditemukan maka break (berhenti)
            }
        }
        if (ditemukan) {
            System.out.println("Data : " + cari + " \nDitemukan Pada Index :" + i + ".");
        } else {
            System.out.println("Data Tidak di temukan");
        }
    }
}
