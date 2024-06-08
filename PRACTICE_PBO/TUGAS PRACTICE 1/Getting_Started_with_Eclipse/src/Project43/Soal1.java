package Project43;
import java.util.*;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// alas
        System.out.print("Masukkan panjang alas segitiga (cm) : ");
        int b = input.nextInt();

        // tinggi
        System.out.print("Masukkan tinggi segitiga (cm)       : ");
        int h = input.nextInt();

        // Luas 
        double A = 1.0/2 * b * h;

        System.out.println("Luas segitiga adalah                : " + A+" cm^2");
	}

}
