package Project41;

import java.util.Scanner;

public class GallonToLiterConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah galon: ");
        double gallons = input.nextDouble();
        double liters = gallons * 3.78541;
        System.out.println(gallons + " galon sama dengan " + liters + " liter.");
    }
}


//public class GallonToLiterConverter {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		double gallons = 5.0; // Ganti nilai ini dengan jumlah galon yang ingin Anda konversi
//        double liters = gallons * 3.78541;
//        System.out.println(gallons + " galon sama dengan " + liters + " liter.");
//	}
//
//}