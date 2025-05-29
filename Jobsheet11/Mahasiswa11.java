package Jobsheet11;

public class Mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa11() {}

    public Mahasiswa11(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }

}
