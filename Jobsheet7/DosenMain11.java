import java.util.Scanner;
public class DosenMain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen11 dsn = new DataDosen11();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("5. Sorting DSC (Insertion Sort)");
            System.out.println("6. Sequential Search dengan Nama Dosen");
            System.out.println("7. Binary Search dengan Usia Dosen (ASC)");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan jenis kelamin (true untuk laki-laki, false untuk perempuan): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Masukkan usia: ");
                    int usia = sc.nextInt();
                    dsn.tambah(new Dosen11(kode, nama, jk, usia));
                    break;
                case 2:
                    dsn.tampil();
                    break;
                case 3:
                    dsn.SortingASC();
                    dsn.tampil();
                    break;
                case 4:
                    dsn.SortingDSC();
                    dsn.tampil();
                    break;
                case 5:
                    dsn.insertionSort();
                    dsn.tampil();
                    break;
                case 6:
                System.out.print("Masukkan nama dosen yang dicari: ");
                String cari = sc.nextLine();
                int pos = dsn.sequentialSearching(cari);
                dsn.tampilPosisi(cari, pos);
                dsn.tampilDataSearch(cari, pos);
                    break;
                    case 7:
                    dsn.SortingASC(); // wajib urut ASC sebelum binary search
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    int posUsia = dsn.binarySearchDenganPeringatan(cariUsia);
                    if (posUsia != -1) {
                        System.out.println("Data dosen dengan usia " + cariUsia + " ditemukan pada indeks ke-" + posUsia);
                        dsn.tampilDataSearch(dsn.data11[posUsia].nama, posUsia);
                    } else {
                        System.out.println("Data dosen dengan usia " + cariUsia + " tidak ditemukan.");
                    }
                    break;
                
                case 8:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 8);
        
        sc.close();
    }
    
}
