public class Praktikum_Fungsi {
    static int[][] stock = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static int[] harga = {75000, 50000, 60000, 10000};

    public static void hitungPendapatan() {
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                totalPendapatan += stock[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan);
        }
    }

    public static void stokCabang4() {
        System.out.println("Stok bunga di RoyalGarden 4:");
        System.out.println("Aglonema: " + stock[3][0]);
        System.out.println("Keladi: " + stock[3][1]);
        System.out.println("Alocasia: " + stock[3][2]);
        System.out.println("Mawar: " + stock[3][3]);
    }

    public static void kurangiStokKarenaMati() {
        int[] bungaMati = {-1, -2, 0, -5};
        for (int i = 0; i < stock[3].length; i++) {
            stock[3][i] += bungaMati[i];
        }
        System.out.println("Stok setelah pengurangan bunga mati di RoyalGarden 4:");
        stokCabang4();
    }

    public static void main(String[] args) {
        hitungPendapatan();
        System.out.println();
        stokCabang4();
        System.out.println();
        kurangiStokKarenaMati();
    }
}
