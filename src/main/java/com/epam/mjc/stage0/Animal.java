package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;


    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }


    public String getDescription() {

        String pawsWord = (numberOfPaws == 1) ? "paw" : "paws";

        String furPresence = hasFur ? "a" : "no";

        return String.format("This animal is mostly %s. It has %d %s and %s fur.",
                color, numberOfPaws, pawsWord, furPresence);
    }


    public static void main(String[] args) {

        Animal myAnimal = new Animal("brown", 4, true);

        System.out.println(myAnimal.getDescription());
    }
}
