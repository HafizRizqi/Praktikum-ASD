package Jobsheet11;
import java.util.Scanner;
public class SLLMain11 {
    public static void main(String[] args) {
        SingleLinkedList11 sll = new SingleLinkedList11();
        Scanner input = new Scanner(System.in);
        System.out.println("=== Data Mahasiswa ===");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); 
        for (int i = 0; i < jumlah; i++) {
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            System.out.print("IPK: ");
            double ipk = input.nextDouble();
            input.nextLine(); 
            Mahasiswa11 mhs = new Mahasiswa11(nim, nama, kelas, ipk);
            sll.addLast(mhs);

        }

        Mahasiswa11 mhs1 = new Mahasiswa11("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa11 mhs2 = new Mahasiswa11("24212201", "Bimon", "2B", 3.8);
        Mahasiswa11 mhs3 = new Mahasiswa11("24212202", "Cintia", "3C", 3.5);
        Mahasiswa11 mhs4 = new Mahasiswa11("24212203", "Dirga", "4D", 3.6);


        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.print();
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
