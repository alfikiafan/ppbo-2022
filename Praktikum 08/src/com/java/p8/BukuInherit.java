// Nama : Alfiki Diastama Afan Firdaus
// NIM  : M0521009

package com.java.p8;

public class BukuInherit extends Buku {
    public BukuInherit(String isbn, String judul, String penulis, String penerbit, int tahunTerbit) {
        super(isbn, judul, penulis, penerbit, tahunTerbit);
        super.isbn = isbn;
        super.judul = judul;
        super.penulis = penulis;
        super.penerbit = penerbit;
        super.tahunTerbit = tahunTerbit;
    }
}

/* Adakah error yang ditemui pada BukuInherit yang berkaitan dengan access modifier? Jelaskan penyebab errornya!
 * Jawab:
 * Ada eror yang ditemukan pada baris ke-11 (super.penulis) karena access modifier pada atribut penulis di Buku.java
 * di package com.java.p8 adalah private. Maka, ia hanya dapat diakses dari dalam class Buku tersebut.
 */