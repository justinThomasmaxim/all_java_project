package MODUL_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FungsiProsedur {
    static ArrayList listBuah = new ArrayList();
    static boolean isRunning = true;
    static Scanner scanner = new Scanner(System.in);

    static void showMenu() throws IOException {
        System.out.println("========= MENU ========");
        System.out.println("[1] Show All Buah");
        System.out.println("[2] Insert Buah");
        System.out.println("[3] Edit Buah");
        System.out.println("[4] Delete Buah");
        System.out.println("[5] Exit");
        System.out.print("PILIH MENU> ");
        int selectedMenu = scanner.nextInt();
        switch (selectedMenu) {
            case 1:
                showAllBuah();
                break;
            case 2:
                insertBuah();
                break;
            case 3:
                editBuah();
                break;
            case 4:
                deleteBuah();
                break;
            case 5:
                System.out.println("Anda keluar dari program");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");
        }
    }

    static void showAllBuah() {
        if (listBuah.isEmpty()) {
            System.out.println("Belum ada data");
        } else {
            // tampilkan semua buah 
            for(int i = 0; i < listBuah.size(); i++){
                System.out.println(String.format("[%d] %s", i, listBuah.get(i)));
            }
        }
    }

    static void insertBuah() throws IOException {
        System.out.print("Nama buah: ");
        String namaBuah = scanner.next();
        // Masukkan atau tambah nama buah 
        listBuah.add(namaBuah);
    }

    static void editBuah() throws IOException {
        showAllBuah();
        System.out.print("Pilih nomer buah: ");
        int indexBuah = scanner.nextInt();
        System.out.print("Nama Baru: ");
        String namaBaru = scanner.next();
        // ubah nama buah 
        listBuah.set(indexBuah, namaBaru);
    }

    static void deleteBuah() throws IOException {
        showAllBuah();
        System.out.print("Pilih nomer buah: ");
        int indexBuah = scanner.nextInt();
        // hapus buah 
        listBuah.remove(indexBuah);
    }

    // Program Utama
    public static void main(String[] args) throws IOException {
        clearScreen();
        do {
            showMenu();
        } while (isRunning);
    }

    static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.err.println("tidak bisa clear screen");
        }
    }
}

// import java.util.ArrayList;

// public class FungsiProsedur {
//     static ArrayList kantongAjaib = new ArrayList();
//     public static void main(String[] args) {
//         // membuat objek array list
//         // Mengisi kantong ajaib dengan 5 benda kantongAjaib.add("Senter Pembesar"); 
//         kantongAjaib.add(532);
//         kantongAjaib.add("tikus"); 
//         kantongAjaib.add(1231234.132);
//         kantongAjaib.add(true);
//         // menghapus tikus dari kantong ajaib 
//         kantongAjaib.remove("tikus");
//         // Menampilkan isi kantong ajaib 
//         System.out.println(kantongAjaib);
//         // menampilkan banyak isi kantong ajaib
//         System.out.println("Kantong ajaib berisi "+ kantongAjaib.size() +" item");
//     }
// }