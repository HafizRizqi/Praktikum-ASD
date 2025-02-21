public class MataKuliah11 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah11() {
        
    }

    public MataKuliah11(String kdMK, String nm, int sks, int jmlhJam){
        kodeMK = kdMK;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlhJam;
    }
    void tampilkanInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MataKuliah: " + nama );
        System.out.println("SKS: " + sks);
        System.out.println("total jam pertemuan per minggu: " + jumlahJam);
        
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }
    void tambahJam (int jam) {
        jumlahJam = jumlahJam + jam;
    }
    void kurangiJam (int jam) {
        if (jumlahJam < jam ) {
            System.out.println("Pengurangan tidak dapat di lakukan. ");

        }
        else {
            jumlahJam = jumlahJam - jam;
        }
    }

}
