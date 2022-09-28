// Nama : Alfiki Diastama Afan Firdaus
// NIM  : M0521009

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama: ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua: ");
                bil2 = sc.nextInt();
                int hasil = bil1 / bil2;
                // double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            } 
            // Tambahkan catch statement tambahan di sini
            catch (ArithmeticException e) {
                System.out.println("\nPembagian bilangan dengan 0 tidak terdefinisi.\nPembagian akan diulangi.\n");
            }
        }
        sc.close();
    }
}
// Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. Tambahkan catch statement
// Tambahan untuk menangani pembagian dengan 0 pada source code tersebut:
/* Line double hasil = Double.valueOf(bil1) / Double.valueOf(bil2); diganti menjadi
   int hasil = bil1 / bil2;
   Karena pada java, hasil pembagian dengan tipe data double dari operasi pembagian dengan nol didefinisikan sebagai
   Infinity, sehingga tidak akan error, exception tidak akan terjadi, dan tidak ada exception handling.
 */