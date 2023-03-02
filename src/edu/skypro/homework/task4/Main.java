package edu.skypro.homework.task4;

public class Main {
    /*Создать класс "Матрица", в котором содержатся следующие переменные:
            1. двумерный массив вещественных чисел;
            2. количество строк и столбцов в матрице.
      В Классе должны быть реализованы методы:
            1. сложение с другой матрицей;
            2. умножение на число;
            3. вывод в консоль.*/
    public static void main(String[] args) {
        Matrix firstArr = new Matrix(3, 3);
        firstArr.fillRandom();
        firstArr.printArr();
    }
}
