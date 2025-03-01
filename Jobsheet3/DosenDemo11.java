import java.util.Scanner;
public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen11[] arrayOfDosen11 = new Dosen11[3];
        String kode;
        String nama;
        Boolean jenisKelamin;
        int usia;

        for(int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode          :");
            kode = sc.nextLine();
            System.out.print("Nama          :");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true = Pria / false = Wanita) :");
            jenisKelamin = sc.nextBoolean();
            System.out.print("Usia          :");
            usia = sc.nextInt();
            sc.nextLine();
            System.out.println("--------------------------------------");

            arrayOfDosen11[i] = new Dosen11(kode, nama, jenisKelamin, usia);

        }
        for (Dosen11 d : arrayOfDosen11){
           d.cetakInfo();
        }
        DataDosen11.dataSemuaDosen(arrayOfDosen11);
        DataDosen11.jumlahDosenPerJenisKelamin(arrayOfDosen11);
        DataDosen11.rerataUsiaDosenPerJenisKelamin(arrayOfDosen11);
        DataDosen11.infoDosenPalingTua(arrayOfDosen11);
        DataDosen11.infoDosenPalingMuda(arrayOfDosen11);
    }  
    
}
