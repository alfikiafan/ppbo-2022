// Nama: Alfiki Diastama Afan Firdaus
// NIM : M0521009

public class PPBO_02_Latihan2 {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String[] args) {
        // KURS_DOLLAR = 13500; (eror di baris 9)
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}
/* Apa yang salah dengan source code tersebut?
 * Jawab : Adanya assignment terhadap konstanta KURS_DOLLAR yang telah diinisialisasi sebelumnya.
 * Solusi: Menghapus keyword "final" pada inisialisasi konstanta agar menjadi variabel
 *         atau mennnaktifkan kode assignment konstanta yang sudah diinisialisasi.
 *
 * Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
 * Jawab : Dengan menggunakan static maka method dan variable akan menjadi milik class, bukan menjadi milik
 *         suatu instance. Jika di suatu class terdapat static variable dan static method, maka ketika kita ingin
 *         class lain menggunakannya dapat langsung memanggil variable atau method tersebut dengan format:
 *         NamaClass.namaStaticVariableAtauMethod. Kita tidak perlu lagi membuat suatu objek dari class tersebut.
 */