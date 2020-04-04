package com.mycode.shape;

public class Rectangle extends Shape {
    private double width;
    private double height;
    private Point topLeft;

    public Rectangle(double width, double height, Point topLeft) {
        super(topLeft);
        this.width = width;
        this.height = height;
        this.topLeft = topLeft;
    }

    @Override
    public Point getCenter() {
        return new Point(topLeft.getX() + (width / 2), topLeft.getY() + (height / 2));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", topLeft=" + topLeft +
                '}';
    }
}
