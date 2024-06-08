package Responsi;
import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tugas1 project1 = new Tugas1();
        // Tugas2 project2 = new Tugas2();
        // Tugas3 project3 = new Tugas3();
        int menu;
        System.out.println("\033[H\033[2J");
        do {
            System.out.println("=====Responsi Alpro II=====");
            System.out.println("=========Main Menu=========");
            System.out.println("1. Program Tugas 1         ");
            System.out.println("2. Program Tugas 2         ");
            System.out.println("3. Program Tugas 3         ");
            System.out.println("4. Exit                    ");
            System.out.println("===========================");
            System.out.print("Pilih : ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    project1.main(args);
                    break;
                // case 2:
                //     project2.main(args);
                //     break;
                // case 3:
                //     project3.main(args);
                //     break;
                case 4:
                    System.out.println("Anda keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih menu yang tersedia");
            }
        } while (menu != 4);
    }
}
