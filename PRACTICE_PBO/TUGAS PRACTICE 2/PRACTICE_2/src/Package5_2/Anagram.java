package Package5_2;
import java.util.Arrays;

public class Anagram {
	// Fungsi ini memeriksa apakah dua string adalah anagram.
	static boolean areAnagrams(String kata1,String kata2) {
		String workingCopy1 = removeJunk(kata1);
		String workingCopy2 = removeJunk(kata2);
		
		workingCopy1 = workingCopy1.toLowerCase();
		workingCopy2 = workingCopy2.toLowerCase();
		workingCopy1 = sort(workingCopy1);
		workingCopy2 = sort(workingCopy2);
		 // Memeriksa apakah kedua string yang telah diubah sama.
		return workingCopy1.equals(workingCopy2);
	}
	
	 // Fungsi ini menghapus karakter-karakter yang tidak berupa huruf dari string.
	static String removeJunk(String kata) {
		int i, len = kata.length();
		StringBuilder dest = new StringBuilder(len);
		char c;
		for (i = (len - 1); i >= 0; i--) {
			c = kata.charAt(i);
			if (Character.isLetter(c)) {
				dest.append(c);
			}
		}
		return dest.toString();
	}
	
	// Fungsi ini mengurutkan karakter-karakter dalam string
	static String sort(String kata) {
		char[] charArray = kata.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}
	
	public static void main(String[] args) {
		String kata1 = "parliament";
		String kata2 = "partial men,";
		System.out.println();
		System.out.println("Menguji 2 kata dibawah !");
		System.out.println(" kata 1: " + kata1);
		System.out.println(" kata 2: " + kata2);
		System.out.println();
		if (areAnagrams(kata1, kata2)) {
			System.out.println("2 kata tersebut merupakan anagrams!");
		} else {
			System.out.println("2 kata tersebut Bukan anagrams!");
		}
		System.out.println();
	}
}



