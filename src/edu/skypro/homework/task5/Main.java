package edu.skypro.homework.task5;

public class Main {
    /*1. Создать класс`Animal`и расширяющие его классы`Dog`,`Cat`,`Horse`.
    2. Класс`Animal`содержит переменные`food`,`location`и методы`makeNoise`,`eat`,`sleep`.      "опечатка? не food а name?"
    3. Метод`makeNoise` выводит в консоль "Животное ... (подставить нужное) спит".              "видимо опечатка метод sleep имеют ввиду"
    4. `Dog`,`Cat`,`Horse`переопределяют методы`makeNoise`,`eat`.
    5. Добавьте переменные в классы`Dog`,`Cat`,`Horse`, характеризующие только этих животных.
    6. Создайте класс`Ветеринар`, в котором определите метод`void treatAnimal(Animal animal)`*.*
    Данный метод выводит в консоль`food`и`location`пришедшего на прием животного.
    7. В методе`main`создайте массив типа`Animal`, в который запишите животных всех имеющихся
    у вас типов. В цикле отправляйте их на прием к ветеринару.*/
    public static void main(String[] args) {
        Cat cat = new Cat("Мурка", "Дом", 7);
        Dog dog = new Dog("Палкан", "Будка", 12);
        Horse horse = new Horse("Зорька", "Конюшня", 10);

        cat.makeNoise();
        cat.eat();
        cat.sleep();
        dog.makeNoise();
        dog.eat();
        dog.sleep();
        horse.makeNoise();
        horse.eat();
        horse.sleep();

        Vet vet = new Vet();

        Animal[] animals = {cat, dog, horse};
        for (int i = 0; i < animals.length; i++) {
            vet.treatAnimal(animals[i]);
        }
    }
}
