// Nama : Alfiki Diastama Afan Firdaus
// NIM  : M0521009

package com.java.p8a;

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
 * Ada eror pada class Buku karena class Buku berbeda package dengan class ini. Class Buku ada di package com.java.p8
 * dan class ini berada di package com.java.p8a. Compiler tidak bisa mencari lokasi class Buku.
 */