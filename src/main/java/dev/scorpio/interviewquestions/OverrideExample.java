package dev.scorpio.interviewquestions;

public class OverrideExample {
    public static void main(String[] args) {
        System.out.println("override example..");
        Animal animal = new Animal();
        animal.makeSound();
        System.out.println(animal.age);
        Dog dog = new Dog();
        dog.makeSound();
        System.out.println(dog.age);
    }
}

class Animal
{
    int age = 100;
    public void makeSound()
    {
        System.out.println("Animal makes a sound..");
    }
}

class Dog extends Animal{
    int age = 20;
    @Override
    public void makeSound() {
        System.out.println("Dog Barks..");
    }
}
