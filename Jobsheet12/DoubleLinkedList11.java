package Jobsheet12;

public class DoubleLinkedList11 {
    Node11 head;
    Node11 tail;

    public DoubleLinkedList11() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa11 data) {
        Node11 newNode = new Node11(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addLast(Mahasiswa11 data) {
        Node11 newNode = new Node11(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa11 data) {
        Node11 current = head;

        // Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node11 newNode = new Node11(data);

        // Jika Current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            // Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }
    public void print () {
        if (isEmpty()) {
            System.out.println("Warning!. List Kosong");
            return;
        }
        Node11 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada yang dihapus.");
            return;
        }
        if (head == tail) {
            head = tail= null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada yang dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public Node11 search(String nim) {
        Node11 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void addAt(int index, Mahasiswa11 data) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else {
            Node11 newNode = new Node11(data);
            Node11 current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Index melebihi jumlah elemen, menambahkan di akhir.");
                addLast(data);
            } else {
                newNode.next = current.next;
                newNode.prev = current;
                if (current.next != null) {
                    current.next.prev = newNode;
                } else {
                    tail = newNode; 
                }
                current.next = newNode;
            }
        }
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
        System.out.println("List kosong. Tidak ada yang bisa dihapus.");
        return;
    }
        Node11 current = head;

        // Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        // Jika node berikutnya ada, hapus node tersebut
        if (current.next != null) {
            Node11 toRemove = current.next;
            current.next = toRemove.next;
            if (toRemove.next != null) {
                toRemove.next.prev = current;
            } else {
                tail = current; 
            }
            System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus.");
        } else {
            System.out.println("Tidak ada node setelah NIM " + keyNim + ".");
        }
    }

    public void removeAt(int index) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada yang dihapus.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node11 current = head;
            for (int i = 0; i < index && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Index melebihi jumlah elemen, tidak ada yang dihapus.");
                return;
            }
            if (current == tail) {
                removeLast();
            } else {
                current.prev.next = current.next;
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            }
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada yang ditampilkan.");
        } else {
            head.data.tampil();
        }
    }
    public void getLast() {
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada yang ditampilkan.");
        } else {
            tail.data.tampil();
        }
    }
    public int getIndex(String nim) {
        Node11 current = head;
        int index = 0;
        while (current != null) {
            if (current.data.nama.equals(nim)) {
                return index; 
            }
            current = current.next;
            index++;
        }
        return -1; 
    }

    public int getSize() {
        Node11 current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

        

}
