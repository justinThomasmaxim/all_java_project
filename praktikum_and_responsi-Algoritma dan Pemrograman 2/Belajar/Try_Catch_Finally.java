// package Belajar;

// import java.util.*;

// public class Try_Catch_Finally {
//     static Scanner input = new Scanner(System.in);
//     public static void main(String[] args) {
//         System.out.println("\033[H\033[2J");
//         int [] data = {1,2,3,4};
//         System.out.println(data);

//         System.out.print("Nilai Array ke : ");
//         int index = input.nextInt();
//         try {
//             int a = index;
//             System.out.printf("\nIndex ke-%d, adalah %d\n",a,data[a]);
//         } catch (ArrayIndexOutOfBoundsException e){
//             System.err.println("\n"+"Index "+index+" diluar batas index "+(data.length-1));
//         } catch (InputMismatchException e){
//             System.err.println("\nInput tidak sesuai tipe data");
//         }finally{
//             System.out.println("\nAkhir dari program");
//         }

//         // try {
//             // System.out.print("Nilai Array ke : ");
//             // int index = input.nextInt();
//             // System.out.println(index);
//         // } catch (InputMismatchException e){
//         //     System.out.println(e);  // e = Ngecek nama errornya apa
//         // } finally{
//         //     System.out.println("\nAkhir dari program");
//         // }
//     }

// }
