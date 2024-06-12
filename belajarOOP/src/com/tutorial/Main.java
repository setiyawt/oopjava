package com.tutorial;

import java.util.jar.Attributes.Name;

class Mahasiswa {
    // Data member
    String Nama;
    String NIM;
    String Jurusan;
    double IPK;
    int Umur;

    // konstruktor dipanggil saat pertama kali objek dibuat
    // Mahasiswa() {
    // System.out.println("Konstruktor Mahasiswa");
    // }

    // konstruktor dengan parameter
    // Mahasiswa(String inputNama, String inputNIM, String inputJurusan, double
    // inputIPK, int inputUmur) {

    // nama = inputNama;
    // NIM = inputNIM;
    // jurusan = inputJurusan;
    // IPK = inputIPK;
    // umur = inputUmur;

    // System.out.println(nama);
    // System.out.println(NIM);
    // System.out.println(jurusan);
    // System.out.println(IPK);
    // System.out.println(umur);
    // }

    Mahasiswa(String Nama, String NIM, String Jurusan, Double IPK, int Umur) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.Jurusan = Jurusan;
        this.IPK = IPK;
        this.Umur = Umur;
    }

    // method tanpa parameter dan return
    void show() {
        System.out.println("Nama: " + this.Nama);
        System.out.println("NIM: " + this.NIM);
        System.out.println("Jurusan: " + this.Jurusan);
        System.out.println("IPK: " + this.IPK);
        System.out.println("Umur: " + this.Umur);
    }

    // method dengan parameter
    void setNama(String Nama) {
        this.Nama = Nama;
    }

    // method dengan return tapi tidak ada parameter
    String getNama() {
        return this.Nama;
    }

    // method dengan return dan parameter
    String sayHi(String Message) {
        return Message + " juga, nama saya adalah " + this.Nama;
    }

}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Rizki", "12345", "Teknik Informatika", 3.75, 20);
        mahasiswa1.show();
        // mahasiswa1.nama = "Rizki";
        // mahasiswa1.NIM = "12345";
        // mahasiswa1.jurusan = "Teknik Informatika";
        // mahasiswa1.IPK = 3.75;
        // mahasiswa1.umur = 20;

        // System.out.println(mahasiswa1.nama);
        // System.out.println(mahasiswa1.NIM);
        // System.out.println(mahasiswa1.jurusan);
        // System.out.println(mahasiswa1.IPK);
        // System.out.println(mahasiswa1.umur);

        // method dgn parameter
        mahasiswa1.setNama("Adit");
        mahasiswa1.show();

        // method dengan return tanpa parameter
        System.out.println(mahasiswa1.getNama());

        // method dengan return dan parameter
        System.out.println(mahasiswa1.sayHi("Halo"));
    }
}

// jika bikin kelas baru lagi misalkan Dosen, maka si Dosen ini ga bisa memakai
// method sayHi (method yang ada di kelas Mahasiswa)
