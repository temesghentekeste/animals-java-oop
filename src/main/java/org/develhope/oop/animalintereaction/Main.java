package org.develhope.oop.animalintereaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnimalInteraction dog = new Dog("Lucy");
        ((Dog) dog).bark();
        dog.play();
        dog.play();

        ((Dog) dog).feed();
        ((Dog) dog).feed();
        dog.showInteractionHistory();


    }
}