package edu.skypro.homework.task5;

public class Dog extends Animal{
    private int guards;

    public int getGuards() {
        return guards;
    }

    public void setGuards(int guards) {
        this.guards = guards;
    }

    public Dog(String name, String location, int guards) {
        super(name, location);
        this.guards = guards;
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав Гав Гав");
    }
}
