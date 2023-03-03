package edu.skypro.homework.task5;

public abstract class Animal {
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Animal(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public void sleep() {
        System.out.println("Животное " + name + " спит");
    }
}
