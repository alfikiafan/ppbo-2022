// Nama : Alfiki Diastama Afan Firdaus
// NIM  : M0521009

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PPBO_06_Latihan2 {
    public static void main(String[] args) {
        // pembuatan ArrayList mahasiswa
        ArrayList<Mahasiswa> mahasiswaArr = new ArrayList<>();
        mahasiswaArr.add(new Mahasiswa("ABDI SANTYATMOKO", "M0521001", 2021));
        mahasiswaArr.add(new Mahasiswa("ADELINE FELLITA MARWA", "M0521002", 2021));
        mahasiswaArr.add(new Mahasiswa("ADI PRASETYA", "M0521003", 2021));
        mahasiswaArr.add(new Mahasiswa("ADITIA PRASETYA NUGRAHA", "M0521004", 2021));
        mahasiswaArr.add(new Mahasiswa("ADITYA TEGAR KARUNIA PUTRA TARRA'", "M0521005", 2021));

        // Tulis kode kalian di sini
        HashMap<String, Mahasiswa> mahasiswaHashMap = new HashMap<>();

        mahasiswaHashMap.put("M0521001", mahasiswaArr.get(0));
        mahasiswaHashMap.put("M0521002", mahasiswaArr.get(1));
        mahasiswaHashMap.put("M0521003", mahasiswaArr.get(2));
        mahasiswaHashMap.put("M0521004", mahasiswaArr.get(3));
        mahasiswaHashMap.put("M0521005", mahasiswaArr.get(4));

        for(Map.Entry<String, Mahasiswa> item: mahasiswaHashMap.entrySet()){
            System.out.println("Key: " + item.getKey() + " => " + "Data mahasiswa: "
                    + item.getValue().nama + ", " + item.getValue().NIM + ", " + item.getValue().angkatan);
        }
    }
}

class Mahasiswa {
    public String nama;
    public String NIM;
    public int angkatan;

    Mahasiswa(String nama, String NIM, int angkatan){
        this.nama = nama;
        this.NIM = NIM;
        this.angkatan = angkatan;
    }
}
// Buatlah HashMap dari data mahasiswaArr dengan NIM sebagai key
// Lalu, print setiap pair pada HashMap tersebut dengan format
// "key: {key} => data mahasiswa: {nama}, {nim}, {angkatan}"

// Hint:    
// cara men-traverse HashMap dapat menggunakan metode entry set seperti
// pada sourcecode HashMapDemo, atau kalian dapat menggunakan metode lainnya         

// Output yang diharapkan:
// key: M0521005 => data mahasiswa: ADITYA TEGAR KARUNIA PUTRA TARRA', M0521005, 2021
// key: M0521003 => data mahasiswa: ADI PRASETYA, M0521003, 2021
// key: M0521004 => data mahasiswa: ADITIA PRASETYA NUGRAHA, M0521004, 2021
// key: M0521001 => data mahasiswa: ABDI SANTYATMOKO, M0521001, 2021       
// key: M0521002 => data mahasiswa: ADELINE FELLITA MARWA, M0521002, 2021