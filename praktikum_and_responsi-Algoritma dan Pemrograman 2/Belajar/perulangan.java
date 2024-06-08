package Belajar;

import java.util.*;

public class perulangan {
    private static Scanner input = new Scanner(System.in);
    static void Garis(){
        System.out.println("==============================");
    }
    public static void main(String[] args) {
        do{
            System.out.println("\033[H\033[2J");
            Garis();
            System.out.println("     Program Perulangan ");
            Garis();
            System.out.print("Masukkan berapa Perulangan : ");
            int n = input.nextInt();
            for(int i = 1 ;i <= n;i++){
                System.out.println("Perulangan ke-"+i);
            }
            Garis();
            System.out.print("Anda Ingin Mengulang Lagi (y/t) : ");
            char ulang = input.next().charAt(0);
            if (ulang == 't' || ulang == 'T'){
                System.out.println("");
                System.out.println("Selesai");
                break;
            }
        }while(true);
    }
}
