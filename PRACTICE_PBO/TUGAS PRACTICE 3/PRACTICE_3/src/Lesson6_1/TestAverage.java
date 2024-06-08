package Lesson6_1;
import java.util.Scanner;

public class TestAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		double[] nilai = new double[5]; 
		double total = 0; 
		double avg = 0; 
		for(int i = 0; i < 5; i++){ 
			System.out.println("Masukkan nilai tes:"); 
			nilai[i] = in.nextDouble(); 
			total+=nilai[i]; 
		} 
		avg = total / 5; 
		System.out.println("Rata-rata nilai ujian tersebut adalah: " + avg); 
	}

}