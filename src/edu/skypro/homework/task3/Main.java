package edu.skypro.homework.task3;

public class Main {
    /*Создать класс Person, который содержит:
            - переменные fullName, age;
            - метод talk(), который выводит в консоль сообщение -"Person говорит".
            1. Добавьте два конструктора - Person() и Person(fullName, age).
            2. Создайте два объекта этого класса. Один объект инициализируется
            конструктором Person(), другой - Person(fullName, age).*/
    public static void main(String[] args) {
        Person firstPerson = new Person("Иванов Иван Иванович", 58);
        Person secondPerson = new Person();
    }
}
