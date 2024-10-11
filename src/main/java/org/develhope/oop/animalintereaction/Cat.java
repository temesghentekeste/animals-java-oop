package org.develhope.oop.animalintereaction;

public class Cat extends  SimpleAnimal {
    public Cat(String name) {
        super(name);
    }

    public  void meow() {
        System.out.println(getName() + " is meowing!");
    }
}
