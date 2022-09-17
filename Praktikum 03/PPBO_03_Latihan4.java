// Nama : Alfiki Diastama Afan Firdaus
// NIM  : M0521009

public class PPBO_03_Latihan4 {
    public static void main(String[] args) {
        /* Kode awal:
         * int arr[] = {5, 1, 4, 2, 3};
         * for (int i = 1; i < 6; i++) {
         *    System.out.println("elemen ke-" + i + " = " + arr[i]);
         * }
         *
         * Kode baru:
         */
        int[] arr = {5, 1, 4, 2, 3};
        int i = 0;
        do {
            if (arr.length == 0) break; // apabila array tidak berisi, karena do while pasti mengeksekusi minimal 1x.
            System.out.println("elemen ke-" + i + " = " + arr[i]);
            i++;
        } while (i < arr.length);
    }
}

// Melanjutkan source code Latihan3 yang sudah diperbaiki, ubahlah source code dengan 
// mengganti dari perulangan FOR menjadi menggunakan DO ... WHILE