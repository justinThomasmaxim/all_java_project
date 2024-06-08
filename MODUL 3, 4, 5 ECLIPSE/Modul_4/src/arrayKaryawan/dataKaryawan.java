package arrayKaryawan;

public class dataKaryawan {
	private int[] nik=new int[100];
	private String[] nama=new String[100];
	private int[] gapok=new int[100];
	public int n;
	public void setNIK(int i,int x){
		this.nik[i]= x;
	}
	public void setNama(int i,String x){
		this.nama[i]=x;
	}
	public void setGapok(int i,int x){
		this.gapok[i]=x;
	}
	public float rerataGapok(int i,int x){
		int sum=0;
		for(i=0;i<this.n;i++){
		sum +=this.gapok[i];
		}
		return sum/this.n;
	}
	public void setJmlKaryawan(int x){
		this.n=x;
	}
	public void tampilData(){
		int i;
		System.out.println("=======================================================");
		System.out.println("NIK\t\t\tNAMA\t\t\tGAJI");
		System.out.println("=======================================================");
		for(i=0;i<this.n;i++){
			System.out.println(String.format("%-5s %-35s Rp%10d", 
			nik[i],nama[i],gapok[i]));
		}
		System.out.println("=======================================================");
		System.out.println("rata=rata gaji pokok dari "+this.n+"karyawan adalah Rp"+this.rerataGapok(i, i));
	}
}