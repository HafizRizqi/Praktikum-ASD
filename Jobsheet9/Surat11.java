public class Surat11 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat11() {
    }

    public Surat11(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

   public void tampilkanInfo() {
        System.out.println(idSurat + "\t" + namaMahasiswa + "\t" + kelas + "\t" + jenisIzin + "\t" + durasi);
    }
}
