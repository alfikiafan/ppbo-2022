// Nama : Alfiki Diastama Afan Firdaus
// NIM  : M0521009

package com.java.p8;

public class ClassX {
    public static void main(String[] args) {
        // buat objek buku
        Buku buku = new Buku("432A326B4", "Pengenalan Komputasi Cloud", "Eri Suhardi", "Elex Media Komputindo", 2022);

        // tampilkan data buku lewat method printDataBuku
        buku.printDataBuku();

        // akses ke variabel yang ada di objek buku
        System.out.println(buku.isbn);
        System.out.println(buku.judul);
        System.out.println(buku.penulis);
        System.out.println(buku.penerbit);
        System.out.println(buku.tahunTerbit);
    }
}

/* Adakah error yang ditemui pada ClassX yang berkaitan dengan access modifier? Jelaskan penyebab errornya!
 * Jawab:
 * Ada eror pada baris ke-14 (buku.penulis). Eror tersebut terjadi karena access modifier pada atribut penulis di Buku.java
 * di package com.java.p8 adalah private. Maka, ia hanya dapat diakses dari dalam class Buku tersebut. Tidak bisa dari class ini.
 */