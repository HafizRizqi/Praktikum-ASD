package Jobsheet11;

public class SLLAntrianLayanan {
    NodeMahasiswa head;
    NodeMahasiswa tail;

    int size = 0;
    int kapasitas = 10;

    public SLLAntrianLayanan() {
        head = null;
        tail = null;
    }

    public void daftarMahasiswa(Mahasiswa input) {
        if (size < kapasitas) {
            addLast(input);
            System.out.println("Mahasiswa " + input.nama + " telah ditambahkan ke antrian.");
        } else {
            System.out.println("Antrian sudah penuh, tidak dapat menambahkan mahasiswa baru.");
        }
    }



    public boolean isEmpty() {
        return head == null;
    }
    public void isFull() {
        if (size >= kapasitas) {
            System.out.println("Antrian sudah penuh.");
        } else {
            System.out.println("Antrian masih tersedia.");
        }
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

   public void addLast(Mahasiswa input) {
        NodeMahasiswa newNode = new NodeMahasiswa(input, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
         if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
    }
    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            head.data.tampilkanData();
        }
    }
    public void lihatBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Mahasiswa di belakang: ");
            tail.data.tampilkanData();
        }
    }
    public int getJumlahAntrian() {
        return size;
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam antrian:");
        NodeMahasiswa temp = head;
        int index = 1;
        while (temp != null) {
            System.out.print(index + ". ");
            temp.data.tampilkanData();
            temp = temp.next;
            index++;
        }
    }
    
    
}
