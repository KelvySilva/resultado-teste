package com.resultado.teste.com.resultado.teste.com.resultado.teste.model;

public class Point {

    private int value;
    private int position;

    public Point(int value, int position) {
        this.value = value;
        this.position = position;
    }

    public static Point newInstance(int value, int position) {
        return new Point(value, position);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getValue() {

        return value;
    }


}
