public class MahasiswaMain11 {
    public static void main(String[] args) {

        Mahasiswa11 mhs1 = new Mahasiswa11();
        mhs1.nama = "Muhammad Ali farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa11 mhs2 = new Mahasiswa11("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa11 mhs3 = new Mahasiswa11("Natsuki Subaru", "2141720154", 3.69,"TI 2B");
        mhs3.ubahKelas("TI 2A");
        mhs3.updateIPK(3.80);
        mhs3.tampilkanInformasi();
    }
}
