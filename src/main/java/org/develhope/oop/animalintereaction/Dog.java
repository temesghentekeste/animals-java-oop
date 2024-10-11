package org.develhope.oop.animalintereaction;

public class Dog extends  SimpleAnimal {
    public Dog(String name) {
        super(name);
    }

    public  void bark() {
        System.out.println(getName() + " is barking!");
    }
}
