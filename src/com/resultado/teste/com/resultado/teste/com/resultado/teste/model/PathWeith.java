package com.resultado.teste.com.resultado.teste.com.resultado.teste.model;

public class PathWeith {

    public Point xPoint;
    public Point yPoint;

    public PathWeith(Point xPoint, Point yPoint) {
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    public int getDistance(){
        return yPoint.getPosition()-xPoint.getPosition();

    }
}
