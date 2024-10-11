package org.develhope.oop.animalintereaction;

import java.util.*;

/*
Implement the feed method. It should ask for the food provided and store the feeding interaction in a list.
Implement the play method. When called, it should store "play interaction" in the interaction history.
Implement the showInteractionHistory method to display all interactions with the animal (both feedings and play sessions).
Store interaction history using an appropriate data structure, like an ArrayList<String>.
 */
public abstract class SimpleAnimal implements AnimalInteraction{
    private final Scanner scanner = new Scanner(System.in);
    Map<String, List<String>> intereactions = new HashMap<>();
    private String name;

    public SimpleAnimal(String name) {
        this.name = name;
    }

    @Override
    public void showInteractionHistory() {
        System.out.print("Enter (1. Play 2. Food) to see respective interaction: ");
        String key = scanner.nextLine();
        showInteractionHistory(key);
    }

    public void showInteractionHistory(String key) {
        System.out.println(key + " intereactions for " + name + ": ");
        List<String> intreractionList = intereactions.get(key);
        for (int i = 0; i < intreractionList.size(); i++) {
            System.out.println((i+1) + ". " + intreractionList.get(i));

        }
    }

    @Override
    public void play() {
        System.out.print("Enter a game to play: ");
        String game = scanner.nextLine();
        if(!intereactions.containsKey("play")) {
            intereactions.put("play", new ArrayList<>());
        }
        intereactions.get("play").add(game);

    }

    @Override
    public void feed(String food) {
        if(!intereactions.containsKey("play")) {
            intereactions.put("feed", new ArrayList<>());
        }
        intereactions.get("feed").add(food);
    }

    public void feed() {
        System.out.print("Enter a food to eat: ");
        String food = scanner.nextLine();
        if(!intereactions.containsKey("play")) {
            intereactions.put("feed", new ArrayList<>());
        }

    }


}
