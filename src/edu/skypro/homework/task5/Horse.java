package edu.skypro.homework.task5;

public class Horse extends Animal {
    private int carries;

    public int getCarries() {
        return carries;
    }

    public void setCarries(int carries) {
        this.carries = carries;
    }

    public Horse(String name, String location, int carries) {
        super(name, location);
        this.carries = carries;
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }

    @Override
    public void makeNoise() {
        System.out.println("Игого Игого Игого");
    }
}
