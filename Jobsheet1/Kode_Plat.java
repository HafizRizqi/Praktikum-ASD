import java.util.Scanner;

public class Kode_Plat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array kode plat satu dimensi
        char[] kodePlat = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        // Array kota dua dimensi
        char[][] namaKota = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };
        
        System.out.print("Masukkan kode plat kendaraan: ");
        char kode = scanner.next().charAt(0);
        String kota = "Kode plat tidak ditemukan";
        
        for (int i = 0; i < kodePlat.length; i++) {
            if (kodePlat[i] == kode) {
                kota = new String(namaKota[i]);
                break;
            }
        }
        
        System.out.println("Kota: " + kota);
        scanner.close();
    }
}
