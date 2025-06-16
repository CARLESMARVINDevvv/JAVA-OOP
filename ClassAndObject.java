package com.tutorial;

// membuat class sebagai template
class Mahasiswa {
    String nama;
    int umur;
    String nim;
    String jurusan;
}

public class ClassAndObject {
    public static void main(String[] args) {

        // membuat instansiasi /object
        Mahasiswa mahasiswa1 = new Mahasiswa();

        mahasiswa1.nama = "budi";
        mahasiswa1.umur = 20;
        mahasiswa1.nim = "123456789";
        mahasiswa1.jurusan = "Teknik Informatika";

        System.out.println("Nama: " + mahasiswa1.nama);
        System.out.println("Umur: " + mahasiswa1.umur);
        System.out.println("NIM: " + mahasiswa1.nim);
        System.out.println("Jurusan: " + mahasiswa1.jurusan);
        System.out.println();
        
        Mahasiswa mahasiswa2 = new Mahasiswa();

        mahasiswa2.nama = "Regar";
        mahasiswa2.umur = 22;
        mahasiswa2.nim = "123456789";
        mahasiswa2.jurusan = "Ilmu Komputer";

        System.out.println("Nama: " + mahasiswa2.nama);
        System.out.println("Umur: " + mahasiswa2.umur);
        System.out.println("NIM: " + mahasiswa2.nim);
        System.out.println("Jurusan: " + mahasiswa2.jurusan);

        // atau bisa juga cara ini
        // System.out.println( "Nama:" + mahasiswa1.nama + " , " + "Nim:" + mahasiswa1.nim + ", " + "Umur:" + mahasiswa1.umur + " , "  + "Jurusan:" + mahasiswa1.jurusan);
    }
}