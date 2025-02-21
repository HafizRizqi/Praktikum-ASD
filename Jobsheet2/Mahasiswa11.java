public class Mahasiswa11 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }
    void updateIPK(double ipkBaru) {
        ipk = ipkBaru;
        if (ipk < 0.0 && ipk > 4.0) {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
 
    String nilaiKinerja() {
       if (ipk >= 3.5 ) {
        return "Kinerja sangat Baik";
       }
       else if (ipk >= 3.0 ) {
        return "Kinerja Baik";
       }
       else if (ipk >= 2.0 ) {
        return "Kinerja cukup";
       }
       else {
        return "Kinerja Kurang";
       }
    }
}