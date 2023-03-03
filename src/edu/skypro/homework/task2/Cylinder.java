package edu.skypro.homework.task2;

public class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(double volume, double radius, double height) {
        super(volume, radius);
        this.height = height;
    }
}
