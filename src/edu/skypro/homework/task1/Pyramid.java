package edu.skypro.homework.task1;

public class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double volume, double s, double h) {
        super(volume);
        this.s = s;
        this.h = h;
    }
}
