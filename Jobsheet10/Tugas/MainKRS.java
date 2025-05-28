package Tugas;
import java.util.Scanner;
public class MainKRS {
    public static void main(String[] args) {
         PersetujuanKRS antrian = new PersetujuanKRS(10);
        Scanner sc = new Scanner(System.in);

        int pilih;
        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (panggil antrian)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Paling Belakang");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Jumlah Sudah Dilayani");
            System.out.println("8. Jumlah Belum Dilayani");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = (new Mahasiswa(nim, nama, prodi, kelas));
                    antrian.tambahkanAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa proses = antrian.prosesKRS();
                    if ( proses != null) {
                        System.out.println("Dilayani: " + proses);
                    }
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihat2Terdepan();
                    break;
                case 5:
                    antrian.lihatBelakang();
                    break;
                case 6:
                    System.out.println("Jumlah dalam antrian: " + antrian.jumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah sudah dilayani: " + antrian.jumlahSudahDilayani());
                    break;
                case 8:
                    System.out.println("Jumlah belum dilayani: " + antrian.jumlahBelumDilayani()); 
                    break;  
                case 9:
                    antrian.clear();
                    System.out.println("Antrian dikosongkan.");
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }
}
