package com.mycode.shape;

public class Line extends Shape {
    private Point from;
    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.from = from;
        this.to = to;
    }
    @Override
    public Point getCenter() {
        Point point = new Point((from.getX() + to.getX())/ 2,
                (from.getY() + to.getY())/ 2);
        return point;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Line{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
