package com.tutorial;

class Playerr {
    String name;
    public int exp; //public sama dengan default bisa di baca dan tulis di luar class
    private int Health; // private hanya bisa diakses dalam class  baik di baca dan di tulis

    Playerr(String name, int exp, int health) {
        this.name = name;
        this.exp = 0; // Inisialisasi exp
        this.Health = health; // Inisialisasi Health
    }
    
    // Getter untuk Health
    public int getHealth() {
        return Health;
    }
    // Setter untuk Health
    public void setHealth(int health) {
        this.Health = health;
    }
}

public class PublicAndPrivateKeyword {
    public static void main(String[] args) {
        Playerr player1 = new Playerr("Charles", 100, 100);

        // Default
        System.out.println("Player Name: " + player1.name);
        player1.name = "Marni"; //membaca data/Ubah
        System.out.println("Updated Player Name: " + player1.name);

        // Public
        System.out.println("Player Xp: " + player1.exp);
        player1.exp = 100; // membaca data/Ubah
        System.out.println("Updated Player Exp: " + player1.exp);

        // Private
        System.out.println("Player Health: " + player1.getHealth());
        player1.setHealth(500);  // membaca data/Ubah
        System.out.println("Updated Player Exp: " + player1.getHealth());

    }
}
