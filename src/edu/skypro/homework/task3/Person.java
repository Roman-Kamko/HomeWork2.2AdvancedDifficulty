package edu.skypro.homework.task3;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }

    public void talk() {
        System.out.println("Person говорит");
    }
}
