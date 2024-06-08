package Project42;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1   = new Student();
        student1.fName     = "Lisa";
        student1.lName     = "Palombo";
        student1.stuId     = 123456789;
        student1.stuStatus = "Aktif";

        System.out.println("Nama Siswa   : " + student1.fName + " " + student1.lName);
        System.out.println("ID Siswa     : " + student1.stuId);
        System.out.println("Status Siswa : " + student1.stuStatus);
	}
}
