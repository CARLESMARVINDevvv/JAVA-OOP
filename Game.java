package com.tutorial;

//Player
class Player{
    String nama;
    double health;
    int level;
//    object member
    Weapon weapon;
    Armor armor;

    Player(String nama, double health){
        this.nama = nama;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipdefence(Armor armor){
        this.armor = armor;
    }

    void show(){
        System.out.println("name : " + this.nama);
        System.out.println("Healt " + this.health + "hp");
        this.armor.show();

    }
}


//Senjata
class Weapon{
    double attackPower;
    String name;
    Weapon( String name,double attackPower) {
        this.attackPower = attackPower;
        this.name = name;
    }
    void show(){
        System.out.println("Wepon : " + this.name + "Attack :" + this.attackPower);
    }
}

// Armr
class Armor{
    double defencePower;
    String name;

    Armor( String name, double defencePower) {
        this.defencePower = defencePower;
        this.name = name;
    }


    void show(){
        System.out.println("armor : " + this.name + "defence :" + this.defencePower);
    }
}

public class Game {
    public static void main(String[] args) {
//        membuat obect player
        Player player1 = new Player("ucup", 100);
//        but objec weaopn
        Weapon pedang = new Weapon("Pedang",15);
//        object armor
        Armor BajuBesi = new Armor("Baju Besi",100);

//        equip senjata armor
        player1.equipWeapon(pedang);
        player1.equipdefence(BajuBesi);

        player1.weapon.show();
        player1.armor.show();

    }
}
