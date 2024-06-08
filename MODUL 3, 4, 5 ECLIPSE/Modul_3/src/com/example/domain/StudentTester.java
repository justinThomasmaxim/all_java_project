package com.example.domain;

class Students {
	private String namaMahasiswa; 
	private String nim; 
	private int angkatan;
	
	public Students() {
		
	}
	
	public Students(String namaMahasiswa, String nim, int angkatan){
		this.namaMahasiswa=namaMahasiswa;
		this.nim=nim;
		this.angkatan=angkatan;
	}
	
	
	public String getName() {
		return namaMahasiswa;
	}
	
	public String getNim() {
		return nim;
	}
	
	public int getAngkatan() {
		return angkatan;
	}
	
	
	public void setStudentName(String namaMahasiswa) {
		this.namaMahasiswa=namaMahasiswa;
	}
	
	public void setNim(String nim) {
		this.nim=nim;
	}
	
	public void setAngkatan(int angkatan) {
		this.angkatan=angkatan;
	}
	
	public String toString(){
		String s1 = "";
		s1 = "\nStudent Name     : " + getName() + 
			 "\nStudent NIM      : " + getNim() + 
			 "\nStudent Angkatan : " + getAngkatan() + "\n\n";
		return s1;
	}
}



public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students("Thomas Zugildo Magnus", "223020503063", 2022);
		System.out.println(s1); 
		Students s2 = new Students(); 
		s2.setStudentName("Thomas");
		s2.setAngkatan(2021); 
		
		
		System.out.println(s2);

	}

}
