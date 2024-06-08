package MODUL_1;
import java.util.*;

public class No_1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        clearScreen();  // Clear Screen
        garis();
        System.out.println(" Program Menghitung Nilai Rata-Rata");
        garis();
        System.out.print("Jumlah Nilai yang akan di Input : ");
        int j = input.nextInt();
        int jumlah = 0;
        for (int i = 1;i<=j;i++){
            System.out.print("Nilai ke-"+i+" : ");
            int nilai = input.nextInt();
            jumlah = jumlah + nilai;
        }
        garis();
        System.out.println("Total Nilai Keseluruhan adalah "+jumlah);
        
        System.out.println("Rata-rata = Total Nilai / Banyak Data");
        System.out.println("Rata-rata = " + jumlah + "/" + j);
    
        float rata2 = jumlah / j;
        
        System.out.println("Rata-rata = "+rata2);
        garis();
        System.out.println("Jadi, rata-rata nilai adalah "+rata2);
        garis();
    }

    static void garis() {
        System.out.println("------------------------------------");
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
