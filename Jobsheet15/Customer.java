package Jobsheet15;
public class Customer {
    public int id;
    public String nama;

    public Customer() {}

    public Customer(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String toString() {
        return "ID: " + this.id + ", Nama: " + this.nama;
    }
}
