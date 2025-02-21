public class DosenMain11 {
    public static void main(String[] args) {
        Dosen11 dsn1 = new Dosen11();
        dsn1.idDosen = "1234";
        dsn1.nama = "Arif Syamsudin";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Chemical Science";
        
        dsn1.tampilInfromasi();
        dsn1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " Tahun");
        dsn1.ubahKeahlian("Kuantum Science"); 
        dsn1.tampilInfromasi();
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " Tahun");

        Dosen11 dsn2 = new Dosen11("5678", "Rizky Rachmat" , true , 2010, "English Speaking British");
        dsn2.tampilInfromasi();
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2025) + " Tahun");
        dsn2.ubahKeahlian("Interklutural bisnis communication");
        dsn2.tampilInfromasi();
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " Tahun");

    }
}