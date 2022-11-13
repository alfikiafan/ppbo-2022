// Nama : Alfiki Diastama Afan Firdaus
// NIM  : M0521009

package com.java.p8a;

import com.java.p8.Buku;

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
 * Ada beberapa eror yang ditemukan, di antaranya:
 * 1. Error pada super.isbn karena access modifiernya bersifat default sementara class Buku berada di package yang lain (com.java.p8).
 *    Access modifier default tidak mengizinkan pengaksesan di luar package.
 * 2. Error pada super.penulis karena access modifiernya bersifat private sementara class Buku berada di package dan class yang berbeda.
 *    Access modifier private tidak mengizinkan pengaksesan di luar kelas, apalagi packagenya berbeda.
 * 3. Error pada super.tahunTerbit karena access modifiernya bersifat default sementara class Buku berada di package yang lain (com.java.p8).
 */