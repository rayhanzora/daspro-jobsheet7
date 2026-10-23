import java.util.Scanner;

public class TiketBioskop29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmltiket, hargaTiket = 50000, totalTiketTerjual = 0;
        double totalPendapatan = 0, diskon = 0;
        do {
            System.out.print("Masukkan jumlah tiket: ");
            jmltiket = sc.nextInt();

            if (jmltiket < 0) {
                System.out.println("Input tidak valid, silahkan input jumlah tiket dengan benar.");
                continue;
            }
            if (jmltiket == 0) {
                break;
            }
            diskon = 0;
            if (jmltiket > 10) {
                diskon = 0.15;
            } else {
                diskon = 0.10;
            }
            double totalHargaSebelumm = jmltiket * hargaTiket;
            double jumlahDiskon = totalHargaSebelumm * diskon;
            double totalHargaBayar = totalHargaSebelumm - jumlahDiskon;

            totalTiketTerjual += jmltiket;
            totalPendapatan += totalHargaBayar;
            System.out.println("Total bayar pelanggan: Rp." + totalHargaBayar );
        } while (jmltiket != 0);
        System.out.println("LAPORAN PENJUALAN HARI INI");
        System.out.println("Total tiket terjual: " + totalTiketTerjual  + " tiket");
        System.out.println("Total pendapatan: Rp." + totalPendapatan);
        sc.close();
    }
}
