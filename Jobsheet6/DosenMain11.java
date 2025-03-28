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
            System.out.println("6. Keluar");
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
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);
        
        sc.close();
    }
    
}
