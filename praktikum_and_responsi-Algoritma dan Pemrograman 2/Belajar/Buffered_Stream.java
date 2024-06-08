// package Belajar;

// import java.io.*;
// import java.util.*;

// public class Buffered_Stream {
//     public static void main(String[] args) throws IOException{
//         System.out.println("\033[H\033[2J");

//         // Membaca file dulu
//         FileReader fileinput = new FileReader("D:/JAVA/IO Stream/input.txt");
//         BufferedReader read = new BufferedReader(fileinput);
      
//         // hasNextLine = ngecek apakah ada lagi sebuah kalimat
//         Scanner x = new Scanner(read);
//         while(x.hasNextLine()){
//             String data = x.nextLine();
//             System.out.println(data);
//         }
//         fileinput.close();
        
//     }
// }
