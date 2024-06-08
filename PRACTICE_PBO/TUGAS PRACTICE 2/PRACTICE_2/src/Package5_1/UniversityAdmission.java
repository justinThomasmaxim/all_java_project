package Package5_1;

import java.util.Scanner;

public class UniversityAdmission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan informasi siswa:");
        System.out.print("Pernah menjadi pembaca pidato perpisahan atau salutatorian di sekolah (ya/tidak): ");
        boolean speechOrSalutatorian = scanner.next().equalsIgnoreCase("ya");

        System.out.print("IPK siswa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Nilai SAT: ");
        int satScore = scanner.nextInt();

        boolean isAdmitted = false;

        if (speechOrSalutatorian || (gpa >= 4.0 && satScore >= 1100) || (gpa >= 3.5 && satScore >= 1300) || (gpa >= 3.0 && satScore >= 1500)) {
            isAdmitted = true;
        }

        if (isAdmitted) {
            System.out.println("Siswa diterima di Universitas Mountville.");
        } else {
            System.out.println("Siswa tidak diterima di Universitas Mountville.");
        }
    }
}
