package Jobsheet12;
import java.util.Scanner;
public class DLLMain {
    
    public static void main(String[] args) {
        DoubleLinkedList11 list = new DoubleLinkedList11();
        Scanner scan = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di Awal");
            System.out.println("2. Tambah di Akhir");
            System.out.println("3.  Hapus di Awal");
            System.out.println("4. Hapus di Akhir");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Sisipkan Setelah NIM Tertentu");
            System.out.println("7. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0.Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine(); 

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa11 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa11 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> {
                    System.out.println("Data berhasil di hapus. Data yang dihapus adalah:" + list.head.data.nama);
                    list.removeFirst();
                }
                case 4 -> {
                    System.out.println("Data berhasil di hapus. Data yang dihapus adalah:" + list.tail.data.nama);
                    list.removeLast();
                }
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM setelah yang ingin disisipkan: ");
                    String keyNim = scan.nextLine();
                    Mahasiswa11 mhs = inputMahasiswa(scan);
                    list.insertAfter(keyNim, mhs);
                }
                case 7 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node11 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data Mahasiswa Ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
        scan.close();

    }

    static Mahasiswa11 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine();  // Consume newline
        return new Mahasiswa11(nim, nama, kelas, ipk);
    }

}
