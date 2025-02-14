import java.util.Scanner;

public class Hitung_Kubus {
      public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * (sisi * sisi);
    }

    public static int hitungKeliling(int sisi) {
        return 12 * sisi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = scanner.nextInt();
        
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.print("Pilih menu (1-3): ");
        int pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.println("Volume Kubus: " + hitungVolume(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                break;
            case 3:
                System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
        
        scanner.close();
    }
}
