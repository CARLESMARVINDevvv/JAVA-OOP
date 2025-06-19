// // Inheritance (pewarisan) adalah konsep di mana sebuah class anak (subclass) mewarisi properti dan method dari class induk (superclass).

// Dengan inheritance,kita bisa:

// Menghindari penulisan ulang kode

// Membuat hierarki class(umum→khusus)


package com.tutorial;

// Class Induk (Superclass)
class Manusia {
    String nama;

    public void perkenalan() {
        System.out.println("Halo, nama saya " + nama);
    }
}

// Class Anak (Subclass) yang mewarisi dari Manusia
class Mahasssiswa extends Manusia {
    String jurusan;

    public void belajar() {
        System.out.println("Saya belajar di jurusan " + jurusan);
    }
}

// Class utama
public class Inheritance {
    public static void main(String[] args) {
        Mahasssiswa mhs = new Mahasssiswa();
        mhs.nama = "Carles Marvin";
        mhs.jurusan = "Teknik Komputer";

        mhs.perkenalan(); // method dari class induk
        mhs.belajar(); // method dari class anak
    }
}
