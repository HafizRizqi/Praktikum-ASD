import java.util.Scanner;

public class Praktikum_Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        double nilaiAkhir;

        System.out.println("Program Menghitung nilai Akhir");
        System.out.println("=========================");
        
        System.out.print("Masukkan nilai Tugas: ");
        nilaiTugas = sc.nextInt();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }
        
        System.out.print("Masukkan nilai Kuis: ");
        nilaiKuis = sc.nextInt();
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }
        
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextInt();
        if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }
        
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextInt();
        if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }
        
        System.out.println("=========================");
        nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai huruf: A");
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 73) {
            System.out.println("Nilai huruf: B+");
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 65) {
            System.out.println("Nilai huruf: B");
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 60) {
            System.out.println("Nilai huruf: C+");
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 50) {
            System.out.println("Nilai huruf: C");
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 39) {
            System.out.println("Nilai huruf: D");
            System.out.println("TIDAK LULUS");
        } else {
            System.out.println("Nilai huruf: E");
            System.out.println("TIDAK LULUS");
        }
    }
}