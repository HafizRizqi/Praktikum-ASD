import java.util.Scanner;

public class Data_Matkul {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline
        
        String[] mataKuliah = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        int[] semester = new int[jumlahMK];
        String[] hariKuliah = new String[jumlahMK];
        
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nama mata kuliah: ");
            mataKuliah[i] = scanner.nextLine();
            System.out.print("Masukkan bobot SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Masukkan semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline
            System.out.print("Masukkan hari kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }
        
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline
            
            switch (pilihan) {
                case 1:
                    tampilkanJadwal(mataKuliah, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hari = scanner.nextLine();
                    tampilkanJadwalBerdasarkanHari(mataKuliah, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem = scanner.nextInt();
                    scanner.nextLine();
                    tampilkanJadwalBerdasarkanSemester(mataKuliah, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String cari = scanner.nextLine();
                    cariMataKuliah(mataKuliah, sks, semester, hariKuliah, cari);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
        
        scanner.close();
    }
    
    public static void tampilkanJadwal(String[] mk, int[] sks, int[] smt, String[] hari) {
        System.out.println("\nJadwal Kuliah:");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-30s %-5s %-10s %-10s%n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-30s %-5d %-10d %-10s%n", mk[i], sks[i], smt[i], hari[i]);
        }
        System.out.println("--------------------------------------------------");
    }
    
    public static void tampilkanJadwalBerdasarkanHari(String[] mk, int[] sks, int[] smt, String[] hari, String targetHari) {
        System.out.println("\nJadwal Kuliah Hari " + targetHari + ":");
        for (int i = 0; i < mk.length; i++) {
            if (hari[i].equalsIgnoreCase(targetHari)) {
                System.out.printf("%-30s %-5d %-10d %-10s%n", mk[i], sks[i], smt[i], hari[i]);
            }
        }
    }
    
    public static void tampilkanJadwalBerdasarkanSemester(String[] mk, int[] sks, int[] smt, String[] hari, int targetSemester) {
        System.out.println("\nJadwal Kuliah Semester " + targetSemester + ":");
        for (int i = 0; i < mk.length; i++) {
            if (smt[i] == targetSemester) {
                System.out.printf("%-30s %-5d %-10d %-10s%n", mk[i], sks[i], smt[i], hari[i]);
            }
        }
    }
    
    public static void cariMataKuliah(String[] mk, int[] sks, int[] smt, String[] hari, String cari) {
        for (int i = 0; i < mk.length; i++) {
            if (mk[i].equalsIgnoreCase(cari)) {
                System.out.println("\nMata Kuliah Ditemukan:");
                System.out.printf("Mata Kuliah: %s\nSKS: %d\nSemester: %d\nHari: %s\n", mk[i], sks[i], smt[i], hari[i]);
                return;
            }
        }
        System.out.println("Mata kuliah tidak ditemukan.");
    }
}
