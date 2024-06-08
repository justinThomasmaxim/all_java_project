package Belajar;

import java.io.*;
public class IO_Byte_Stream {
    public static void main(String[] args) throws Exception{
        System.out.println("\033[H\033[2J");
        FileInputStream fileinput = null;
        FileOutputStream fileoutput = null;
        // Membuka File
        fileinput = new FileInputStream("D:/JAVA/IO Stream/input.txt");
        
        // Membaca File
        int a = fileinput.read();
        while(a != -1){
            System.out.print((char)a);
            a = fileinput.read();
        }
        // Menutup File
        fileinput.close();

        // Pembukaan File
        try {
            // Membuka File
            fileinput = new FileInputStream("D:/JAVA/IO Stream/input2.txt");
            fileoutput = new FileOutputStream("D:/JAVA/IO Stream/output2.txt");
            
            // Membaca File
            int x = fileinput.read();
            // Menulis File
            while(x != -1){
                fileoutput.write(x);
                x = fileinput.read();
            }
        } finally {
            if (fileinput != null){
                fileinput.close();
            }else if (fileoutput != null){
                fileoutput.close();
            }
        }
    }        
}
            
        
        
