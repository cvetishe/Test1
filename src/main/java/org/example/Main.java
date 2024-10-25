package org.example;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat("Mimi");
        System.out.println(cat.makeSound());
        Dog dog = new Dog("Sharik");
        System.out.println(dog.makeSound());
    }
}