public class Mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa11() {
        
    }

    Mahasiswa11(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}