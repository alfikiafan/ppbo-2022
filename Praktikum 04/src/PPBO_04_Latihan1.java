// Nama : Alfiki Diastama Afan Firdaus
// NIM  : M0521009

import java.util.Scanner;

public class PPBO_04_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ketik bilangan pertama: ");
        int bil1 = sc.nextInt();
        System.out.print("Ketik bilangan kedua: ");
        int bil2 = sc.nextInt();
        double hasil = (double) bil1 / (double) bil2;
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        sc.close();
    }
}

/* a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
      - Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
      - Tulis output yang muncul!
      - Jelaskan maksud dari output tersebut! */
/*    JAWAB:
      - Tidak, program menampilkan output kesalahan, lalu keluar.

      - Ketik bilangan pertama: f
        Exception in thread "main" java.util.InputMismatchException
            at java.base/java.util.Scanner.throwFor(Scanner.java:939)
            at java.base/java.util.Scanner.next(Scanner.java:1594)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
            at PPBO_04_Latihan1.main(PPBO_04_Latihan1.java:10)

      - Terjadi input mismatch karena input yang dimasukkan tidak sesuai dengan tipe data yang diinisialisasikan.
*/

/* b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input bilangan kedua. 
      Jelaskan output yang muncul!
      - Tulis output yang muncul!
      - Jelaskan maksud dari output tersebut! */
/*    JAWAB:
      - Ketik bilangan pertama: 5
        Ketik bilangan kedua: 0
        5 / 0 = Infinity

      - Karena tipe data dari variabel "hasil" adalah double, sehingga dimungkinkan pembagian oleh 0. Pembagian 0 pada
        tipe data tersebut akan menghasilkan Infinity. Alasan dasar di balik itu adalah adanya implementasi pada
        algoritma aritmetika floating point yang menentukan nilai khusus seperti "bukan angka" ATAU "tak terhingga"
        untuk "kasus munculnya pembagian dengan nol" sesuai standar IEEE 754. Namun, apabila tipe data merupakan hasil
        merupakan integer, maka akan terjadi error division by zero.
*/