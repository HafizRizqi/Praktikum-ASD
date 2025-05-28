package Tugas;

public class PersetujuanKRS {

      Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahDilayani = 0;

    public PersetujuanKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahkanAntrian(Mahasiswa mhs) {
          if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

    int totalDilayani = 0;
    public Mahasiswa prosesKRS() {
         System.out.println("Memproses 2 mahasiswa sekaligus:");

    for (int i = 0; i < 2; i++) {
        if (totalDilayani >= 30) {
            System.out.println("DPA sudah menangani maksimal 30 mahasiswa. Proses dihentikan.");
            break;
        }

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            break;
        }

          Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        System.out.println("Mahasiswa diproses: " + mhs.nama);
        sudahDilayani++;
        totalDilayani++;
    }
    return null;

}

    public void clear() {
        front = rear = -1;
        size = 0;
    }

  public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.print("Antrian kosong");
            return;
        } 
        System.out.println("Daftar Mahasiswa dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatDepan() {
       if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void lihatBelakang() {
         if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Antrian paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
             data[rear].tampilkanData();
        }
    }

    public void lihat2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("2 Terdepan:");
        for (int i = 0; i < 2 && i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int jumlahAntrian() {
       return size;
    }

    public int jumlahSudahDilayani() {
        return sudahDilayani;
    }

    public int jumlahBelumDilayani() {
        return size;
    }

}
