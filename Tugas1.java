import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, jmlTiket = 0, totalTiketTerjual = 0;
        double diskon = 0.0, totalPenjualan = 0.0, totalBayar = 0.0 ;

        int i = 1;
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik '0' untuk selesai): ");
            jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                break;
            }

            if (jmlTiket < 0){
                System.out.print("Jumlah tiket tidak valid, silakan masukkan kembali.");
                continue;
            }

            totalBayar = jmlTiket * hargaTiket;

            if (jmlTiket > 10) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.10; 
            }

            totalBayar -= totalBayar * diskon; // mengurangi total Bayar dengan diskon
            totalPenjualan += totalBayar; // menambahkan ke total penjualan
            totalTiketTerjual += jmlTiket; // menambah ke total tiket yg kejual

            System.out.println("Total harga untuk " + jmlTiket + " tiket: Rp" + totalBayar);
        }

        System.out.println("\n=== Ringkasan Penjualan ===");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan hari ini: Rp " + totalPenjualan);
        sc.close();
    }
}
