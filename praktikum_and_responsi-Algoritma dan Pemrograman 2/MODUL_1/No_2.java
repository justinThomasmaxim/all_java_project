package MODUL_1;
import java.util.*;

public class No_2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean ulang = true;
        do{
            clearScreen();  // Clear Screen
            garis();
            System.out.println(" Perhitungan Gaji Bersih \n");
            System.out.println("        Golongan");
            garis();
            System.out.println("1. Manager");
            System.out.println("2. Administrasi");
            System.out.println("3. Staff");
            garis();
            System.out.print("Golongan : ");
            char gol = input.next().charAt(0);
            System.out.print("Nama     : ");
            String nama = input.next();
            garis();
            int tunjangan = 0;
            int gaji_pokok,pajak,gaji_bersih;
            String jabatan = "";
            if (gol == '1'){
                jabatan = "Manager";
                tunjangan = 300000;
            }
            else if (gol == '2'){
                jabatan = "Administrasi";
                tunjangan = 200000;
            }
            else if (gol == '3'){
                jabatan = "Staff";
                tunjangan = 100000;
            }
            else{
                System.out.println("Pilihan tidak ada");
            }
            System.out.print("Gaji Pokok : ");
            gaji_pokok = input.nextInt();
            garis();
            pajak = gaji_pokok*5/100;  // Pajak = 5%
            gaji_bersih = gaji_pokok + tunjangan - pajak;
            clearScreen();
            System.out.println("Nama        : "+nama);
            System.out.println("Jabatan     : "+jabatan);
            System.out.println("\n");
            System.out.println("Gaji Pokok  : "+gaji_pokok);
            System.out.println("Tunjangan   : "+tunjangan);
            System.out.println("----------------------- +");
            System.out.println("              "+(gaji_pokok+tunjangan));
            System.out.println("Pajak       : "+pajak);
            System.out.println("----------------------- -");
            System.out.println("Gaji Bersih : "+gaji_bersih);
            garis();
            System.out.print("\nAnda ingin mengulang lagi {y/t} : ");
            char pilih = input.next().charAt(0);
            if(pilih == 't' || pilih == 'T'){
                ulang = false;
            }
        } while(ulang);
    }

    static void garis() {
        System.out.println("-------------------------");
    }
    
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
