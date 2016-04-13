class Parkir {
	String noKendaraan;
	int jamMasuk;
	int jamKeluar;
	
	int hitungLamaParkir(){
		int lamaParkir = 0;
		lamaParkir = jamKeluar - jamMasuk;
		return lamaParkir;
	}
	
	void hitungTarifParkir(){
		int tarifParkir = 0;
		int tarifParkir1 = 0;
		if(hitungLamaParkir()<=2){
			tarifParkir = 5000;
		}
		else if(hitungLamaParkir()>2){
			tarifParkir1 = (hitungLamaParkir()-2)*4000;
			tarifParkir = tarifParkir1+5000;
		}
		System.out.println("Tarif Parkir = "+tarifParkir+" Rupiah");
	}
	
	void tampilData(){
		System.out.println("No. Kendaraan = "+noKendaraan);
		System.out.println("Jam Masuk = "+jamMasuk);
		System.out.println("Jam Keluar = "+jamKeluar);
		System.out.println("Lama Parkir = "+hitungLamaParkir()+" Jam");
	}
	
	public static void main(String[] args){
		Parkir p1 = new Parkir();
		p1.noKendaraan = "N 3606 XM";
		p1.jamMasuk = 1;
		p1.jamKeluar = 6;
		p1.tampilData();
		p1.hitungTarifParkir();
	}
}