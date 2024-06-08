package Package5_2;
import java.util.Scanner;

public class SecretMessageDecoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secretMessage = "";

        System.out.println("Masukkan 10 nomor, satu per satu:");

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            char decodedChar = decodeNumber(number);
            if (decodedChar == '\0') {
                System.out.println("Nomor tidak valid, masukkan nomor baru.");
                i--; // Ulangi iterasi
            } else {
                secretMessage += decodedChar;
            }
        }

        System.out.println("Pesan terjemahan: " + secretMessage);
    }

    static char decodeNumber(int number) {
        switch (number) {
            case 1:
                return 'D';
            case 2:
                return 'W';
            case 3:
                return 'E';
            case 4:
                return 'L';
            case 5:
                return 'H';
            case 6:
                return 'O';
            case 7:
                return 'R';
            default:
                return '\0'; // Nomor tidak valid
        }
    }
}

