//Method dengan nama sama, tapi parameter berbeda (jumlah/tipe).
// Method Overloading adalah ketika dua atau lebih method memiliki nama yang sama, tapi parameternya berbeda.

package com.tutorial;

class Hitung {
    int tambah(int a, int b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }
    double tambah(double a, double b) {
        return a + b;
    }
}

public class POLYMORPHISMOverLoading {
    public static void main(String[] args) {
        Hitung hitung = new Hitung();
        System.out.println("hitung.tambah(5, 10): " + hitung.tambah(5, 10)); // Output: 15
        System.out.println("hitung.tambah(5, 10, 15): " + hitung.tambah(5, 10, 15)); // Output: 30
        System.out.println("hitung.tambah(5.5, 10.5): " + hitung.tambah(5.5, 10.5)); // Output: 16.0
    }
}
