// Nama : Alfiki Diastama Afan Firdaus
// NIM  : M0521009

public class PPBO_03_Latihan3 {
    public static void main(String[] args) {
        /* Kode yang belum tepat
         * int arr[] = {5, 1, 4, 2, 3};
         * for (int i = 1; i < 6; i++) {
         *     System.out.println("elemen ke-" + i + " = " + arr[i]);
         * }
         *
         * Perbaikan kode:
         */
        int[] arr = {5, 1, 4, 2, 3};
        for (int i = 0; i < 5; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

// Jawab:
/* Error ArrayIndexOutOfBoundsException menunjukkan bahwa array telah diakses dengan indeks ilegal.
 * indeksnya lebih besar dari ukuran array. Jumlah elemen array hanya 5, sehingga indeks terakhir adalah 4.
 * Pada kondisi int i < 6 yang dituliskan di for loop, ada angka 5 yang memenuhi kondisi, di mana tidak ada
 * elemen array yang berindeks 5.
 *
 * Selain itu, indeks array dimulai dari 1, padahal seharusnya array dimulai dari indeks ke-0. Akibatnya, ada
 * elemen yang terlewat.
 *
 * Warning: format penulisan array tidak menggunakan gaya Java.
 */