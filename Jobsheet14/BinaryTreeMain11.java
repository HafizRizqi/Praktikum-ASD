package Jobsheet14;

public class BinaryTreeMain11 {
    public static void main(String[] args) {
        BinaryTree11 bat = new BinaryTree11();

        bat.add(new Mahasiswa11("244160121", "Ali", "A", 3.57));
        bat.add(new Mahasiswa11("244160121", "Badar", "B", 3.85));
        bat.add(new Mahasiswa11("244160185", "Candra", "C", 3.21));
        bat.add(new Mahasiswa11("244160220", "Dewi", "D", 3.54));

        System.out.println("\nDaftar nama mahasiswa(in Order Traversal):");
        bat.traversalInOrder(bat.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bat.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bat.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bat.add(new Mahasiswa11("244160131", "Devi", "A", 3.72));
        bat.add(new Mahasiswa11("244160205", "Ehsan", "D", 3.37));
        bat.add(new Mahasiswa11("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("\nInOrder Traversal:");
        bat.traversalInOrder(bat.root);
        System.out.println("\nPreOrder Traversal:");
        bat.traversalPreOrder(bat.root);
        System.out.println("\nPostOrder Traversal:");
        bat.traversalPostOrder(bat.root);

        System.out.println("\npenghapusan data mahasiswa");
        bat.delete(3.57);
        System.out.println("\nDaftar mahasiswa setelah penghapusan 1 mahasiswa (in Order):");
        bat.traversalInOrder(bat.root);
    }


}
