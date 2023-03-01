package edu.skypro.homework.task1;

public class Main {
    /*Ссылка на задание https://skyengpublic.notion.site/2-2-51bc3d932e4f48d08fa7677d1127e779
    * Там картинка по которой нужно реализовать иерархию классов
    * В чем суть задания я не понял, просто реализовать иерархию или в довесок еще "переполнить
    * нашу коробку". Как ее переполнить без ввода доп переменной которой нет на картинке я не понял,
    * потому и ввел ее в классе Box: volumeAfterAdd.
    * Еще не понял для чего в классе Box нас просят создать войдовый метод, который принимает double
    * "+Box(double):void" возможно я опять что-то не так понял, так как вводит в заблуждение Box
    * с большой буквы */
    public static void main(String[] args) {
        Box box = new Box(100);

        Pyramid pyramid = new Pyramid(50, 10, 5);
        Cylinder cylinder = new Cylinder(40, 10, 8);
        Ball ball = new Ball(30, 15);

        System.out.println("box.add(pyramid) = " + box.add(pyramid));
        System.out.println("box.add(cylinder) = " + box.add(cylinder));
        System.out.println("box.add(ball) = " + box.add(ball));
    }
}
