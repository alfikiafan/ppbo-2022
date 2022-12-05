// Nama: Alfiki Diastama Afan Firdaus
// NIM : M0521009

class Car extends Thread{
    String name;
    public Car(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " starts moving");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class PPBO_11_Latihan2 {
    public static void main(String[] args) {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");

        car1.start();
        car2.start();
    }
}

/*
 * Jawablah pertanyaan berikut
 * 1.   Jalankan source code ini sebanyak 10x, hitung berapa kali car1 dan car2 
 *      sampai ke garis finish pertama kali (dilihat dari output terminal)!
 *      Jawab: car1 = 2 kali, car2 = 8 kali
 * 
 *      
 * 2.   Mengapa setiap run, program bisa menghasilkan output yang berbeda padahal kode diimplementasi secara adil (setiap car "bergerak"
 *      selama 3 detik) dan kode tidak ada yg diubah? Jelaskan!
 *      Jawab: Pada dasarnya Thread dijalankan bersamaan, namun sinkronisasi dan komunikasi antar Thread tidak berjalan dengan baik.
 *             Eksekusi thread bergantung kepada Java Virtual Machine dan Sistem Operasi.
 * 
 * 
 * 3.   Anggap source code akan dimodifikasi menjadi:
 *      print "{car} reaches finish line" (pada line 22) hanya dilakukan sekali dan hanya untuk car pertama yang mencapai garis finish 
 *      Tanpa melakukan coding, berikan idemu supaya modifikasi di atas dapat dilakukan! 
 *      Jawab: Bisa dengan menambahkan variabel static sebagai flag/tanda, contohnya private static boolean carWinner = false;
 *             Lalu, ganti nilainya menjadi true apabila ada yang menang.
 *             Kemudian, gunakan percabangan if-else untuk menentukan car dari Thread mana yang keluar terlebih dahulu.
 *
 */