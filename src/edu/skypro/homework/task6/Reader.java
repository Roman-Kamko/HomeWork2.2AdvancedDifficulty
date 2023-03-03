package edu.skypro.homework.task6;

public class Reader {
    private String fullName;
    private int id;
    private String faculty;
    private String dateBirthday;
    private int phoneNum;

    public Reader(String fullName) {
        this.fullName = fullName;
    }

    public void takeBook(int bookQuantity) {
        System.out.println(fullName + " взял " + bookQuantity + " книгу");
    }
    public void takeBook(String bookName) {
        System.out.println(fullName + " взял книгу: " + bookName);
    }

    public void returnBook(int bookQuantity) {
        System.out.println(fullName + " вернул " + bookQuantity + " книгу");
    }
    public void returnBook(String bookName) {
        System.out.println(fullName + " вернул книгу: " + bookName);
    }
}
