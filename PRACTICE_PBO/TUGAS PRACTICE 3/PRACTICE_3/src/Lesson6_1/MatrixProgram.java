package Lesson6_1;
import java.util.Scanner; 
public class MatrixProgram { 
	public static void main(String[] args) { 
		int[][] A = new int[2][2]; 
		int[][] B = new int[2][2]; 
		int choice; Scanner reader = new Scanner(System.in); 
		do{ 
			menu(); 
			System.out.print("Pilih menu : ");
			choice = reader.nextInt();
			System.out.println("+=================+");
			switch(choice){ 
			case 1: 
				enterMatrix(A); 
				break; 
			case 2: 
				enterMatrix(B); 
				break; 
			case 3: 
				add(A,B); 
				break; 
			case 4:
				subtract(A,B); 
				break; 
			case 5: 
				multiply(A,B); 
				break; 
			case 6: 
				break; 
			} 
		}while(choice != 6); 
	} 

	public static void menu(){ 
		System.out.println("\n+=================+");
		System.out.println("|      MENU       |");
		System.out.println("+=================+");
		System.out.println("|1. Enter Matrix A|"); 
		System.out.println("|2. Enter Matrix B|"); 
		System.out.println("|3. Display A + B |"); 
		System.out.println("|4. Display A - B |"); 
		System.out.println("|5. Display A * B |"); 
		System.out.println("|6. Exit          |"); 
		System.out.println("+=================+");
	} 
	
	public static void enterMatrix(int[][] a){ 
		Scanner reader = new Scanner(System.in); 
		System.out.print("Masukkan elemen di baris pertama dan kolom pertama : "); 
		a[0][0] = reader.nextInt(); 
		System.out.print("Masukkan elemen pada baris pertama dan kolom kedua : "); 
		a[0][1] = reader.nextInt(); 
		System.out.print("Masukkan elemen di baris kedua dan kolom pertama   : "); 
		a[1][0] = reader.nextInt(); 
		System.out.print("Masukkan elemen di baris kedua dan kolom kedua     : "); 
		a[1][1] = reader.nextInt(); 
	} 
	
	public static void add(int[][] a,int[][] b){ 
		System.out.println("A + B is"); 
		System.out.println((a[0][0]+b[0][0]) + "\t" + (a[0][1]+b[0][1])); 
		System.out.println((a[1][0]+b[1][0]) + "\t" + (a[1][1]+b[1][1])); 
	} 
	
	public static void subtract(int[][] a, int[][] b){ 
		System.out.println("A - B is"); 
		System.out.println((a[0][0]-b[0][0]) + "\t" + (a[0][1]-b[0][1])); 
		System.out.println((a[1][0]-b[1][0]) + "\t" + (a[1][1]-b[1][1])); 
	} 
	
	public static void multiply(int[][] a, int[][] b){ 
		System.out.println("A * B is"); 
		System.out.println((a[0][0]*b[0][0] + a[0][1]*b[1][0]) + "\t" + (a[0][0]*b[0][1] + a[0][1]*b[1][1]));
		System.out.println((a[1][0]*b[0][0] + a[1][1]*b[1][0]) + "\t" + (a[1][0]*b[0][1] + a[1][1]*b[1][1])); 
	} 
} 