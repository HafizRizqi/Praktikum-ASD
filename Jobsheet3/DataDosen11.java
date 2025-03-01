public class DataDosen11 {
    public static void dataSemuaDosen(Dosen11[] arrayOfDosen11) {
        System.out.println("/nDaftar Semua Dosen:");
        for (Dosen11 d : arrayOfDosen11){
           d.cetakInfo();
        }
       
    }
    public static void jumlahDosenPerJenisKelamin(Dosen11[] arrayOfDosen11) {
        int pria = 0, wanita = 0;
        for(Dosen11 d : arrayOfDosen11) {
                if(d.jenisKelamin) {
                    pria++;
                } else {
                    wanita++;
                }
            }
            System.out.println("Jumlah Dosen Pria: " + pria);
            System.out.println("Jumlah Dosen Wanita: " + wanita);
    }
    public static void rerataUsiaDosenPerJenisKelamin(Dosen11[] arrayOfDosen11) {
        int totalUsiaPria = 0, totalUsiaWanita = 0, countPria = 0, countWanita = 0;
        for (Dosen11 d : arrayOfDosen11) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                countPria++;
            } else {
                totalUsiaWanita += d.usia;
                countWanita++;
            }
        }
        System.out.println("Rata-rata usia dosen pria: " + (countPria > 0 ? (totalUsiaPria / countPria) : 0));
        System.out.println("Rata-rata usia dosen wanita: " + (countWanita > 0 ? (totalUsiaWanita / countWanita) : 0));
    }
    public static void infoDosenPalingTua(Dosen11[] arrayOfDosen11) {
        if (arrayOfDosen11.length == 0) return;
        Dosen11 tertua = arrayOfDosen11[0];
        for (Dosen11 d : arrayOfDosen11) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("\nDosen Paling Tua:");
        tertua.cetakInfo();
    }
    public static void infoDosenPalingMuda(Dosen11[] arrayOfDosen11) {
        if (arrayOfDosen11.length == 0) return;
        Dosen11 termuda = arrayOfDosen11[0];
        for (Dosen11 d : arrayOfDosen11) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("\nDosen Paling Muda:");
        termuda.cetakInfo();
    }
    
}
