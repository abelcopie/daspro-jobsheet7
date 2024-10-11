import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi (dalam jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else {
                    // Hitung berdasarkan tarif per jam
                    if (jenis == 1) {
                        total += durasi * 3000; // Tarif mobil
                    } else if (jenis == 2) {
                        total += durasi * 2000; // Tarif motor
                    }
                }
            }
        } while (jenis != 0);

        System.out.println("Transaksi selesai. Total pembayaran: Rp " + total);
        sc.close();
    }     
}