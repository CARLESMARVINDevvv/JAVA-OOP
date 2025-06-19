package com.tutorial;

class Data {
    public int intPublic;
    private int intPrivate;

    public Data() {
        this.intPublic = 0;
        this.intPrivate = 0;
    }

    // Getter untuk intPrivate
    public int getIntPrivate() {
        return intPrivate;
    }

    // Setter untuk intPrivate
    public void setIntPrivate(int value) {
        this.intPrivate = value;
    }
}

public class Encapsulasi {
    public static void main(String[] args) {
        Data object = new Data();

        // public (read & write langsung)
        object.intPublic = 10;
        System.out.println("Nilai intPublic: " + object.intPublic);

        // private (pakai setter untuk mengubah Nilai , getter untuk membaca)
        object.setIntPrivate(99); // Mengatur nilai
        System.out.println("Nilai intPrivate: " + object.getIntPrivate()); // Membaca nilai
    }
}
