package com.tutorial;


// Class tanpa constructor
class Polos {
    String dataString;
    int dataInteger;
}

// Class dengan constructor
class Siswa {
    String nama;
    String jurusan;
    String nim;

    // Constructor(di panggil saat object pertama kali dibuat)
    // Siswa() {
    //     System.out.println("ini adalah constructor");
    // }

    // Constructor dengan parameter
    Siswa(String inputNama, String inputJurusan, String inputNim) {
        nama = inputNama;
        jurusan = inputJurusan;
        nim = inputNim;

        System.out.println(nama);
        System.out.println(jurusan);
        System.out.println(nim);
        System.out.println();
    }
}

public class Constructor {
    public static void main(String[] args) {

        Siswa siswa1 = new Siswa("Ucup", "Sipil", "12345678");
        Siswa siswa2 = new Siswa("Otong", "Rekayasa Perangkat Lunak", "12345679");
        // System.out.println(siswa1.nama);
        // System.out.println(siswa2.nama);


        // Polos objectPolos = new Polos();
        // objectPolos.dataString = "Polos";
        // objectPolos.dataInteger = 10;
        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);
    }
    
}
