// Nama : Alfiki Diastama Afan Firdaus
// NIM  : M0521009

import java.util.Scanner;

class PPBO_03_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // tuliskan kodemu di sini
        boolean leap = false;
        System.out.print("LAP YEAR CHECKING PROGRAM\nEnter year: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                leap = year % 400 == 0;
            } else {
                leap = true;
            }
        }
        if (leap) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}

// Buatlah conditional statement untuk melakukan pengecekan terhadap input variabel 'year'
// Cek apakah input merupakan tahun kabisat
// Jika tahun kabisat, berikat output '... is a leap year'
// Jika bukan tahun kabisat, berikan output '... is not a leap year'
// ... di atas maksudnya adalah nilai variabel 'year' yang diinputkan

// Contoh 
// input : 2020
// output : 2020 is a leap year

// Contoh
// input : 2031
// output : 2031 is not a leap year