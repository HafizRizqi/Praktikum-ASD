public class DataDosen11 {
 Dosen11[] data11 = new Dosen11[10];
 int idx;

 void tambah(Dosen11 dsn) {
    if (idx < data11.length) {
        data11[idx] = dsn;

        idx++;
    } else {
        System.out.println("Data sudah penuh!");
    }
}

void tampil() {
    for (int i = 0; i < idx; i++) {
        data11[i].tampilInformasi();
    }
}
void SortingASC() {
    for (int i = 0; i < idx - 1; i++) {
        for (int j = 0; j < idx -  1 - i; j++) {
            if (data11[j].usia > data11[j + 1].usia) {

                Dosen11 temp = data11[j];

                data11[j] = data11[j + 1];
                data11[j + 1] = temp;
            }
        }
    }
    System.out.println("Data berhasil diurutkan secara ascending (usia termuda ke tertua).");
}

void SortingDSC() {
    for (int i = 0; i < idx - 1; i++) {
        int idxMax = i;
        for (int j = i + 1; j < idx; j++) {
            if (data11[j].usia > data11[idxMax].usia) {
                idxMax= j;
            }
        }
        Dosen11 temp = data11[i];
        data11[i] = data11[idxMax];
        data11[idxMax] = temp;
    }
    System.out.println("Data berhasil diurutkan secara descending (usia tertua ke termuda).");
}

void insertionSort() { 
    for (int i = 1; i < idx; i++) {
        Dosen11 temp = data11[i];
        int j = i;
        while (j > 0 && data11[j - 1].usia < temp.usia) {
            data11[j] = data11[j - 1];
            j--;
        }
        data11[j] = temp;
    }
    System.out.println("Data berhasil diurutkan menggunakan Insertion Sort (usia tertua ke termuda).");
}

int sequentialSearching(String cari) {
    int count = 0;
    int posisi = -1;
    for (int j = 0; j < idx; j++) {
        if (data11[j].nama.equalsIgnoreCase(cari)) {
            if (count == 0) posisi = j; // simpan posisi pertama ditemukan
            count++;
        }
    }

    if (count > 1) {
        System.out.println(" Peringatan: Ditemukan lebih dari satu dosen dengan nama yang sama!");
    }

    return posisi;
}

int findBinarySearch(int cari, int left, int right) {
    if (right >= left) {
        int mid;
        mid = (left + right) / 2;
        if(cari == data11[mid].usia) {
            return mid;
        } else if (data11[mid].usia > cari) {
            return findBinarySearch(cari, left, mid - 1);
        } else {
            return findBinarySearch(cari, mid + 1, right);
        }
    }
    return -1;
}

int binarySearchDenganPeringatan(int usia) {
    int count = 0;
    int pos = findBinarySearch(usia, 0, idx - 1); // pakai binary search dulu

    if (pos != -1) {
        count = 1;

        // Cek ke kiri
        int left = pos - 1;
        while (left >= 0 && data11[left].usia == usia) {
            count++;
            left--;
        }

        // Cek ke kanan
        int right = pos + 1;
        while (right < idx && data11[right].usia == usia) {
            count++;
            right++;
        }

        if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia yang sama!");
        }
    }

    return pos; // tetap kembalikan posisi awal yang ditemukan
}

void tampilPosisi(String x, int pos) {
    if (pos != -1) {
        System.out.println("Data dosen dengan nama: " + x + " ditemukan pada index ke-" + pos);
    } else {
        System.out.println("Data " + x + " tidak ditemukan");
    }
}
void tampilDataSearch(String x, int pos) {
    if (pos != -1) {
        System.out.println("kode\t: " + data11[pos].kode);
        System.out.println("nama\t: " + data11[pos].nama);
        System.out.println("jenis kelamin\t: " + (data11[pos].jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("usia\t: " + data11[pos].usia);
    } else {
        System.out.println("Data dosen dengan nama " + x + " tidak ditemukan");
    }
}
}
