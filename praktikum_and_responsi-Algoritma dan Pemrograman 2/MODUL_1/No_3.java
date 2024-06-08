package MODUL_1;

public class No_3 {
    public static void main(String[] args) {
        clearScreen();  // Clear Screen
        System.out.println("    For Loop ");
        garis();
        for(int i = 1; i <= 15; i++){
            System.out.println("Perulangan Ke-"+i);
        }
        System.out.println("");
        System.out.println("  While Loop");
        garis();
        int j = 1;
        while(j <= 15){
            System.out.println("Perulangan Ke-"+j);
            j++;
        }
        System.out.println("");
        System.out.println("  Do-While Loop");
        garis();
        int n = 1;
        do {
            System.out.println("Perulangan Ke-"+n);
            n++;
        } while (n <=15 );
    }


    static void garis() {
        System.out.println("----------------");
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
