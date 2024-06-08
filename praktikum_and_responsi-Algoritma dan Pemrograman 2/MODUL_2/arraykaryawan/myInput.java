package arraykaryawan;
import java.io.*;
public class myInput {
    public String bacaString() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in), 1);
        String string = "";
        try {
            string = bfr.readLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return string;
    }
    public int bacaInt() {
        return Integer.parseInt(bacaString());
    }
    public static class dataKaryawan {
        private String[] nik = new String[100];
        private String[] nama = new String[100];
        private int[] gapok = new int[100];
        public int n;
        public void setNIK(int i, String x) {
            this.nik[i] = x;
        }
        public void setNama(int i, String x) {
            this.nama[i] = x;
        }

        public void setGapok(int i, int x) {
            this.gapok[i] = x;
        }
        // Parameter pada procedure rerataGapok dihapus
        // karena pada program utama tidak menerima parameter
        public float rerataGapok() {
            int sum = 0, i;
            for (i = 0; i < this.n; i++) {
                sum += this.gapok[i];
            }
            return sum / this.n;  
        }
        public void setJmlKaryawan(int x) {
            this.n = x;
        }
        public void tampilData() {
            int i;
            System.out.println("====================================");
            System.out.println("NIK\tNAMA\tGAJI                     ");
            System.out.println("====================================");
            for (i = 0; i < this.n; i++) {
                System.out.println(String.format("%-5s\t%-35s Rp %10d", nik[i], nama[i], gapok[i]));
            }
            System.out.println("===================================");
            System.out.println("Rata-rata gaji pokok dari " + this.n + " karyawan adalah Rp " + this.rerataGapok());
        }
    }
    public static void main(String[] args) {
        int i;
        dataKaryawan dataKar = new dataKaryawan();
        
        myInput input1 = new myInput();   // membuat sebuah object baru maka ditambahkan keyword new
        System.out.print("Berapa jumlah karyawan : ");
        dataKar.setJmlKaryawan(input1.bacaInt());
        for (i = 0; i < dataKar.n; i++) {
            System.out.println("Karyawan ke-" + (i + 1));
            System.out.print("Masukan NIK        : ");
            dataKar.setNIK(i, input1.bacaString());
            System.out.print("Masukan Nama       : ");
            dataKar.setNama(i, input1.bacaString());  // di tambah object input1
            System.out.print("Masukan Gaji Pokok : ");
            dataKar.setGapok(i, input1.bacaInt());
        }
        dataKar.tampilData();
    }
}
// import java.io.*;

// public class myInput {
//     public String bacaString(){
//         BufferedReader bfr = new BufferedReader (new InputStreamReader (System.in));
//         String string = " "; 
//         try{
//             string = bfr.readLine();
//         } catch (IOException ex){
//             System.out.println(ex);
//         }
//         return string;
//         }

//         public int bacaInt() {
//             return Integer.parseInt(bacaString());
//         }
// }
// public class dataKaryawan {
//     private String nik = new String[100]; 
//     private String nama = new String[100]; 
//     private int gapok = new int[100]; 
//     public int n;

//     public static void main(String[] args) {
//         int i;
//         dataKaryawan dataKar = new dataKaryawan();
//         myInput input1 = myInput();
//         System.out.println("Berapa jumlah karyawan: ");
//         dataKar.setJmlKaryawan(input1.bacaInt());
//         for (i = 0; i < dataKar.n; i++) {
//             System.out.println("Karyawan ke- " + (i + 1));
//             System.out.println("Masukan NIK : ");
//             dataKar.setNIK(i, input1.bacaString());
//             System.out.println("Masukan Nama : ");
//             dataKar.setNama(i, input1.bacaInt());
//             System.out.println("Masukan Gaji Pokok : ");
//             dataKar.setGapok(i, input1.bacaInt());
//         }
//         dataKaryawan.tampilData();
//     }

//     public void setNIK (int i, String x){
//         this.nik = x;
//     }
//     public void setNama (int i, String x){
//         this.nama = x;
//     }
//     public void setGapok (int i, int x){
//         this.gapok = x;
//     }
//     public float rerataGapok (int i, int x){
//         int sum = 0;
//         for (i=0; i<this.n; i++){
//             sum += this.gapok[i];
//         }
//         return sum/this.n;
//     }
//     public void setJmlKaryawan(int x){
//         this.n = x;
//     }
//     public void tampilData(){
//         int i;
//         System.out.println ("====================================");
//         System.out.println ("           NIK NAMA GAJI"            );
//         System.out.println ("====================================");
//         for (i=0; i<this.n; i++){
//             System.out.println (String.format("%-5s %-35s Rp %10d", nik[i], nama[i], gapok[i]));
//         }
//         System.out.println("===================================");
//         System.out.println("Rata-rata gaji pokok dari "+this.n+"karyawan adalah Rp " + this.rerataGapok());
//     }
// }

