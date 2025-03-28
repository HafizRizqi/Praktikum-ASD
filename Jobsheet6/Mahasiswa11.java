public class Mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    Double ipk;

    //Kontruksi Default
    Mahasiswa11() {

    }

    //Kontruksi Berparameter
    Mahasiswa11(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
    
}
