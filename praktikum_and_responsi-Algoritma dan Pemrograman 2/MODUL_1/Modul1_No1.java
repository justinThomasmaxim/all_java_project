package PR;
import java.util.*;

public class Modul1_No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\033[H\033[2J");  // Clear Screen
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
        System.out.println();
        System.out.println("Rata-rata = Total Nilai / Banyak Data");
        System.out.println("Rata-rata = "+jumlah+"/"+j);
        int rata2 = jumlah/j;
        System.out.println("Rata-rata = "+rata2);
        garis();
    }
        static void garis(){
            System.out.println("------------------------------------");
        }
}
