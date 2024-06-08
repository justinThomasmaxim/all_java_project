package Belajar;

import java.io.*;

public class IO_Character_Stream {
    public static void main(String[] args) throws IOException{
        System.out.println("\033[H\033[2J"); 
        FileReader      charfileinput = new FileReader("D:/JAVA/IO Stream/input.txt");        
        FileWriter      charfileoutput = new FileWriter("D:/JAVA/IO Stream/output.txt");
        
        // Membaca File
        int x = charfileinput.read();
        while(x != -1){
            System.out.print((char)x);
            charfileoutput.write(x);
            x = charfileinput.read();
        }

        charfileinput.close();
        charfileoutput.close();
    }
}
