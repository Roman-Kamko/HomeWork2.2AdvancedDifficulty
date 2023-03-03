package edu.skypro.homework.task2;

public class Main {
    /*Реализуйте ту же иерархию классов, но использовав интерфейсы.
    * Не понял для чего тут использовать интерфейсы(т.к. ничего кроме
    * геттеров я им отдать не могу), но раз условие того требует...*/
    public static void main(String[] args) {
        Box box = new Box(100);

        Cylinder cylinder = new Cylinder(63, 15, 20);
        Ball ball = new Ball(23, 10);
        Pyramid pyramid = new Pyramid(34, 15, 30);

        System.out.println("box.add(cylinder) = " + box.add(cylinder)); // true
        System.out.println("box.add(ball) = " + box.add(ball));         // true
        System.out.println("box.add(pyramid) = " + box.add(pyramid));   // false, места больше нет

        System.out.println("ball.getVolume() = " + ball.getVolume());
        System.out.println("ball.getRadius() = " + ball.getRadius());
    }
}
