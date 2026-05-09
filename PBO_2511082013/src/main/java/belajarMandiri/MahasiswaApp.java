package belajarMandiri;

class Mahasiswa {
    String nama;
    String kelas;
    String nim;

    Mahasiswa(String nama, String kelas, String nim) {
        this.nama = nama;
        this.kelas = kelas;
        this.nim = nim;
    }

    void menyapa() {
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama    = " + nama);
        System.out.println("Kelas   = " + kelas);
        System.out.println("NIM     = " + nim);
    }
}

public class MahasiswaApp {
    public static void main(String[] args) {
        String nama = "Muhamad Hafiz";
        String kelas = "1D-TRPL";
        String nim = "2511082013";
        Mahasiswa m1 = new Mahasiswa(nama, kelas, nim);

        m1.menyapa();
    }
}
