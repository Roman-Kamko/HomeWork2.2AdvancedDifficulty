package edu.skypro.homework.task2;

public class Box extends Shape{
    private double volumeAfterAdd;

    public Box(double volume) {
        super(volume);
    }

    boolean add(Shape shape) {
        volumeAfterAdd += shape.getVolume();
        return volumeAfterAdd < getVolume();
    }
}
