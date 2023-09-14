package org.example.homework;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal owl = new Animal();
        owl.name = "Jr";
        owl.color = "Grey";
        owl.qty = new int[] {5, 4, 3};
        owl.sound = "who";

        Animal dog = new Animal();
       dog.name = "Chop";
       dog.color = "Black";
       dog.qty  = new int[] {15, 12, 10};
       dog.sound = "bark";

       Animal bat = new Animal();
       bat.name = "Batman";
       bat.color = "White";
       bat.qty = new int[] {20, 57, 100};
       bat.sound = "yell";

        dog.printAnimalName();
        dog.printAnimalSound();
        dog.printAnimalQty();

        owl.printAnimalName();
        owl.printAnimalSound();
        owl.printAnimalQty();

        bat.printAnimalName();
        bat.printAnimalSound();
        bat.printAnimalQty();


    }

}

