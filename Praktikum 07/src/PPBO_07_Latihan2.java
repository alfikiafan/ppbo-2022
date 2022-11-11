// Nama : Alfiki Diastama Afan Firdaus
// NIM  : M0521009

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.util.Scanner;

public class PPBO_07_Latihan2 {
    public String ketikTeks() {
        System.out.println("Ketik kalimat yang akan disimpan :");
        Scanner sc = new Scanner(System.in);
        // ambil 1 kalimat, setelah tekan enter teks akan diambil
        String str1 = sc.nextLine();
        sc.close();
        return str1;
    }

    // untuk menyimpan teks yang diketik user ke file
    public void simpanTeks(String teks) {
        // set up file and stream
        // ganti path "/tmp/sample3.data" dengan alamat file di komputer anda
        File outFile = new File("sample4.data");
        try {
            outFile.createNewFile();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        FileOutputStream outFileStream = null;
        try {
            outFileStream = new FileOutputStream(outFile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (outFileStream != null) {
            try {
                DataOutputStream dataOutStream;
                dataOutStream = new DataOutputStream(outFileStream);
                dataOutStream.writeBytes(teks);
                dataOutStream.close();

                System.out.println("file berhasil disimpan");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("file gagal disimpan");
        }
    }

    public static void main(String[] args) {
        PPBO_07_Latihan2 it = new PPBO_07_Latihan2();
        // memanggil method ketikTeks
        String kalimat = it.ketikTeks();
        // memanggil method simpanTeks
        it.simpanTeks(kalimat);
    }
}

/* Jelaskan perbedaan cara kerja dari PrintWriter.write() dan DataOutputStream.writeBytes()!
 * Jawab:
 * - PrintWriter.write() digunakan untuk mencetak string secara langsung ke dalam file yang telah dibuat.
 * - DataOutputStream.writeBytes() digunakan untuk mencetak string di setiap karakter dalam bentuk bytes ke dalam file
 *   yang telah dibuat.
 */