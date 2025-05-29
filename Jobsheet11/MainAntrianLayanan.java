package Jobsheet11;
import java.util.Scanner;
public class MainAntrianLayanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLLAntrianLayanan antrian = new SLLAntrianLayanan();
        int pilihan;
        
        do {
            System.out.println("Menu Antrian Layanan:");
            System.out.println("1. daftar Mahasiswa");
            System.out.println("2. Kosongkan Antrian");
            System.out.println("3. Memanggil Antrian");
            System.out.println("4. Lihat Antrian Terdepan");
            System.out.println("5. Lihat Antrian Akhir");
            System.out.println("6. Jumlah Mahasiswa masih dalam antrian");
            System.out.println("7. Lihat Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = input.next();
                    System.out.print("Masukkan Nama: ");
                    String nama = input.next();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = input.next();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = input.next();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.daftarMahasiswa(mhs);
                    break;
                case 2:
                    antrian.clear();
                    System.out.println("Antrian telah dikosongkan.");
                    break;
                case 3:
                    antrian.removeFirst();
                    System.out.println("Antrian terdepan telah dipanggil.");
                    break;
                case 4:
                    antrian.lihatTerdepan();
                    break;
                case 5:
                    antrian.lihatBelakang();
                    break;
                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Daftar Antrian:");
                    antrian.tampilkanSemua();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
