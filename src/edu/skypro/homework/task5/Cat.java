package edu.skypro.homework.task5;

public class Cat extends Animal {

    private int catchesMice;

    public int getCatchesMice() {
        return catchesMice;
    }

    public void setCatchesMice(int catchesMice) {
        this.catchesMice = catchesMice;
    }

    public Cat(String name, String location, int catchesMice) {
        super(name, location);
        this.catchesMice = catchesMice;
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу Мяу Мяу");
    }
}
