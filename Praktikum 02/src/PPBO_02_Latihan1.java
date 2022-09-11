// Nama: Alfiki Diastama Afan Firdaus
// NIM : M0521009

import java.text.DecimalFormat;
// Untuk membuat koma di belakang desimal menjadi hanya satu

public class PPBO_02_Latihan1 {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.0;
        float c = 4.3f;

        double ac = (double) a + (double) c;
        double abc = ac + b;

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(1);
        System.out.println(df.format(abc));
    }
}

/*Catatan:
* Saya memilih menggunakan (double) daripada Double.valueOf untuk menghemat ruang dan
* yang lebih disarankan oleh JDK karena alasan performa
*/

// ubah variabel a dan c ke tipe data double
// jumlahkan variabel a, b, dan c
// tampilkan hasil penjumlahan ketiga variabel

/*
 * Output yang diharapkan:
    17.3
 */