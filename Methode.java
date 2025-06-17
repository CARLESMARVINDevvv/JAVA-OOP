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



    // #janganLupaTitikKoma && #errorAdalahSahabat
    // #janganLupaTitikKoma
    // #janganLupaTitikKoma
    // #janganLupaTitikKoma
    // #janganLupaTitikKoma
    // #carlesRajaKoding
    // #JawaJawaJawa
    //prit prit prit

    // using System;
    // class program
    // public static void main(String[] args) {
        //Console.WriteLine("Hello World")
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

//ada bahasa lain lagi gak
// assembly
// dart
// swift



//siap wak

// PHP
/*
<?php
    echo "Hello, World";
?>
 */

//Java
/*
class Program {
    static void main(String[] args) {
        System.out.println("Hello World");
    }
}
*/

//javascript
/*
console.log("Hello World")
*/

//C#
/*
using System;
class Program {
    static void main(String[] args) {
        Console.WriteLine("Hello World");
    }
}
*/

//C
/*
#include <stdio.h>

int main() {
    printf("Hello World");
    return 0;
}
*/

//C++
/*
#include <iostream>

int main() {
    std::cout << "Hello World";
    return 0;
}
*/

//Go
/*
package main

import "fmt"

func main() {
    fmt.Println("Hello World")
}
**/

//Python
/*
print("Hello World")
*/

//Rust
/*
fn main() {
    println!("Hello World");
}
*/

// kotlin
/*
fun main() {
    print("Hello, World")
}
 */