package MODUL_1;

public class Tugas_1 {
    public static void main(String[] args) {
        clearScreen();
        System.out.println("Layar konsol berhasil di clear screen");
    }
    
    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.err.println("tidak bisa clear screen");
        }
    }
}
