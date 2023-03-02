package edu.skypro.homework.task4;

public class Matrix {
    private double[][] doubles;
    private int line;
    private int column;

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public void setElements(int line, int column, double value) {
        doubles[line][column] = value;
    }

    public double getElements(int line, int column) {
        return doubles[line][column];
    }

    public Matrix(int line, int column) {
        doubles = new double[line][column];
        this.line = line;
        this.column = column;
    }

    public void fillRandom() {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                setElements(i, j, Math.random());
            }
        }
    }

    public void printArr() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                sb.append(getElements(i, j));
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }


}
