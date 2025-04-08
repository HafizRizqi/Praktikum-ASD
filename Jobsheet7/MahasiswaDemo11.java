import java.util.Scanner;
public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi11 list = new MahasiswaBerprestasi11();
        int jmlMhs = 5;
        
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) );
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            System.out.print("IPK: ");
            double ipk = input.nextDouble();
            input.nextLine();
            System.out.println("------------------------------------------"); 

            Mahasiswa11 mhs = new Mahasiswa11(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = input.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
