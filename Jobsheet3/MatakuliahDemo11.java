import java.util.Scanner;
public class MatakuliahDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlahMatkul = sc.nextInt();
        sc.nextLine();

        Matakuliah11[] arrayOfMatakuliah = new Matakuliah11[jumlahMatkul];

        for(int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-"+ (i+1));
            arrayOfMatakuliah[i] = new Matakuliah11();
            arrayOfMatakuliah[i].tambahData();

            
            
        }
        for(int i = 0 ; i < 3 ; i++) {
            System.out.println("Data Matakuliah ke-"+ (i+1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
