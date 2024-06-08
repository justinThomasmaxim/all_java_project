package Project44;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABC";
        String s2 = new String("DEF");

        String s3 = "AB" + "C";

        // a. Perbandingan antara s1 dan s2 menggunakan compareTo
        int result1 = s1.compareTo(s2);
        System.out.println("a. s1.compareTo(s2) hasilnya: " + result1);

        // b. Perbandingan antara s2 dan s3 menggunakan equals
        boolean result2 = s2.equals(s3);
        System.out.println("b. s2.equals(s3)    hasilnya: " + result2);

        // c. Perbandingan antara s3 dan s1 menggunakan ==
        boolean result3 = s3 == s1;
        System.out.println("c. s3 == s1         hasilnya: " + result3);

        // d. Perbandingan antara s2 dan s3 menggunakan compareTo
        int result4 = s2.compareTo(s3);
        System.out.println("d. s2.compareTo(s3) hasilnya: " + result4);

        // e. Perbandingan antara s3 dan s1 menggunakan equals
        boolean result5 = s3.equals(s1);
        System.out.println("e. s3.equals(s1)    hasilnya: " + result5);

        
        

	}

}
