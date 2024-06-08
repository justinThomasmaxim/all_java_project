package MODUL_1;
import java.util.Scanner;

public class Tugas {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, tambah, kurang;
        System.out.print(" Bilangan Pertama : ");
        a = input.nextInt();
        System.out.print(" Bilangan Kedua : ");
        b = input.nextInt();
        tambah = a + b;
        kurang = a - b;
        System.out.println(" Hasil Penjumlahan :" + tambah);
        System.out.println(" Hasil Pengurangan :" + kurang);
    }
}
