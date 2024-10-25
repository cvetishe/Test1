package org.example;

public abstract class Pet {
    String name;


    public Pet(String name) {
        this.name = name;
    }

    public abstract String makeSound();
}
