// Nama : Alfiki Diastama Afan Firdaus
// NIM  : M0521009

import java.text.DecimalFormat;
import java.util.Scanner;

public class PPBO_03_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total pembelian: ");

        // tambahkan code untuk menyimpan nominal total pembelian
        double total_purchases, discount;
        int price_after_discount;
        total_purchases = sc.nextInt();

        // tambahkan code untuk mengimplementasikan ketentuan discount yang ditetapkan
        if (total_purchases < 50000) {
            discount = 0;
        } else if (total_purchases <= 75000) {
            discount = 0.05;
        } else if (total_purchases <= 125000) {
            discount = 0.15;
        } else {
            discount = 0.20;
        }
        price_after_discount = (int) Math.ceil((1 - discount) * total_purchases);
        //price_after_discount = total_purchases * (1f - discount);

        // tambahkan code untuk menampilkan nominal yang harus dibayar
        // sesuai dengan ketentuan discount yang diberikan
        if (discount != 0) {
            DecimalFormat df = new DecimalFormat("#%");
            System.out.println(
                    "Anda mendapatkan diskon sebesar " + (df.format(discount) + "\n" +
                            "Total harga setelah diskon: " + price_after_discount + "\n"
            ));
        } else {
            System.out.println(
                    "Mohon maaf, Anda belum memenuhi persyaratan diskon" +
                            "karena pembelian di bawah Rp50.000."
            );
        }
        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan discount kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000