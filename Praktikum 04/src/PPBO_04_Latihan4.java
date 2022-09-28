// Nama : Alfiki Diastama Afan Firdaus
// NIM  : M0521009

import java.util.Scanner;

public class PPBO_04_Latihan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Please input non-integer to trigger exception: ");
                scanner.nextInt();
            }
        } catch (Exception e) {
            int exceptionLineNumber; // simpan angka exception line number di variabel ini
            StackTraceElement[] stackTrace = e.getStackTrace();
            int stackTraceLength = stackTrace.length;
            exceptionLineNumber = stackTrace[stackTraceLength - 1].getLineNumber();
            System.out.println("Whoops! exception occured on line: " + exceptionLineNumber);
        }
        scanner.close();
    }
}

//      Pada latihan ini kalian diminta untuk mencetak exception line number atau baris ke berapa penyebab 
// terjadinya exception. Sebelumnya kalian sudah mengenal method printStackTrace() yang akan mencetak 
// urutan stack exception. Pada baris terakhir stack trace, terdapat informasi letak exception line number 
// yang terjadi pada source code ini. 
// Akses exception line number tersebut dan simpan pada variabel exceptionLineNumber!

// Hint:
// - Selidiki method dan field yang tersedia
// - Proses pencarian dimulai dari mengakses stack trace
// - Trace yang diperlukan berada di paling akhir stack

// Output yang diharapkan:
// Whoops! exception occured on line: 12