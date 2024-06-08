package MODUL_2;

public class MatrixAddition {
    public static void main(String[] args) {
        clearScreen();
        int[] Matrik1 = { 9, 7, 5, 3, 1, 1 };
        int[] Matrik2 = { 1, 3, 5, 7, 9, 0 };

        int[] arrayHasil = tambahArray(Matrik1, Matrik2);
        printArray(arrayHasil);

    }

    static int[] tambahArray(int[] data1, int[] data2) {
        int[] arrayHasil = new int[data1.length];
        for (int i = 0; i < data1.length; i++) {
            arrayHasil[i] = data1[i] + data2[i];
        }
        return arrayHasil;
    }

    static void printArray(int[] dataArray) {
        System.out.print("{");
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i]);
            if (i == 2) {
                System.out.print("}\n{");
            } else if (i == (dataArray.length - 1)){
                System.out.println("}");
            } else {
                System.out.print(", ");
            }
        }
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