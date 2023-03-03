package edu.skypro.homework.task2;

public abstract class SolidOfRevolution extends Shape implements HaveRadius {
    private double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }
}
