public class Dosen11 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen11(){

    }
    public Dosen11 (String id, String nm, boolean status, int thnBergabung, String bdngKeahlian) {
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = thnBergabung;
        bidangKeahlian = bdngKeahlian;
    }

    void tampilInfromasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Lengkap: " + nama);
        System.out.println("Status Keaktifan: " + statusAktif);
        System.out.println("Kapan tahun Bergabung: " + tahunBergabung);
        System.out.println("Keahliannya: " + bidangKeahlian);
    }
    void setStatusAktif(boolean status) {
        statusAktif = status;
    }
    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg -  tahunBergabung;
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
    }

