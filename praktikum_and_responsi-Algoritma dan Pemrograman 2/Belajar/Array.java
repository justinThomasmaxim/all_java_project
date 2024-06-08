package Belajar;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        int [] Array = {2,4,6,8,10,12,14,16,18,20};
    
        // Looping Propery Array
        for(int i = 0; i < Array.length; i++){
            System.out.println("Index ke-"+i+" = "+Array[i]);
        }

        // Looping For Each
        for(int angka : Array){
            System.out.println(angka);
        }
        System.out.println(Arrays.toString(Array));

        // System.out.println("\033[H\033[2J");
        // int [] Data = new int[5];
        // System.out.println(Arrays.toString(Data));
        // UbahArray(Data);
        // System.out.println(Arrays.toString(Data));
        
    }
    // static void UbahArray(int [] Data){
    //     for(int i = 0; i < Data.length; i++){
    //         System.out.print("Masukkan Index ke-"+i+" : ");
    //         Data[i] = input.nextInt();            
    //     }
}

     

