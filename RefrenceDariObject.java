package com.tutorial;

class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}

public class RefrenceDariObject {
    public static void main(String[] args) {
        Buku databuku1 = new Buku("Belajar Java", "John Doe");
        databuku1.tampilkanInfo();

        // menampilkan Addres
        String addressBuku1 = Integer.toHexString(System.identityHashCode(databuku1));
        System.out.println(addressBuku1);

        System.out.println();

        // assign object
        Buku buku2 = new Buku(databuku1.judul, databuku1.penulis);
        buku2.tampilkanInfo();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        System.out.println();

        // Karena buku1 dan buku2 addres pada adres dan refresnsi sama kita ubah
        databuku1.judul = "Belajar Java Lanjutan";
        databuku1.tampilkanInfo();
        System.out.println();
        buku2.judul = "Belajar Java Dasar";
        buku2.tampilkanInfo();
        // Menampilkan addres
        System.out.println("Address Buku 1: " + addressBuku1);

        // Memasukan object kedalam methode
        fungsi(buku2);
        buku2.tampilkanInfo();
        databuku1.tampilkanInfo();

    }

    public static void fungsi(Buku dataBuku) {
        String addressdataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println(addressdataBuku);
        dataBuku.penulis = "Charles Dickens";

    }
}
