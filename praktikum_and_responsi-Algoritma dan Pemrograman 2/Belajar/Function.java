package Belajar;
import java.util.*;

public class Function {
    private static Scanner input = new Scanner(System.in); 
    static void Garis(){
        System.out.println("==========================");
    }
    static String DeskeBin(int a){  // fungsi bertipe data = mengembalikan nilai
        String DeskeBin = "";
        while(a >0){
            DeskeBin = (a % 2) + DeskeBin;
            a = a / 2;
        }
        return DeskeBin;
    }
    public static void main(String[] args) {    // void = tidak ada nilai
        System.out.println("\033[H\033[2J");
        Garis();
        System.out.println("     Program Function");
        Garis();
        System.out.print("Masukkan angka desimal \t: ");
        int des = input.nextInt();
        System.out.println("");
        System.out.println("Konversi ke Biner \t: "+DeskeBin(des));


    }
}
