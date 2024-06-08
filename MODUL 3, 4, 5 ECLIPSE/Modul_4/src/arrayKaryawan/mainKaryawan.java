package arrayKaryawan;

public class mainKaryawan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		dataKaryawan datakar=new dataKaryawan();
		myInput in=new myInput();
		System.out.println("berapa jumlah karyawan : ");
		datakar.setJmlKaryawan(in.bacaInt());
		for (i=0;i<datakar.n;i++){
			System.out.println("karyawan ke- "+(i+1));
			System.out.println("masukan Nama       : ");
			datakar.setNama(i, in.bacaString());
			System.out.println("masukan NIK        : ");
			datakar.setNIK(i,in.bacaInt());
			System.out.println("masukan gaji pokok : ");
			datakar.setGapok(i, in.bacaInt());
		}
		datakar.tampilData();
	}
}
