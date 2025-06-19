package com.tutorial;

// Polimorfisme artinya satu nama method bisa punya banyak bentuk/perilaku.

// Terdapat dua jenis utama:

// Method Overriding(dari pewarisan)

// Method Overloading(di class yang sama)



// ini contoh Method Overriding (dari pewarisan)


// Superclass
class Hewan {
    void suara() {
        System.out.println("Hewan bersuara");
    }
}

// Subclass
class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong");
    }
}

// Main class
public class POLYMORPHISM {
    public static void main(String[] args) {
        Hewan h1 = new Hewan();
        h1.suara(); // Output: Hewan bersuara

        Hewan h2 = new Kucing(); // polimorfisme terjadi di sini
        h2.suara(); // Output: Meong (method overriding dari Kucing)
    }
}
