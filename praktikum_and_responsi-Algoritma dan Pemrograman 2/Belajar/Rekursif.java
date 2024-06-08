package Belajar;

import java.util.*;

public class Rekursif{
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            
            System.out.print("\033[H\033[2J");    // Code Clear Screen
            int a, p;
            char ulang;
            System.out.print("Masukkan Angka  \t: ");
            a = input.nextInt();
            System.out.print("Masukkan Pangkat \t: ");
            p = input.nextInt();
            System.out.println("Hasil Faktorial \t: " +Faktor(a, p)+"\n"); 
            System.out.print("Anda Ingin Lagi (y/t)\t: ");
            ulang = input.next().charAt(0);
            if (ulang == 't' || ulang == 'T'){
                System.out.println("");
                System.out.println("Selesai");
                break;
            }
        }while(true);

    }    
    static int Faktor(int a, int p){
        if (p>=1){
            return a*Faktor(a,p-1);
        }else{
            return 1;
        }
    }
}
