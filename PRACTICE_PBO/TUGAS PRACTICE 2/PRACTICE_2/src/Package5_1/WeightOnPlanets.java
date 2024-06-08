package Package5_1;

import java.util.Scanner;

public class WeightOnPlanets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berat badan Anda di Bumi (dalam pound): ");
        double weightOnEarth = scanner.nextDouble();

        System.out.println("\nPilih planet dari menu berikut:");
        System.out.println("1. Mercury");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturn");
        System.out.println("6. Uranus");
        System.out.println("7. Neptune");

        System.out.print("\nMasukkan nomor planet: ");
        int planetChoice = scanner.nextInt();

        double weightOnOtherPlanet = 0;

        switch (planetChoice) {
            case 1:
                weightOnOtherPlanet = weightOnEarth * 0.38;
                System.out.println("Berat badan Anda di Mercury beratnya " + weightOnOtherPlanet + " pound.");
                break;
            case 2:
                weightOnOtherPlanet = weightOnEarth * 0.91;
                System.out.println("Berat badan Anda di Venus beratnya " + weightOnOtherPlanet + " pound.");
                break;
            case 3:
                weightOnOtherPlanet = weightOnEarth * 0.38;
                System.out.println("Berat badan Anda di Mars beratnya " + weightOnOtherPlanet + " pound.");
                break;
            case 4:
                weightOnOtherPlanet = weightOnEarth * 2.36;
                System.out.println("Berat badan Anda di Jupiter beratnya " + weightOnOtherPlanet + " pound.");
                break;
            case 5:
                weightOnOtherPlanet = weightOnEarth * 0.92;
                System.out.println("Berat badan Anda di Saturn beratnya " + weightOnOtherPlanet + " pound.");
                break;
            case 6:
                weightOnOtherPlanet = weightOnEarth * 0.89;
                System.out.println("Berat badan Anda di Uranus beratnya " + weightOnOtherPlanet + " pound.");
                break;
            case 7:
                weightOnOtherPlanet = weightOnEarth * 1.13;
                System.out.println("Berat badan Anda di Neptune beratnya " + weightOnOtherPlanet + " pound.");
                break;
            default:
                System.out.println("Pilihan planet tidak valid.");
        }
    }
}

