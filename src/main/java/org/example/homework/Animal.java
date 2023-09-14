package org.example.homework;

public class Animal {
  public String name;
   public String color;
   public int[] qty;

   public String sound;
   public void printAnimalSound(){
       System.out.println(sound);
   };
public void printAnimalName(){
    System.out.println(name);
}

public void printAnimalQty() {
    for (int x = 0; x < qty.length; x++) {
        System.out.println(qty[x]);
    }
}
}

