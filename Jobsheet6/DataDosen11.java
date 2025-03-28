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
        data11[i].tampil();
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

}
