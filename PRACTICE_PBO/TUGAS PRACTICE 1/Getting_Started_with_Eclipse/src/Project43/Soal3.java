package Project43;
import java.util.*;

public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Jumlah orang yang mendaftar            : ");
        int jumlahOrang = input.nextInt();

        int kapasitasBus     = 45;
        int jumlahBus        = jumlahOrang / kapasitasBus;
        int jumlahTotalOrang = jumlahOrang % kapasitasBus;

        if (jumlahTotalOrang > 0) {
            System.out.println("Jumlah bus yang diperlukan             : " + (jumlahBus + 1));
            System.out.println("Jumlah total orang yang perlu naik van : " + jumlahTotalOrang);
        } else {
            System.out.println("Jumlah bus yang diperlukan             : " + jumlahBus);
            System.out.println("Tidak ada orang yang perlu naik van.");
        }
        
        System.out.println("\n" + (4%5));
	}

}
