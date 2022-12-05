// Nama: Alfiki Diastama Afan Firdaus
// NIM : M0521009

class MyThread extends Thread {
    int length;
    String marker;

    public MyThread(int length, String marker){
        this.length = length;
        this.marker = marker;

        var mainThread = Thread.currentThread().getName();
        System.out.println(this.getName() + " is created on " + mainThread);
    }

    @Override
    public void run(){
        int count = 0;
        while(count < length){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            count++;
            var progressString = getProgress(count, marker);
            System.out.println(this.getName() + ": " + progressString);
        }
    }

    private String getProgress(int count, String marker){
        var result = "";
        for(int i=0; i<count; i++){
            result += marker;
        }
        return result;
    }
}

public class PPBO_11_Latihan1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello from thread '" + Thread.currentThread().getName() + "'\n");

        var thread1 = new MyThread(10, "#");
        var thread2 = new MyThread(5, ">");

        thread1.start();

        Thread.sleep(1500);

        thread2.start();
    }
}

/* 
 * Jawablah pertanyaan berikut
 * 1. Jelaskan mengapa program di atas tidak bisa dijalankan (memiliki error/exception)
 *    Jawab : Karena tidak ada IntterruptedException handler pada saat menggunakan fungsi sleep()
 * 
 * 
 * 2. Jelaskan dan terapkan bagaimana cara mengatasinya. Kemudian, kumpulkan program dalam keadaan sudah bisa dijalankan
 *    Jawab : Dengan menerapkan exception menggunakan try dan catch, masalah InterruptedException dapat diatasi. Di dalam
 *            program ditambahkan throw new RuntimeException(e);
 * 
 * 
 * 3. Jelaskan secara singkat algoritma program di atas
 *    Jawab : Program ini membuat 2 thread yang dinamakan Thread-0 dan Thread-1.
 *    Thread-0 mencetak # mulai i=1 sampai i=10 kali, dengan mencetak i kali karakter '#' kemudian newline pada setiap iterasi.
 *    Thread-1 mencetak > mulai i=1 sampai i=5 kali, dengan mencetak i kali karater '>', kemudian newline pada setiap iterasi.
*/