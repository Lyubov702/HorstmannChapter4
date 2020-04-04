package com.mycode.shape;

public class Circle extends Shape {
    private double radius;
    private Point center;

    public Circle(Point center, double radius) {
        super(center);
        this.center = center;
        this.radius = radius;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
