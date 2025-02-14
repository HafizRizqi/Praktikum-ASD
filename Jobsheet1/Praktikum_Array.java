import java.util.Scanner;

public class Praktikum_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data mata kuliah dan bobot SKS
        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        int[] sks = {2, 4, 3, 4, 2, 2, 2, 2};
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        double totalNxSks = 0;
        int totalSKS = 0;

        System.out.println("Program Menghitung IP Semester");

        // Input nilai angka dan konversi ke nilai huruf dan bobot
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();

            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }
        }

        // Menampilkan hasil konversi nilai
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("============================================================");
        System.out.printf("%-35s %-12s %-12s %-12s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("============================================================");

        for (int i = 0; i < mataKuliah.length; i++) {
            totalNxSks += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
            System.out.printf("%-35s %-12.2f %-12s %-12.2f%n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("============================================================");
        System.out.printf("IP Semester : %.2f%n", totalNxSks / totalSKS);
        System.out.println("============================================================");

        scanner.close();
    }
}
