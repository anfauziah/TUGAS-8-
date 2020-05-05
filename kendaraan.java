package no1;

/*
Nama      : Firdayani_13020180089
Kelas     : B2
hari/tgl  : Jumat, 1 Mei 2020
 */
public class kendaraan{
	String mobil;
	String motor;
	void info (String mobil){
		this.mobil=mobil;
	}
	String motor(String mtr){
		this.motor=mtr;
	return mtr;
	}
	
	public static void main(String[] args){
		kendaraan obj = new kendaraan();
		System.out.println("Nama Mobil : "+(obj.mobil="Mini Cooper"));
		System.out.println("Nama Motor : "+(obj.motor="Scoopy"));
	}
}
