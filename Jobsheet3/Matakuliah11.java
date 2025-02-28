import java.util.Scanner;
public class Matakuliah11 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    public Scanner sc = new Scanner(System.in);

    public Matakuliah11() {

    }

    public Matakuliah11(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData() {
        System.out.print("Kode       : ");
        this.kode = sc.nextLine();
        System.out.print("Nama       : ");
        this.nama = sc.nextLine();
        System.out.print("SKS        : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam : ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("--------------------------------------");
    }
    void cetakInfo(){
        System.out.println("Kode        :"+ kode);
        System.out.println("Nama        :"+ nama);
        System.out.println("SKS         :"+ sks);
        System.out.println("Jumlah Jam  :"+ jumlahJam);
        System.out.println("--------------------------------------");
    }
   
}
