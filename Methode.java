package com.tutorial;

class Mahasiwa {
    String nama;
    String Nim;

    // Constructor
    Mahasiwa(String InputNma, String Inputnim) {
        nama = InputNma;
        Nim = Inputnim;
    }

    //Methode tanpa return dan paramete
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Nim : " + this.Nim);
    }

    //    Metohode tanpa return dengan paramete
    void setNama(String name) {
        this.nama = name;
    }

    //        mthode dengan return tanpa parameter
    String getNama() {
        return this.nama;
    }

    String getNim() {
        return this.Nim;
    }

    //   methode dengan parameter dan return
    String SayHallo(String message) {
        return message + " " + this.nama;
    }
}


//    contoh
class Dosen{
    String Kamar;

    Dosen(String Kamar){
        this.Kamar = Kamar;
    }
}

public class Methode {
    public static void main(String[] args) {
        Mahasiwa mahasiwa1 =  new Mahasiwa("Dodol", "123456789");
        System.out.println(mahasiwa1.nama);
//        Methode
        mahasiwa1.show();
        mahasiwa1.setNama("Nando");
        mahasiwa1.show();

        System.out.println(mahasiwa1.getNama());
        System.out.println(mahasiwa1.getNim());

        String data = mahasiwa1.SayHallo("Nama Aku Ialah :");
        System.out.println(data);


        Dosen dosen1 = new Dosen("Ridho");
        System.out.println(dosen1);
    }
}