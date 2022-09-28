// Nama: Alfiki Diastama Afan Firdaus
// NIM : M0521009

public class PPBO_02_Latihan3 {
    String nim, nama, alamat;
    char jenisKelamin;

    // Tulis kode kalian di sini
    public PPBO_02_Latihan3(String nim, String nama, char jenisKelamin, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    public static void main(String[] args) {
        PPBO_02_Latihan3 mhs = new PPBO_02_Latihan3("M0501001", "Patrick Star", 'L',
                "Bikini Bottom");

        System.out.println("Data Mahasiswa  :");
        System.out.println("NIM             : " + mhs.nim);
        System.out.println("Nama            : " + mhs.nama);
        System.out.println("Jenis Kelamin   : " + mhs.jenisKelamin);
        System.out.println("Alamat          : " + mhs.alamat);
    }
}
// Buatlah constructor untuk menginisiasi nilai dari variabel
// nim, nama, jenisKelamin, alamat
