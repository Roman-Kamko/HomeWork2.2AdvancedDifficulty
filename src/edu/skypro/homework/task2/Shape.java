package edu.skypro.homework.task2;

public abstract class Shape implements HaveVolume {
    private double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
