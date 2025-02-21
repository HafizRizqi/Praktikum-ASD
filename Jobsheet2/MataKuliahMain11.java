public class MataKuliahMain11 {
    public static void main(String[] args) {
        MataKuliah11 MK1 = new MataKuliah11();
        MK1.kodeMK = "1234";
        MK1.nama = "Data Struktur";
        MK1.sks = 2;
        MK1.jumlahJam = 4;

        MK1.tampilkanInformasi();
        MK1.ubahSKS(6);
        MK1.tambahJam(8);
        MK1.tampilkanInformasi();

        MataKuliah11 MK2 = new MataKuliah11("9876", "kalkulus", 4, 8);
        MK2.tampilkanInformasi();
        MK2.ubahSKS(3);
        MK2.kurangiJam(2);
        MK2.tampilkanInformasi();
        
    }
}
